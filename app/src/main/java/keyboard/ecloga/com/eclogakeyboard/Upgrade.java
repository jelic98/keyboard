package keyboard.ecloga.com.eclogakeyboard;

import android.app.AlertDialog;
import android.content.DialogInterface;
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


import android.widget.EditText;
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
            new AlertDialog.Builder(Upgrade.this)
                    .setTitle("Already upgraded")
                    .setMessage("You've already upgraded to premium version and you're awesome you don't have to enter the code again in order to see the message which says that you are awesome.")
                    .setPositiveButton(android.R.string.yes, null)
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
                    final EditText input = new EditText(Upgrade.this);
                    new AlertDialog.Builder(Upgrade.this)
                            .setTitle("Be awesome")
                            .setMessage("Please input activation code you received by email or friend")
                            .setView(input)
                            .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                    String code = input.getText().toString();

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
                            .setNegativeButton("Back", null)
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
