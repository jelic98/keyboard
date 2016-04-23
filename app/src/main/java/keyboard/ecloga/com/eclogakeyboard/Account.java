package keyboard.ecloga.com.eclogakeyboard;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.util.Base64;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;
import com.afollestad.materialdialogs.MaterialDialog;
import com.nispok.snackbar.Snackbar;
import com.nispok.snackbar.SnackbarManager;
import java.io.IOException;
import de.hdodenhof.circleimageview.CircleImageView;

public class Account extends ActionBarActivity{
    private Toolbar toolbar;
    private CircleImageView profile_image;
    private TextView name;
    private CardView logout, saveData, loadData;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account);

        overridePendingTransition(R.anim.activity_open, R.anim.activity_close);

        checkStoreItems();

        final String[] dataToSave = new String[30];

        dataToSave[1] = Preferences.getDefaults("link", getApplicationContext());
        dataToSave[2] = Preferences.getDefaults("prilang", getApplicationContext());
        dataToSave[3] = Preferences.getDefaults("seclang", getApplicationContext());
        dataToSave[4] = Preferences.getDefaults("premium", getApplicationContext());
        dataToSave[5] = Preferences.getDefaults("store", getApplicationContext());
        dataToSave[6] = Preferences.getDefaults("size", getApplicationContext());
        dataToSave[7] = Preferences.getDefaults("sound_v", getApplicationContext());
        dataToSave[8] = Preferences.getDefaults("sound_c", getApplicationContext());
        dataToSave[9] = Preferences.getDefaults("sound_h", getApplicationContext());
        dataToSave[10] = Preferences.getDefaults("bgcolor", getApplicationContext());
        dataToSave[11] = Preferences.getDefaults("autocapitalize", getApplicationContext());
        dataToSave[12] = Preferences.getDefaults("volumebuttons", getApplicationContext());
        dataToSave[13] = Preferences.getDefaults("allcaps", getApplicationContext());
        dataToSave[14] = Preferences.getDefaults("autospacing", getApplicationContext());
        dataToSave[15] = Preferences.getDefaults("changekeyboard", getApplicationContext());
        dataToSave[16] = Preferences.getDefaults("shakedelete", getApplicationContext());
        dataToSave[17] = Preferences.getDefaults("doublespace", getApplicationContext());
        dataToSave[18] = Preferences.getDefaults("popup", getApplicationContext());
        dataToSave[19] = Preferences.getDefaults("oppositecase", getApplicationContext());
        dataToSave[20] = Preferences.getDefaults("keypresscounter1", getApplicationContext());
        dataToSave[21] = Preferences.getDefaults("keypresscounter2", getApplicationContext());
        dataToSave[22] = Preferences.getDefaults("keypresscounter3", getApplicationContext());
        dataToSave[23] = Preferences.getDefaults("time1", getApplicationContext());
        dataToSave[24] = Preferences.getDefaults("time2", getApplicationContext());
        dataToSave[25] = Preferences.getDefaults("time3", getApplicationContext());
        dataToSave[26] = Preferences.getDefaults("keypresses", getApplicationContext());
        dataToSave[27] = Preferences.getDefaults("time", getApplicationContext());
        dataToSave[28] = Preferences.getDefaults("voiceinput", getApplicationContext());
        dataToSave[29] = Preferences.getDefaults("vibration", getApplicationContext());

        new MaterialDialog.Builder(Account.this)
                .title("Why we need your account?")
                .titleColor(getResources().getColor(R.color.gray))
                .contentColor(getResources().getColor(R.color.gray))
                .positiveColor(getResources().getColor(R.color.primary))
                .backgroundColor(getResources().getColor(R.color.white))
                .content("When you use another device just log in and you're ready to be awesome again, because your settings and themes will be synced.")
                .positiveText("Ok")
                .show();

        profile_image = (CircleImageView) findViewById(R.id.profile_image);
        profile_image.setImageBitmap(
                StringToBitmap(Preferences.getDefaults("profile_img", getApplicationContext())));

        profile_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;

                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.click_zoom_out);
                profile_image.startAnimation(anim);

                Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibe.vibrate(50);

                if (counter >= 3) {
                    SnackbarManager.show(
                            Snackbar.with(getApplicationContext())
                                    .text("Are you satisfied?")
                                    .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                    .color(getResources().getColor(R.color.accent))
                                    .textColor(getResources().getColor(R.color.gray))
                            , Account.this);
                }
            }
        });

        name = (TextView) findViewById(R.id.name);
        name.setText(Preferences.getDefaults("name", getApplicationContext()));

        logout = (CardView) findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.click);
                logout.startAnimation(anim);

                Preferences.setDefaults("login", "false", getApplicationContext());

                Intent intent = new Intent(Account.this, Home.class);
                startActivity(intent);
                Account.this.finish();
            }
        });

        saveData = (CardView) findViewById(R.id.saveData);
        saveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.click);
                saveData.startAnimation(anim);

                boolean intCon = SyncDatabase.hasActiveInternetConnection(getApplicationContext());

                if(intCon) {
                    if(Preferences.getDefaults("login", getApplicationContext()).equals("true")) {
                        try {
                            SyncDatabase.setToDB(dataToSave);
                        }catch (IOException e) {}

                        SnackbarManager.show(
                                Snackbar.with(getApplicationContext())
                                        .text("Successfully saved data")
                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                        .color(getResources().getColor(R.color.accent))
                                        .textColor(getResources().getColor(R.color.gray))
                                , Account.this);
                    }else {
                        SnackbarManager.show(
                                Snackbar.with(getApplicationContext())
                                        .text("You are not logged in")
                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                        .color(getResources().getColor(R.color.accent))
                                        .textColor(getResources().getColor(R.color.gray))
                                , Account.this);
                    }
                }else {
                    SnackbarManager.show(
                            Snackbar.with(getApplicationContext())
                                    .text("No internet connection")
                                    .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                    .color(getResources().getColor(R.color.accent))
                                    .textColor(getResources().getColor(R.color.gray))
                            , Account.this);
                }
            }
        });

        loadData = (CardView) findViewById(R.id.loadData);
        loadData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.click);
                loadData.startAnimation(anim);

                boolean intCon = SyncDatabase.hasActiveInternetConnection(getApplicationContext());

                if(intCon) {
                    if(Preferences.getDefaults("login", getApplicationContext()).equals("true")) {
                        try {
                            String theResponse = SyncDatabase.getFromDB(Preferences.getDefaults("link"
                                    , getApplicationContext()));

                            String link = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String prilang = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String seclang = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String premium = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String store = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String size = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String sound_v = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String sound_c = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String sound_h = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String bgcolor = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String autocapitalize = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String volumebuttons = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String allcaps = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String autospacing = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String changekeyboard = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String shakedelete = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String doublespace = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String popup = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String oppositecase = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String keypresscounter1 = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String keypresscounter2 = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String keypresscounter3 = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String time1 = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String time2 = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String time3 = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String keypresses = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String time = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String voiceinput = theResponse.substring(0, theResponse.indexOf(" "));
                            theResponse = theResponse.substring(theResponse.indexOf(" ") + 1);

                            String vibration = theResponse.substring(0, theResponse.length() - 1);

                            Preferences.setDefaults("link", link, getApplicationContext());
                            Preferences.setDefaults("prilang", prilang, getApplicationContext());
                            Preferences.setDefaults("seclang", seclang, getApplicationContext());
                            Preferences.setDefaults("premium", premium, getApplicationContext());
                            Preferences.setDefaults("store", store, getApplicationContext());
                            Preferences.setDefaults("size", size, getApplicationContext());
                            Preferences.setDefaults("sound_v", sound_v, getApplicationContext());
                            Preferences.setDefaults("sound_c", sound_c, getApplicationContext());
                            Preferences.setDefaults("sound_h", sound_h, getApplicationContext());
                            Preferences.setDefaults("bgcolor", bgcolor, getApplicationContext());
                            Preferences.setDefaults("autocapitalize", autocapitalize, getApplicationContext());
                            Preferences.setDefaults("volumebuttons", volumebuttons, getApplicationContext());
                            Preferences.setDefaults("allcaps", allcaps, getApplicationContext());
                            Preferences.setDefaults("autospacing", autospacing, getApplicationContext());
                            Preferences.setDefaults("changekeyboard", changekeyboard, getApplicationContext());
                            Preferences.setDefaults("shakedelete", shakedelete, getApplicationContext());
                            Preferences.setDefaults("doublespace", doublespace, getApplicationContext());
                            Preferences.setDefaults("popup", popup, getApplicationContext());
                            Preferences.setDefaults("oppositecase", oppositecase, getApplicationContext());
                            Preferences.setDefaults("keypresscounter1", keypresscounter1, getApplicationContext());
                            Preferences.setDefaults("keypresscounter2", keypresscounter2, getApplicationContext());
                            Preferences.setDefaults("keypresscounter3", keypresscounter3, getApplicationContext());
                            Preferences.setDefaults("time1", time1, getApplicationContext());
                            Preferences.setDefaults("time2", time2, getApplicationContext());
                            Preferences.setDefaults("time3", time3, getApplicationContext());
                            Preferences.setDefaults("keypresses", keypresses, getApplicationContext());
                            Preferences.setDefaults("time", time, getApplicationContext());
                            Preferences.setDefaults("voiceinput", voiceinput, getApplicationContext());
                            Preferences.setDefaults("vibration", vibration, getApplicationContext());

                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Successfully loaded data")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , Account.this);
                        } catch (IOException e) {}
                    }else {
                        SnackbarManager.show(
                                Snackbar.with(getApplicationContext())
                                        .text("You are not logged in")
                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                        .color(getResources().getColor(R.color.accent))
                                        .textColor(getResources().getColor(R.color.gray))
                                , Account.this);
                    }
                }else {
                    SnackbarManager.show(
                            Snackbar.with(getApplicationContext())
                                    .text("No internet connection")
                                    .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                    .color(getResources().getColor(R.color.accent))
                                    .textColor(getResources().getColor(R.color.gray))
                            , Account.this);
                }
            }
        });

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);

        drawerFragment.setUp((DrawerLayout) findViewById(R.id.drawer_layout), toolbar);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, Home.class));
    }

    private Bitmap StringToBitmap(String encodedString){
        try{
            byte [] encodeByte = Base64.decode(encodedString, Base64.DEFAULT);
            Bitmap bitmap = BitmapFactory.decodeByteArray(encodeByte, 0, encodeByte.length);
            return bitmap;
        }catch(Exception e){
            e.getMessage();
            return null;
        }
    }

    private void checkStoreItems() {
        String store = "";

        for(int i = 1; i < 18; i++) {
            if(Preferences.getDefaults("pattern_" + i, getApplicationContext()).equals("true")) {
                store = store + "pattern_" + i + "*";
            }
        }

        for(int i = 1; i < 15; i++) {
            if(Preferences.getDefaults("nature_" + i, getApplicationContext()).equals("true")) {
                if(i == 14) {
                    store = store + "nature_" + i;
                }else {
                    store = store + "nature_" + i + "*";
                }
            }
        }

        Preferences.setDefaults("store", store, getApplicationContext());
    }
}
