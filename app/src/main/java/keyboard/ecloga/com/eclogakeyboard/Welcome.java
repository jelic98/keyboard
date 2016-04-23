package keyboard.ecloga.com.eclogakeyboard;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Base64;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.ProfileTracker;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.model.people.Person;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Welcome extends Activity implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    private CallbackManager mCallbackManager;
    private AccessTokenTracker accessTokenTracker;
    private ProfileTracker profileTracker;
    private Bitmap bitmap;

    private static final int RC_SIGN_IN = 0;
    public static GoogleApiClient mGoogleApiClient;
    private boolean mIntentInProgress;
    private boolean mSignInClicked;
    private ConnectionResult mConnectionResult;
    private SignInButton btnSignIn;
    String personName;
    String personPhotoUrl;
    String link;

    private FacebookCallback<LoginResult> mCallback = new FacebookCallback<LoginResult>() {
        @Override
        public void onSuccess(LoginResult loginResult) {
            AccessToken accessToken = loginResult.getAccessToken();

            accessTokenTracker = new AccessTokenTracker() {
                @Override
                protected void onCurrentAccessTokenChanged(AccessToken accessToken, AccessToken accessToken1) {

                }
            };
            accessTokenTracker.startTracking();

            profileTracker = new ProfileTracker() {
                @Override
                protected void onCurrentProfileChanged(Profile profile, Profile profile1) {

                }
            };
            profileTracker.startTracking();

            Profile profile = Profile.getCurrentProfile();
            if (profile != null) {
                Preferences.setDefaults("login", "true", getApplicationContext());

                Preferences.setDefaults("name",
                        String.valueOf(profile.getFirstName()),
                        getApplicationContext());


                Preferences.setDefaults("link",
                        String.valueOf(profile.getLinkUri()),
                        getApplicationContext());

                StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
                StrictMode.setThreadPolicy(policy);

                try {
                    URL image_value = new URL("https://graph.facebook.com/" +
                            loginResult.getAccessToken().getUserId() +
                            "/picture?type=large");
                    try {
                        bitmap = BitmapFactory.decodeStream(image_value.openConnection().getInputStream());
                        ByteArrayOutputStream bs = new ByteArrayOutputStream();
                        bitmap.compress(Bitmap.CompressFormat.PNG, 50, bs);
                        String profile_img = BitmapToString(bitmap);
                        Preferences.setDefaults("profile_img", profile_img, getApplicationContext());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }

                LoginManager.getInstance().logOut();

                Intent intent = new Intent(Welcome.this, Home.class);
                startActivity(intent);
                Welcome.this.finish();
            }
        }

        @Override
        public void onCancel() {
            Intent intent = new Intent(Welcome.this, FailedLogin.class);
            startActivity(intent);
            Welcome.this.finish();
        }

        @Override
        public void onError(FacebookException e) {
            Intent intent = new Intent(Welcome.this, FailedLogin.class);
            startActivity(intent);
            Welcome.this.finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(this.getApplicationContext());
        setContentView(R.layout.welcome);

        btnSignIn = (SignInButton) findViewById(R.id.sign_in_button);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signInWithGplus();
            }
        });

        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(Plus.API, new Plus.PlusOptions.Builder().build())
                .addScope(Plus.SCOPE_PLUS_LOGIN).build();


        LoginButton loginButton = (LoginButton) findViewById(R.id.login_button);
        loginButton.setReadPermissions("public_profile");
        loginButton.setReadPermissions("email");

        mCallbackManager = CallbackManager.Factory.create();
        loginButton.registerCallback(mCallbackManager, mCallback);

        final TextView tvSkip = (TextView) findViewById(R.id.tvSkip);
        tvSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Preferences.setDefaults("login", "false", getApplicationContext());

                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.click_zoom_out);
                tvSkip.startAnimation(anim);

                Intent intent = new Intent(Welcome.this, Home.class);
                startActivity(intent);
                Welcome.this.finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        mGoogleApiClient.connect();
    }

    @Override
    protected void onStop() {
        super.onStop();

        if (accessTokenTracker != null && profileTracker != null) {
            accessTokenTracker.stopTracking();
            profileTracker.stopTracking();
        }

        if (mGoogleApiClient.isConnected()) {
            mGoogleApiClient.disconnect();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        mCallbackManager.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RC_SIGN_IN) {
            if (resultCode != RESULT_OK) {
                mSignInClicked = false;
            }

            mIntentInProgress = false;

            if (!mGoogleApiClient.isConnecting()) {
                mGoogleApiClient.connect();
            }
        }
    }

    private String BitmapToString(Bitmap bitmap) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();
        String temp = Base64.encodeToString(b, Base64.DEFAULT);
        return temp;
    }

    @Override
    public void onConnectionSuspended(int i) {
        Intent intent = new Intent(Welcome.this, FailedLogin.class);
        startActivity(intent);
        Welcome.this.finish();
    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {
        if (!connectionResult.hasResolution()) {
            GooglePlayServicesUtil.getErrorDialog(connectionResult.getErrorCode(), this,
                    0).show();
            return;
        }

        if (!mIntentInProgress) {
            mConnectionResult = connectionResult;

            if (mSignInClicked) {
                resolveSignInError();
            }
        }
    }

    private void signInWithGplus() {
        if (!mGoogleApiClient.isConnecting()) {
            mSignInClicked = true;
            resolveSignInError();
        }
    }

    private void resolveSignInError() {
        if(mConnectionResult != null) {
            if (mConnectionResult.hasResolution()) {
                try {
                    mIntentInProgress = true;
                    mConnectionResult.startResolutionForResult(this, RC_SIGN_IN);
                } catch (IntentSender.SendIntentException e) {
                    mIntentInProgress = false;
                    mGoogleApiClient.connect();
                }
            }
        }
    }

    @Override
    public void onConnected(Bundle bundle) {
        mSignInClicked = false;
        getProfileInformation();

        if((personName != null && !personName.isEmpty()) && (link != null && !link.isEmpty())) {
            String name = personName.substring(0, personName.indexOf(" "));

            Preferences.setDefaults("name", name, getApplicationContext());
            Preferences.setDefaults("link", link, getApplicationContext());
            Preferences.setDefaults("login", "true", getApplicationContext());

            signOutFromGplus();

            Intent intent = new Intent(Welcome.this, Home.class);
            startActivity(intent);
            Welcome.this.finish();
        }
    }

    private class LoadProfileImage extends AsyncTask<String, Void, Bitmap> {

        public LoadProfileImage() {

        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            ByteArrayOutputStream bs = new ByteArrayOutputStream();
            result.compress(Bitmap.CompressFormat.PNG, 50, bs);
            String profile_img = BitmapToString(result);
            Preferences.setDefaults("profile_img", profile_img, getApplicationContext());
        }
    }

    private void getProfileInformation() {
        try {
            if (Plus.PeopleApi.getCurrentPerson(mGoogleApiClient) != null) {
                Person currentPerson = Plus.PeopleApi
                        .getCurrentPerson(mGoogleApiClient);
                personName = currentPerson.getDisplayName();
                personPhotoUrl = currentPerson.getImage().getUrl();
                link = currentPerson.getUrl();

                personPhotoUrl = personPhotoUrl.substring(0,
                        personPhotoUrl.length() - 2)
                        + 400;

                new LoadProfileImage().execute(personPhotoUrl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void signOutFromGplus() {
        if (Welcome.mGoogleApiClient.isConnected()) {
            Plus.AccountApi.clearDefaultAccount(Welcome.mGoogleApiClient);
            Welcome.mGoogleApiClient.disconnect();
            Welcome.mGoogleApiClient.connect();
        }
    }
}


