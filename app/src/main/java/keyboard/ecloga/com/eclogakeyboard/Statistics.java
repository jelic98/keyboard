package keyboard.ecloga.com.eclogakeyboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.nispok.snackbar.Snackbar;
import com.nispok.snackbar.SnackbarManager;

public class Statistics extends ActionBarActivity{
    private Toolbar toolbar;
    private TextView tvChars, tvTime;
    private CardView cardView;
    private ImageView imageView1, imageView2;
    private int keyPresses, time;
    private String sKeyPresses, sTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stats);

        overridePendingTransition(R.anim.activity_open, R.anim.activity_close);

        keyPresses = Integer.valueOf(Preferences.getDefaults("keypresses", getApplicationContext()));
        time = Integer.valueOf(Preferences.getDefaults("time", getApplicationContext()));

        imageView1 = (ImageView) findViewById(R.id.imageView1);

        if(keyPresses <= 100) {
            imageView1.setImageResource(R.drawable.no_badge);
            sKeyPresses = "BRONZE: " + (101 - keyPresses) + " more";
        }else  if(keyPresses > 100 && keyPresses <= 1000) {
            imageView1.setImageResource(R.drawable.bronze);
            sKeyPresses = "SILVER: " + (1001 - keyPresses) + " more";
        }else  if(keyPresses > 1000 && keyPresses <= 10000) {
            imageView1.setImageResource(R.drawable.silver);
            sKeyPresses = "GOLD: " + (10001 - keyPresses) + " more";
        }else if(keyPresses > 1000) {
            imageView1.setImageResource(R.drawable.gold);
            sKeyPresses = "Congratulations!";
        }

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.click);
                imageView1.startAnimation(anim);

                SnackbarManager.show(
                        Snackbar.with(getApplicationContext())
                                .text(sKeyPresses)
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , Statistics.this);
            }
        });

        imageView2 = (ImageView) findViewById(R.id.imageView2);

        if(time <= 360) {
            imageView2.setImageResource(R.drawable.no_badge);
            sTime = "BRONZE: " + (361 - time) + "s more";
        }else  if(time > 360 && time <= 960) {
            imageView2.setImageResource(R.drawable.bronze);
            sTime = "SILVER: " + (961 - time) + "s more";Preferences.getDefaults("time", getApplicationContext());
        }else  if(time > 960 && time <= 3600) {
            imageView2.setImageResource(R.drawable.silver);
            sTime = "GOLD: " + (3600 - time) + "s more";
        }else if(time > 3600) {
            imageView2.setImageResource(R.drawable.gold);
            sTime = "Congratulations!";
        }

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.click);
                imageView2.startAnimation(anim);

                SnackbarManager.show(
                        Snackbar.with(getApplicationContext())
                                .text(sTime)
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , Statistics.this);
            }
        });

        cardView = (CardView) findViewById(R.id.cardView);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.click);
                cardView.startAnimation(anim);

                SnackbarManager.show(
                        Snackbar.with(getApplicationContext())
                                .text("Let's start again!")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , Statistics.this);

                Preferences.setDefaults("keypresscounter1", "false", getApplicationContext());
                Preferences.setDefaults("keypresscounter2", "false", getApplicationContext());
                Preferences.setDefaults("keypresscounter3", "false", getApplicationContext());
                Preferences.setDefaults("keypresses", "0", getApplicationContext());
                tvChars.setText("0");

                Preferences.setDefaults("time1", "true", getApplicationContext());
                Preferences.setDefaults("time2", "true", getApplicationContext());
                Preferences.setDefaults("time3", "true", getApplicationContext());
                Preferences.setDefaults("time", "0", getApplicationContext());
                tvTime.setText("0");
            }
        });

        tvChars = (TextView) findViewById(R.id.tvChars);
        tvChars.setText(Preferences.getDefaults("keypresses", getApplicationContext()));

        tvTime = (TextView) findViewById(R.id.tvTime);
        tvTime.setText(Preferences.getDefaults("time", getApplicationContext()) + "s");

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
}
