package keyboard.ecloga.com.eclogakeyboard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.afollestad.materialdialogs.MaterialDialog;
import com.nispok.snackbar.Snackbar;
import com.nispok.snackbar.SnackbarManager;

public class Upgrade extends ActionBarActivity {

    private Toolbar toolbar;
    private CardView cvCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upgrade);

        overridePendingTransition(R.anim.activity_open, R.anim.activity_close);

        if(Preferences.getDefaults("premium", getApplicationContext()).equals("true")) {
            new MaterialDialog.Builder(Upgrade.this)
                    .title("Already upgraded")
                    .titleColor(getResources().getColor(R.color.gray))
                    .contentColor(getResources().getColor(R.color.gray))
                    .positiveColor(getResources().getColor(R.color.primary))
                    .backgroundColor(getResources().getColor(R.color.white))
                    .content("You've already upgraded to premium version and you're awesome you don't have to enter the code again in order to see the message which says that you are awesome.")
                    .positiveText("Ok")
                    .show();
        }

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cvCode = (CardView) findViewById(R.id.cvCode);
        cvCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.click);
                cvCode.startAnimation(anim);

                if(Preferences.getDefaults("premium", getApplicationContext()).equals("false")) {
                    new MaterialDialog.Builder(Upgrade.this)
                            .title("Be awesome")
                            .titleColor(getResources().getColor(R.color.gray))
                            .contentColor(getResources().getColor(R.color.gray))
                            .negativeColor(getResources().getColor(R.color.primary))
                            .positiveColor(getResources().getColor(R.color.primary))
                            .backgroundColor(getResources().getColor(R.color.white))
                            .content("Please input activation code you received by email or friend")
                            .inputType(InputType.TYPE_CLASS_TEXT)
                            .input(null, null, new MaterialDialog.InputCallback() {
                                @Override
                                public void onInput(MaterialDialog dialog, CharSequence input) {
                                    String code = String.valueOf(input);

                                    if(code.equals("bokanbratnajludji") ||
                                            code.equals("sofkaburaznajjaci") ||
                                            code.equals("dragomije") ||
                                            code.equals("awesomeness")) {
                                        Preferences.setDefaults("premium", "true", Upgrade.this);

                                        SnackbarManager.show(
                                                Snackbar.with(Upgrade.this)
                                                        .text("You are AWESOME!")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , Upgrade.this);
                                    }else {
                                        SnackbarManager.show(
                                                Snackbar.with(Upgrade.this)
                                                        .text("Invalid activation code.")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , Upgrade.this);
                                    }
                                }
                            })
                            .positiveText("Done")
                            .negativeText("Back")
                            .callback(new MaterialDialog.ButtonCallback() {
                                @Override
                                public void onPositive(MaterialDialog dialog) {

                                }
                            })
                            .show();
                }else {
                    SnackbarManager.show(
                            Snackbar.with(Upgrade.this)
                                    .text("You've already done this stuff")
                                    .color(R.color.white)
                                    .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                    .color(getResources().getColor(R.color.accent))
                                    .textColor(getResources().getColor(R.color.gray))
                            , Upgrade.this);
                }
            }
        });

        NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);

        drawerFragment.setUp((DrawerLayout) findViewById(R.id.drawer_layout), toolbar);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, Home.class));
    }
}
