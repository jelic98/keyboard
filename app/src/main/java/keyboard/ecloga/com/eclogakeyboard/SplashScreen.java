package keyboard.ecloga.com.eclogakeyboard;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends Activity {

    private long ms = 0;
    private long splashTime = 1000;
    private boolean splashActive = true;
    private boolean paused = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        ImageView logo = (ImageView) findViewById(R.id.logo);

        Animation anim = AnimationUtils.loadAnimation(this, R.anim.zoom);
        logo.startAnimation(anim);

        Thread mThread = new Thread() {
            public void run() {
                try {
                    while(splashActive && ms < splashTime) {
                        if(!paused) {
                            ms = ms + 100;
                        }

                        sleep(100);
                    }
                }catch(Exception e){

                }finally{
                    Intent intent = new Intent(SplashScreen.this, Home.class);
                    startActivity(intent);
                    finish();
                }
            }
        };

        mThread.start();
    }
}
