package keyboard.ecloga.com.eclogakeyboard;

        /**Copyright 2015 Ecloga Apps

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.*/

/*DEBUG OVER WI-FI <<SETUP>>
    cd C:\Users\Lazar\AppData\Local\Android\sdk\platform-tools
    adb devices
    adb usb
    adb tcpip 5555
    adb connect 192.168.0.11
    adb devices
*/

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.provider.*;
import android.util.Base64;
import android.util.Log;
import android.view.Display;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.voiceime.VoiceRecognitionTrigger;
import com.zeuxislo.emojikeyboard.EmojiKeyboardView;

import org.apache.commons.lang.StringEscapeUtils;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EclogaKeyboard extends InputMethodService implements KeyboardView.OnTouchListener, GestureDetector.OnDoubleTapListener, KeyboardView.OnKeyboardActionListener {

    private boolean vbListenerPause;
    private ShakeListener mShaker;
    private KeyboardView kv;
    private VoiceRecognitionTrigger mVoiceRecognitionTrigger;
    private MediaPlayer mp;
    private boolean printedCommaa;
    private String keypresscounter1, keypresscounter2, keypresscounter3,time1, time2, time3;
    private boolean swipe;
    private Keyboard keyboard, prilang, seclang, prilang_landscape, seclang_landscape;
    private boolean isOnClick;
    private float mDownX, mDownY;
    private boolean caps = true;
    private boolean printedDot;
    private int size;
    private boolean capsLock;
    private String sPrilang, sSeclang;
    private int keyPressCounter, time;
    private int doubleSpace = 0;
    private boolean printChar = false;
    private boolean bigCaps = false;
    CountDownTimer timer, tTime;
    private int doubleUp;
    private String orient, lang;
    private boolean
            autoCapitalize ,
            changeKeyboard,
            allCaps,
            volumeButtons,
            autoSpacing,
            oppositeCase,
            voiceInput,
            popupKeypress,
            shakeDelete,
            spaceDot;
    private int screen;
    private int emoji;
    private int number;
    private  boolean printedDifferent;
    private int eScreen;
    private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;
    GestureDetector mGestureDetector = new GestureDetector(new GestureListener());

    @Override
    public void onStartInputView(EditorInfo info, boolean restarting) {
        initializeKeyboard();
        onRotate();

        if (mVoiceRecognitionTrigger != null) {
            mVoiceRecognitionTrigger.onStartInputView();
        }

        vbListenerPause = false;

        if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("random")) {
            Random rand = new Random();

            int randInt = rand.nextInt(25);

            switch(randInt) {
                case 1:
                    kv.setBackgroundColor(getResources().getColor(R.color.white));
                    break;
                case 2:
                    kv.setBackgroundColor(getResources().getColor(R.color.black));
                    break;
                case 3:
                    kv.setBackgroundColor(getResources().getColor(R.color.purple));
                    break;
                case 4:
                    kv.setBackgroundColor(getResources().getColor(R.color.red));
                    break;
                case 5:
                    kv.setBackgroundColor(getResources().getColor(R.color.pink));
                    break;
                case 6:
                    kv.setBackgroundColor(getResources().getColor(R.color.blue));
                    break;
                case 7:
                    kv.setBackgroundColor(getResources().getColor(R.color.green));
                    break;
                case 8:
                    kv.setBackgroundColor(getResources().getColor(R.color.yellow));
                    break;
                case 9:
                    kv.setBackgroundColor(getResources().getColor(R.color.orange));
                    break;
                case 10:
                    kv.setBackgroundColor(getResources().getColor(R.color.grey));
                    break;
                case 11:
                    kv.setBackgroundColor(getResources().getColor(R.color.lightpurple));
                    break;
                case 12:
                    kv.setBackgroundColor(getResources().getColor(R.color.lightred));
                    break;
                case 13:
                    kv.setBackgroundColor(getResources().getColor(R.color.lightpink));
                    break;
                case 14:
                    kv.setBackgroundColor(getResources().getColor(R.color.lightblue));
                    break;
                case 15:
                    kv.setBackgroundColor(getResources().getColor(R.color.lightgreen));
                    break;
                case 16:
                    kv.setBackgroundColor(getResources().getColor(R.color.lightyellow));
                    break;
                case 17:
                    kv.setBackgroundColor(getResources().getColor(R.color.lightgrey));
                    break;
                case 18:
                    kv.setBackgroundColor(getResources().getColor(R.color.lightorange));
                    break;
                case 19:
                    kv.setBackgroundColor(getResources().getColor(R.color.darkpurple));
                    break;
                case 20:
                    kv.setBackgroundColor(getResources().getColor(R.color.darkorange));
                    break;
                case 21:
                    kv.setBackgroundColor(getResources().getColor(R.color.darkblue));
                    break;
                case 22:
                    kv.setBackgroundColor(getResources().getColor(R.color.darkgreen));
                    break;
                case 23:
                    kv.setBackgroundColor(getResources().getColor(R.color.darkred));
                    break;
                case 24:
                    kv.setBackgroundColor(getResources().getColor(R.color.darkyellow));
                    break;
                case 25:
                    kv.setBackgroundColor(getResources().getColor(R.color.darkpink));
                    break;
            }
        }

        else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("pattern_1")) {
            kv.setBackgroundResource(R.drawable.pattern_1);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("pattern_2")) {
            kv.setBackgroundResource(R.drawable.pattern_2);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("pattern_3")) {
            kv.setBackgroundResource(R.drawable.pattern_3);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("pattern_4")) {
            kv.setBackgroundResource(R.drawable.pattern_4);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("pattern_5")) {
            kv.setBackgroundResource(R.drawable.pattern_5);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("pattern_6")) {
            kv.setBackgroundResource(R.drawable.pattern_6);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("pattern_7")) {
            kv.setBackgroundResource(R.drawable.pattern_7);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("pattern_8")) {
            kv.setBackgroundResource(R.drawable.pattern_8);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("pattern_9")) {
            kv.setBackgroundResource(R.drawable.pattern_9);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("pattern_10")) {
            kv.setBackgroundResource(R.drawable.pattern_10);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("pattern_11")) {
            kv.setBackgroundResource(R.drawable.pattern_11);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("pattern_12")) {
            kv.setBackgroundResource(R.drawable.pattern_12);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("pattern_13")) {
            kv.setBackgroundResource(R.drawable.pattern_13);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("pattern_14")) {
            kv.setBackgroundResource(R.drawable.pattern_14);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("pattern_15")) {
            kv.setBackgroundResource(R.drawable.pattern_15);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("pattern_16")) {
            kv.setBackgroundResource(R.drawable.pattern_16);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("pattern_17")) {
            kv.setBackgroundResource(R.drawable.pattern_17);

        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("nature_1")) {
            kv.setBackgroundResource(R.drawable.nature_1);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("nature_2")) {
            kv.setBackgroundResource(R.drawable.nature_2);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("nature_3")) {
            kv.setBackgroundResource(R.drawable.nature_3);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("nature_4")) {
            kv.setBackgroundResource(R.drawable.nature_4);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("nature_5")) {
            kv.setBackgroundResource(R.drawable.nature_5);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("nature_6")) {
            kv.setBackgroundResource(R.drawable.nature_6);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("nature_7")) {
            kv.setBackgroundResource(R.drawable.nature_7);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("nature_8")) {
            kv.setBackgroundResource(R.drawable.nature_8);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("nature_9")) {
            kv.setBackgroundResource(R.drawable.nature_9);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("nature_10")) {
            kv.setBackgroundResource(R.drawable.nature_10);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("nature_11")) {
            kv.setBackgroundResource(R.drawable.nature_11);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("nature_12")) {
            kv.setBackgroundResource(R.drawable.nature_12);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("nature_13")) {
            kv.setBackgroundResource(R.drawable.nature_13);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("nature_14")) {
            kv.setBackgroundResource(R.drawable.nature_14);

        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("black")) {
            kv.setBackgroundColor(getResources().getColor(R.color.black));
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("white")) {
            kv.setBackgroundColor(getResources().getColor(R.color.white));

        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("transparent")) {
            kv.setBackgroundColor(getResources().getColor(R.color.transparent));

        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("gradient_1")) {
            kv.setBackgroundResource(R.drawable.gradient_1);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("gradient_2")) {
            kv.setBackgroundResource(R.drawable.gradient_2);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("gradient_3")) {
            kv.setBackgroundResource(R.drawable.gradient_3);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("gradient_4")) {
            kv.setBackgroundResource(R.drawable.gradient_4);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("gradient_5")) {
            kv.setBackgroundResource(R.drawable.gradient_5);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("gradient_6")) {
            kv.setBackgroundResource(R.drawable.gradient_6);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("gradient_7")) {
            kv.setBackgroundResource(R.drawable.gradient_7);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("gradient_8")) {
            kv.setBackgroundResource(R.drawable.gradient_8);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("gradient_9")) {
            kv.setBackgroundResource(R.drawable.gradient_9);
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("gradient_10")) {
            kv.setBackgroundResource(R.drawable.gradient_10);

        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("red")) {
            kv.setBackgroundColor(getResources().getColor(R.color.red));
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("pink")) {
            kv.setBackgroundColor(getResources().getColor(R.color.pink));
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("purple")) {
            kv.setBackgroundColor(getResources().getColor(R.color.purple));
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("blue")) {
            kv.setBackgroundColor(getResources().getColor(R.color.blue));
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("green")) {
            kv.setBackgroundColor(getResources().getColor(R.color.green));
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("yellow")) {
            kv.setBackgroundColor(getResources().getColor(R.color.yellow));
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("orange")) {
            kv.setBackgroundColor(getResources().getColor(R.color.orange));
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("grey")) {
            kv.setBackgroundColor(getResources().getColor(R.color.grey));

        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("lightred")) {
            kv.setBackgroundColor(getResources().getColor(R.color.lightred));
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("lightpink")) {
            kv.setBackgroundColor(getResources().getColor(R.color.lightpink));
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("lightpurple")) {
            kv.setBackgroundColor(getResources().getColor(R.color.lightpurple));
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("lightblue")) {
            kv.setBackgroundColor(getResources().getColor(R.color.lightblue));
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("lightgreen")) {
            kv.setBackgroundColor(getResources().getColor(R.color.lightgreen));
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("lightyellow")) {
            kv.setBackgroundColor(getResources().getColor(R.color.lightyellow));
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("lightorange")) {
            kv.setBackgroundColor(getResources().getColor(R.color.lightorange));
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("lightgrey")) {
            kv.setBackgroundColor(getResources().getColor(R.color.lightgrey));

        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("darkred")) {
            kv.setBackgroundColor(getResources().getColor(R.color.darkred));
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("darkpink")) {
            kv.setBackgroundColor(getResources().getColor(R.color.darkpink));
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("darkpurple")) {
            kv.setBackgroundColor(getResources().getColor(R.color.darkpurple));
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("darkblue")) {
            kv.setBackgroundColor(getResources().getColor(R.color.darkblue));
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("darkgreen")) {
            kv.setBackgroundColor(getResources().getColor(R.color.darkgreen));
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("darkyellow")) {
            kv.setBackgroundColor(getResources().getColor(R.color.darkyellow));
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("darkorange")) {
            kv.setBackgroundColor(getResources().getColor(R.color.darkorange));
        }else if(Preferences.getDefaults("bgcolor", getApplicationContext()).equals("darkgrey")) {
            kv.setBackgroundColor(getResources().getColor(R.color.darkgrey));
        }else {
            String uploadString = Preferences.getDefaults("bgcolor", getApplicationContext());

            byte[] decodedString = Base64.decode(uploadString, Base64.URL_SAFE);
            Bitmap photo = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
            BitmapDrawable bdrawable = new BitmapDrawable(getApplication().getResources(), photo);
            kv.setBackgroundDrawable(bdrawable);
        }

        if(Preferences.getDefaults("autocapitalize", getApplicationContext()).equals("true")) {
            autoCapitalize = true;
        }else if(Preferences.getDefaults("autocapitalize", getApplicationContext()).equals("false")) {
            autoCapitalize = false;
        }

        if(Preferences.getDefaults("volumebuttons", getApplicationContext()).equals("true")) {
            volumeButtons = true;
        }else if(Preferences.getDefaults("volumebuttons", getApplicationContext()).equals("false")) {
            volumeButtons = false;
        }

        if(Preferences.getDefaults("allcaps", getApplicationContext()).equals("true")) {
            allCaps = true;
        }else if(Preferences.getDefaults("allcaps", getApplicationContext()).equals("false")) {
            allCaps = false;
        }

        if(Preferences.getDefaults("autospacing", getApplicationContext()).equals("true")) {
            autoSpacing = true;
        }else if(Preferences.getDefaults("autospacing", getApplicationContext()).equals("false")) {
            autoSpacing = false;
        }

        if(Preferences.getDefaults("changekeyboard", getApplicationContext()).equals("true")) {
            changeKeyboard = true;
        }else if(Preferences.getDefaults("changekeyboard", getApplicationContext()).equals("false")) {
            changeKeyboard = false;
        }

        if(Preferences.getDefaults("shakedelete", getApplicationContext()).equals("true")) {
            shakeDelete = true;
        }else if(Preferences.getDefaults("shakedelete", getApplicationContext()).equals("false")) {
            shakeDelete = false;
        }

        if(Preferences.getDefaults("doublespace", getApplicationContext()).equals("true")) {
            spaceDot = true;
        }else if(Preferences.getDefaults("doublespace", getApplicationContext()).equals("false")) {
            spaceDot = false;
        }

        if(Preferences.getDefaults("voiceinput", getApplicationContext()).equals("true")) {
            voiceInput = true;
        }else if(Preferences.getDefaults("voiceinout", getApplicationContext()).equals("false")) {
            voiceInput = false;
        }

        if(Preferences.getDefaults("popup", getApplicationContext()).equals("true")) {
            popupKeypress = true;
        }else if(Preferences.getDefaults("popup", getApplicationContext()).equals("false")) {
            popupKeypress = false;
        }

        if(Preferences.getDefaults("oppositecase", getApplicationContext()).equals("true")) {
            oppositeCase = true;
        }else if(Preferences.getDefaults("oppositecase", getApplicationContext()).equals("false")) {
            oppositeCase = false;
        }

        if(changeKeyboard) {
            MovementDetector.getInstance(getApplicationContext()).start();

            MovementDetector.getInstance(getApplicationContext()).addListener(new MovementDetector.Listener() {

                @Override
                public void onMotionDetected(SensorEvent event, float acceleration) {
                    if (MovementDetector.direction[1].equals("LEFT")) {
                        playSwipeH();
                        onSwipeLeft();
                    }else if (MovementDetector.direction[1].equals("RIGHT")) {
                        playSwipeH();
                        onSwipeRight();
                    }

                    if(MovementDetector.direction[0].equals("UP")) {
                        playSwipeV();
                        onSwipeUp();
                    }else if(MovementDetector.direction[0].equals("DOWN")) {
                        playSwipeV();
                        onSwipeDown();
                    }
                }
            });
        }

        keypresscounter1 = Preferences.getDefaults("keypresscounter1", getApplicationContext());
        keypresscounter2 = Preferences.getDefaults("keypresscounter2", getApplicationContext());
        keypresscounter3 = Preferences.getDefaults("keypresscounter3", getApplicationContext());

        keyPressCounter = Integer.parseInt(Preferences.getDefaults("keypresses", getApplicationContext()));

        time1 = Preferences.getDefaults("time1", getApplicationContext());
        time2 = Preferences.getDefaults("time2", getApplicationContext());
        time3 = Preferences.getDefaults("time3", getApplicationContext());

        time = Integer.parseInt(Preferences.getDefaults("time", getApplicationContext()));

        tTime = new CountDownTimer(60000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                time = time + 1;

                if (time > 300 && time <= 960 && time1.equals("false")) {
                    NotificationManager notif = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                    Notification notify = new Notification(R.drawable.notify, "Ecloga Keyboard", System.currentTimeMillis());
                    PendingIntent pending = PendingIntent.getActivity(getApplicationContext(), 0, new Intent(getApplicationContext(), Home.class), 0);

                    notify.setLatestEventInfo(getApplicationContext(), "Warming up!", "Type more than 360 seconds", pending);
                    //notif.notify(0, notify);

                    Preferences.setDefaults("time1", "true", getApplicationContext());
                } else if (time > 960 && time <= 3600 && time2.equals("false")) {
                    NotificationManager notif = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                    Notification notify = new Notification(R.drawable.notify, "Ecloga Keyboard", System.currentTimeMillis());
                    PendingIntent pending = PendingIntent.getActivity(getApplicationContext(), 0, new Intent(getApplicationContext(), Home.class), 0);

                    notify.setLatestEventInfo(getApplicationContext(), "Keep it up!", "Type more than 960 seconds", pending);
                    //notif.notify(0, notify);

                    Preferences.setDefaults("time2", "true", getApplicationContext());
                } else if (time > 3600 && time3.equals("false")) {
                    NotificationManager notif = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                    Notification notify = new Notification(R.drawable.notify, "Ecloga Keyboard", System.currentTimeMillis());
                    PendingIntent pending = PendingIntent.getActivity(getApplicationContext(), 0, new Intent(getApplicationContext(), Home.class), 0);

                    notify.setLatestEventInfo(getApplicationContext(), "Typing master!", "Type more than 3600 seconds", pending);
                    //notif.notify(0, notify);

                    Preferences.setDefaults("time3", "true", getApplicationContext());
                }

                Preferences.setDefaults("time", String.valueOf(time), getApplicationContext());
            }

            @Override
            public void onFinish() {
                tTime.start();
            }
        }.start();

        if(popupKeypress) {
            kv.setPreviewEnabled(true);
        }else {
            kv.setPreviewEnabled(false);
        }

        if(shakeDelete) {
            mShaker = new ShakeListener(this);
            mShaker.setOnShakeListener(new ShakeListener.OnShakeListener() {
                public void onShake() {
                    InputConnection ic = getCurrentInputConnection();
                    ic.deleteSurroundingText(500, 500);
                }
            });
        }

        super.onStartInputView(info, restarting);
    }

    public void onRotate(){
        Display display =
                ((WindowManager)
                        this.getSystemService(Context.WINDOW_SERVICE))
                        .getDefaultDisplay();

        int rotation = display.getRotation();

        if (rotation == Surface.ROTATION_0 || rotation == Surface.ROTATION_180) {
            orient = "portrait";
        }else if (rotation == Surface.ROTATION_90 || rotation == Surface.ROTATION_270) {
            orient = "landscape";
        }

        if (orient.equals("portrait")) {
            if (lang.equals("prilang")) {
                keyboard = prilang;
            }else if (lang.equals("seclang")) {
                keyboard = seclang;
            }
            slideAnimation();
            kv.setKeyboard(keyboard);
            doubleUp = 1;
            screen = 1;
            caps = true;

            if(allCaps) {
                capsLock = false;
            }

            kv.invalidateAllKeys();
            keyboard.setShifted(caps);
            kv.invalidateAllKeys();
        }else if (orient.equals("landscape")) {
            switch(screen) {
                case 1:
                    if (lang.equals("prilang")) {
                        keyboard = prilang_landscape;
                    }else if (lang.equals("seclang")) {
                        keyboard = seclang_landscape;
                    }
                    break;
                case 2:
                    if (number == 1) {
                        keyboard = new Keyboard(this, R.xml.numeric_landscape);
                    } else if (number == 2) {
                        keyboard = new Keyboard(this, R.xml.symbols_landscape);
                    }
                    break;
            }
            slideAnimation();
            kv.setKeyboard(keyboard);
            doubleUp = 1;
            screen = 1;
            caps = true;

            if(allCaps) {
                capsLock = false;
            }

            kv.invalidateAllKeys();
            keyboard.setShifted(caps);
            kv.invalidateAllKeys();
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mVoiceRecognitionTrigger = new VoiceRecognitionTrigger(this);
    }

    @Override
    public View onCreateInputView() {
        initializeKeyboard();
        keyboard = prilang;
        kv = (KeyboardView) getLayoutInflater().inflate(R.layout.keyboard, null);
        kv.setKeyboard(keyboard);
        doubleUp = 1;
        screen = 1;
        lang = "prilang";
        caps = true;

        if(allCaps) {
            capsLock = false;
        }

        kv.invalidateAllKeys();
        keyboard.setShifted(caps);
        kv.setOnKeyboardActionListener(this);
        kv.setOnTouchListener(this);

        return kv;
    }

    private class GestureListener extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onSingleTapConfirmed(MotionEvent event) {

            return super.onSingleTapUp(event);
        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            if(e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                playSwipeH();
                onSwipeLeft();
                return true;
            }  else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                playSwipeH();
                onSwipeRight();
                return true;
            }

            if(e1.getY() - e2.getY() > SWIPE_MIN_DISTANCE && Math.abs(velocityY) > SWIPE_THRESHOLD_VELOCITY) {
                playSwipeV();
                onSwipeUp();
                return true;
            }  else if (e2.getY() - e1.getY() > SWIPE_MIN_DISTANCE && Math.abs(velocityY) > SWIPE_THRESHOLD_VELOCITY) {
                playSwipeV();
                onSwipeDown();
                return true;
            }

            return false;
        }
    }

    @Override
    public boolean onTouch(View v, final MotionEvent event) {
        mGestureDetector.onTouchEvent(event);

        if (event.getPointerCount() > 1) {
            return true;
        }

        switch (event.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN:
                mDownX = event.getX();
                mDownY = event.getY();
                isOnClick = true;
                break;
            case MotionEvent.ACTION_CANCEL:
            case MotionEvent.ACTION_UP:
                if (isOnClick) {
                    swipe = false;
                }
                break;
            case MotionEvent.ACTION_MOVE:
                if (isOnClick && (Math.abs(mDownX - event.getX()) > 120 || Math.abs(mDownY - event.getY()) > 120)) {
                    swipe = true;
                    isOnClick = false;
                }
                break;
            default:
                break;
        }

        return false;
    }

    @Override
    public void onKey(int primaryCode, int[] keyCodes) {
        final InputConnection ic = getCurrentInputConnection();

        playClick();
        printChar = true;

        if (primaryCode != 126
                && primaryCode != -5
                && primaryCode != -1
                && primaryCode != EmojiKeyboardView.KEYCODE_EMOJI_1
                && primaryCode != EmojiKeyboardView.KEYCODE_EMOJI_2
                && primaryCode != EmojiKeyboardView.KEYCODE_EMOJI_3
                && primaryCode != EmojiKeyboardView.KEYCODE_EMOJI_4
                && primaryCode != EmojiKeyboardView.KEYCODE_EMOJI_5) {

            keyPressCounter++;

            if (keyPressCounter > 100 && keyPressCounter <= 1000 && keypresscounter1.equals("false")) {
                NotificationManager notif = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                Notification notify = new Notification(R.drawable.notify, "Ecloga Keyboard", System.currentTimeMillis());
                PendingIntent pending = PendingIntent.getActivity(this, 0, new Intent(this, Home.class), 0);

                notify.setLatestEventInfo(getApplicationContext(), "Warming up!", "Type more than 100 characters", pending);
                //notif.notify(0, notify);

                Preferences.setDefaults("keypresscounter1", "true", getApplicationContext());
            } else if (keyPressCounter > 10000 && keyPressCounter <= 10000 && keypresscounter2.equals("false")) {
                NotificationManager notif = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                Notification notify = new Notification(R.drawable.notify, "Ecloga Keyboard", System.currentTimeMillis());
                PendingIntent pending = PendingIntent.getActivity(this, 0, new Intent(this, Home.class), 0);

                notify.setLatestEventInfo(getApplicationContext(), "Keep it up!", "Type more than 1000 characters", pending);
                //notif.notify(0, notify);

                Preferences.setDefaults("keypresscounter2", "true", getApplicationContext());
            } else if (keyPressCounter > 10000 && keypresscounter3.equals("false")) {
                NotificationManager notif = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                Notification notify = new Notification(R.drawable.notify, "Ecloga Keyboard", System.currentTimeMillis());
                PendingIntent pending = PendingIntent.getActivity(this, 0, new Intent(this, Home.class), 0);

                notify.setLatestEventInfo(getApplicationContext(), "Typing master!", "Type more than 10000 characters", pending);
                //notif.notify(0, notify);

                Preferences.setDefaults("keypresscounter3", "true", getApplicationContext());
            }

            Preferences.setDefaults("keypresses", String.valueOf(keyPressCounter), getApplicationContext());
        }

        switch (primaryCode) {
            case 58:
                ic.commitText(":", 1);

                if (autoSpacing) {
                    ic.commitText(" ", 1);
                }
                break;
            case 59:
                ic.commitText(";", 1);

                if (autoSpacing) {
                    ic.commitText(" ", 1);
                }
                break;
            case 33:
                ic.commitText("!", 1);

                if (autoSpacing) {
                    ic.commitText(" ", 1);
                }

                if (autoCapitalize) {
                    caps = true;
                    keyboard.setShifted(caps);
                    kv.invalidateAllKeys();
                    printChar = false;
                }
                break;
            case 63:
                ic.commitText("?", 1);

                if (autoSpacing) {
                    ic.commitText(" ", 1);
                }

                if (autoCapitalize) {
                    caps = true;
                    keyboard.setShifted(caps);
                    kv.invalidateAllKeys();
                    printChar = false;
                }
                break;
            case -5:
                if (lang.equals("seclang")) {
                    if (orient.equals("portrait")) {
                        keyboard = prilang;
                    } else if (orient.equals("landscape")) {
                        keyboard = prilang_landscape;
                    }
                    kv.setKeyboard(keyboard);
                    kv.invalidateAllKeys();
                    lang = "prilang";
                } else if (lang.equals("prilang")) {
                    if (orient.equals("portrait")) {
                        keyboard = seclang;
                    } else if (orient.equals("landscape")) {
                        keyboard = seclang_landscape;
                    }
                    kv.setKeyboard(keyboard);
                    kv.invalidateAllKeys();
                    lang = "seclang";
                }
                break;
            case 32:
                ic.commitText(" ", 1);

                if(autoCapitalize) {
                    if(String.valueOf(ic.getTextBeforeCursor(2, 0)).equals(". ")) {
                        caps = true;
                        keyboard.setShifted(caps);
                        kv.invalidateAllKeys();
                        printChar = false;
                    }
                }
                break;
            case 126:
                ic.deleteSurroundingText(1, 0);

                if(autoCapitalize) {
                    if(String.valueOf(ic.getTextBeforeCursor(1, 0)).equals(".")
                            || String.valueOf(ic.getTextBeforeCursor(2, 0)).equals(". ")
                            || String.valueOf(ic.getTextBeforeCursor(2, 0)).equals("")) {
                        caps = true;
                        keyboard.setShifted(caps);
                        kv.invalidateAllKeys();
                        printChar = false;
                    }
                }
                break;
            case 44:
                ic.commitText(",", 1);

                if (autoSpacing) {
                    ic.commitText(" ", 1);
                }
                break;
            case 46:
                ic.commitText(".", 1);

                if (autoSpacing) {
                    ic.commitText(" ", 1);
                }

                if (autoCapitalize) {
                    caps = true;
                    keyboard.setShifted(caps);
                    kv.invalidateAllKeys();
                    printChar = false;
                }
                break;
            case -1:
                ic.performEditorAction(EditorInfo.IME_ACTION_GO);
                break;
            case EmojiKeyboardView.KEYCODE_EMOJI_1:
                keyboard = new Keyboard(this, R.xml.emoji_a1);
                kv.setKeyboard(keyboard);
                kv.invalidateAllKeys();
                emoji = 1;
                eScreen = 1;
                break;
            case EmojiKeyboardView.KEYCODE_EMOJI_2:
                keyboard = new Keyboard(this, R.xml.emoji_b1);
                kv.setKeyboard(keyboard);
                kv.invalidateAllKeys();
                emoji = 2;
                eScreen = 1;
                break;
            case EmojiKeyboardView.KEYCODE_EMOJI_3:
                keyboard = new Keyboard(this, R.xml.emoji_c1);
                kv.setKeyboard(keyboard);
                kv.invalidateAllKeys();
                emoji = 3;
                eScreen = 1;
                break;
            case EmojiKeyboardView.KEYCODE_EMOJI_4:
                keyboard = new Keyboard(this, R.xml.emoji_d1);
                kv.setKeyboard(keyboard);
                kv.invalidateAllKeys();
                emoji = 4;
                eScreen = 1;
                break;
            case EmojiKeyboardView.KEYCODE_EMOJI_5:
                keyboard = new Keyboard(this, R.xml.emoji_e1);
                kv.setKeyboard(keyboard);
                kv.invalidateAllKeys();
                emoji = 5;
                eScreen = 1;
                break;
            default:
                char code = (char) primaryCode;

                if(allCaps) {
                    if(Character.isLetter(code) && capsLock){
                        code = Character.toLowerCase(code);
                    }else if(Character.isLetter(code) && !capsLock){
                        code = Character.toUpperCase(code);
                    }
                }else {
                    if(Character.isLetter(code) && caps){
                        code = Character.toUpperCase(code);
                    }
                }

                String character = String.valueOf(code);
                ic.commitText(character, 1);
            }

            if (printedDifferent) {
                ic.deleteSurroundingText(1, 0);
            }

            if (printedDot) {
                ic.deleteSurroundingText(1, 0);

                if (autoCapitalize) {
                    caps = true;
                    keyboard.setShifted(caps);
                    kv.invalidateAllKeys();
                    printChar = false;
               }
            }

            if (doubleUp == 2) {
                capsChange();
            }else {
                changeCaps();
            }
        }

    public void switchEmojiUp() {
        switch (emoji) {
            case 1:
                switch (eScreen) {
                    case 1:
                        keyboard = new Keyboard(this, R.xml.emoji_a4);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 4;
                        break;
                    case 2:
                        keyboard = new Keyboard(this, R.xml.emoji_a1);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 1;
                        break;
                    case 3:
                        keyboard = new Keyboard(this, R.xml.emoji_a2);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 2;
                        break;
                    case 4:keyboard = new Keyboard(this, R.xml.emoji_a3);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 3;
                        break;
                }
                break;
            case 2:
                switch (eScreen) {
                    case 1:
                        keyboard = new Keyboard(this, R.xml.emoji_b2);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 2;
                        break;
                    case 2:
                        keyboard = new Keyboard(this, R.xml.emoji_b1);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 1;
                        break;
                }
                break;
            case 3:
                switch (eScreen) {
                    case 1:
                        keyboard = new Keyboard(this, R.xml.emoji_c5);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 5;
                        break;
                    case 2:
                        keyboard = new Keyboard(this, R.xml.emoji_c1);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 1;
                        break;
                    case 3:
                        keyboard = new Keyboard(this, R.xml.emoji_c2);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 2;
                        break;
                    case 4:
                        keyboard = new Keyboard(this, R.xml.emoji_c3);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 3;
                        break;
                    case 5:
                        keyboard = new Keyboard(this, R.xml.emoji_c4);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 4;
                        break;
                }
                break;
            case 4:
                switch (eScreen) {
                    case 1:
                        keyboard = new Keyboard(this, R.xml.emoji_d3);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 3;
                        break;
                    case 2:
                        keyboard = new Keyboard(this, R.xml.emoji_d1);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 1;
                        break;
                    case 3:
                        keyboard = new Keyboard(this, R.xml.emoji_d2);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 2;
                        break;
                }
                break;
            case 5:
                switch (eScreen) {
                    case 1:
                        keyboard = new Keyboard(this, R.xml.emoji_e4);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 4;
                        break;
                    case 2:
                        keyboard = new Keyboard(this, R.xml.emoji_e1);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 1;
                        break;
                    case 3:
                        keyboard = new Keyboard(this, R.xml.emoji_e2);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 2;
                        break;
                    case 4:
                        keyboard = new Keyboard(this, R.xml.emoji_e3);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 3;
                        break;
                }
        }
    }

    public void switchEmojiDown() {
        switch (emoji) {
            case 1:
                switch (eScreen) {
                    case 1:
                        keyboard = new Keyboard(this, R.xml.emoji_a2);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 2;
                        break;
                    case 2:
                        keyboard = new Keyboard(this, R.xml.emoji_a3);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 3;
                        break;
                    case 3:
                        keyboard = new Keyboard(this, R.xml.emoji_a4);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 4;
                        break;
                    case 4:
                        keyboard = new Keyboard(this, R.xml.emoji_a1);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 1;
                        break;
                }
                break;
            case 2:
                switch (eScreen) {
                    case 1:
                        keyboard = new Keyboard(this, R.xml.emoji_b2);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 2;
                        break;
                    case 2:
                        keyboard = new Keyboard(this, R.xml.emoji_b1);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 1;
                        break;
                }
                break;
            case 3:
                switch (eScreen) {
                    case 1:
                        keyboard = new Keyboard(this, R.xml.emoji_c2);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 2;
                        break;
                    case 2:
                        keyboard = new Keyboard(this, R.xml.emoji_c3);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 3;
                        break;
                    case 3:
                        keyboard = new Keyboard(this, R.xml.emoji_c4);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 4;
                        break;
                    case 4:
                        keyboard = new Keyboard(this, R.xml.emoji_c5);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 5;
                        break;
                    case 5:
                        keyboard = new Keyboard(this, R.xml.emoji_c1);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 1;
                        break;
                }
                break;
            case 4:
                switch (eScreen) {
                    case 1:
                        keyboard = new Keyboard(this, R.xml.emoji_d2);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 2;
                        break;
                    case 2:
                        keyboard = new Keyboard(this, R.xml.emoji_d3);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 3;
                        break;
                    case 3:
                        keyboard = new Keyboard(this, R.xml.emoji_d1);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 1;
                        break;
                }
                break;
            case 5:
                switch (eScreen) {
                    case 1:
                        keyboard = new Keyboard(this, R.xml.emoji_e2);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 2;
                        break;
                    case 2:
                        keyboard = new Keyboard(this, R.xml.emoji_e3);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 3;
                        break;
                    case 3:
                        keyboard = new Keyboard(this, R.xml.emoji_e4);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 4;
                        break;
                    case 4:
                        keyboard = new Keyboard(this, R.xml.emoji_e1);
                        kv.setKeyboard(keyboard);
                        kv.invalidateAllKeys();
                        eScreen = 1;
                        break;
                }
        }
    }

    public void onSwipeDown() {
        if(allCaps) {
            caps = true;
            capsLock = true;
        }else {
            caps = false;
        }

        keyboard.setShifted(caps);
        kv.invalidateAllKeys();
        printChar = true;
        doubleUp = 0;

        if (screen == 3) {
            switchEmojiDown();
        }else if (screen == 2) {
            switch (number) {
                case 1:
                    if (orient.equals("portrait")) {
                        keyboard = new Keyboard(this, R.xml.symbols);
                    }else if (orient.equals("landscape")) {
                        keyboard = new Keyboard(this, R.xml.symbols_landscape);
                    }
                    kv.setKeyboard(keyboard);
                    kv.invalidateAllKeys();
                    number = 2;
                    break;
                case 2:
                    if (orient.equals("portrait")) {
                        keyboard = new Keyboard(this, R.xml.numeric);
                    }else if (orient.equals("landscape")) {
                        keyboard = new Keyboard(this, R.xml.numeric_landscape);
                    }
                    kv.setKeyboard(keyboard);
                    kv.invalidateAllKeys();
                    number = 1;
                    break;
            }
        }
    }

    public void onSwipeLeft() {
        slideAnimation();
        switch (screen) {
            case 1:
                keyboard = new Keyboard(this, R.xml.emoji_a1);
                kv.setKeyboard(keyboard);
                kv.invalidateAllKeys();
                screen = 3;
                break;
            case 2:
                if (orient.equals("portrait")) {
                    keyboard = prilang;
                }else if (orient.equals("landscape")) {
                    keyboard = prilang_landscape;
                }
                kv.setKeyboard(keyboard);
                kv.invalidateAllKeys();
                screen = 1;
                break;
            case 3:
                if (orient.equals("portrait")) {
                    keyboard = new Keyboard(this, R.xml.numeric);
                }else if (orient.equals("landscape")) {
                    keyboard = new Keyboard(this, R.xml.numeric_landscape);
                }
                kv.setKeyboard(keyboard);
                kv.invalidateAllKeys();
                if (caps) {
                    caps = true;
                    kv.setShifted(caps);
                    kv.invalidateAllKeys();
                } else {
                    if(allCaps) {
                        caps = true;
                    }else {
                        caps = false;
                    }

                    kv.setShifted(caps);
                    kv.invalidateAllKeys();
                }
                screen = 2;
                number = 1;
                break;
        }
    }

    public void onSwipeRight() {
        slideAnimation();
        switch(screen) {
            case 1:
                if (orient.equals("portrait")) {
                    keyboard = new Keyboard(this, R.xml.numeric);
                }else if (orient.equals("landscape")) {
                    keyboard = new Keyboard(this, R.xml.numeric_landscape);
                }
                kv.setKeyboard(keyboard);
                kv.invalidateAllKeys();
                screen = 2;
                number = 1;
                break;
            case 2:
                keyboard = new Keyboard(this, R.xml.emoji_a1);
                kv.setKeyboard(keyboard);
                kv.invalidateAllKeys();
                screen = 3;
                break;
            case 3:
                if (orient.equals("portrait")) {
                    keyboard = prilang;
                }else if (orient.equals("landscape")) {
                    keyboard = prilang_landscape;
                }
                kv.setKeyboard(keyboard);
                kv.invalidateAllKeys();
                if(caps) {
                    caps = true;
                    kv.setShifted(caps);
                    kv.invalidateAllKeys();
                }else {
                    if(allCaps) {
                        caps = true;
                        capsLock = false;
                    }else {
                        caps = false;
                    }

                    kv.setShifted(caps);
                    kv.invalidateAllKeys();
                }
                screen = 1;
                break;
        }
    }

    public void onSwipeUp() {
        doubleUp = doubleUp + 1;

        if(allCaps) {
            capsLock = false;
        }

        caps = true;
        keyboard.setShifted(caps);
        kv.invalidateAllKeys();
        printChar = false;

        if (screen == 3) {
            switchEmojiUp();
        }else if (screen == 2) {
            switch (number) {
                case 1:
                    if (orient.equals("portrait")) {
                        keyboard = new Keyboard(this, R.xml.symbols);
                    }else if (orient.equals("landscape")) {
                        keyboard = new Keyboard(this, R.xml.symbols_landscape);
                    }
                    kv.setKeyboard(keyboard);
                    kv.invalidateAllKeys();
                    number = 2;
                    break;
                case 2:
                    if (orient.equals("portrait")) {
                        keyboard = new Keyboard(this, R.xml.numeric);
                    }else if (orient.equals("landscape")) {
                        keyboard = new Keyboard(this, R.xml.numeric_landscape);
                    }
                    kv.setKeyboard(keyboard);
                    kv.invalidateAllKeys();
                    number = 1;
                    break;
            }
        }
    }

    @Override
    public void swipeLeft() {

    }

    @Override
    public void swipeRight() {

    }

    @Override
    public void swipeDown() {

    }

    @Override
    public void swipeUp() {

    }

    @Override
    public void onFinishInputView(boolean finishingInput) {
        super.onFinishInputView(finishingInput);

        tTime.cancel();

        if(changeKeyboard) {
            MovementDetector.getInstance(getApplicationContext()).stop();
        }

        if(volumeButtons) {
            vbListenerPause = true;
        }
    }

    @Override
    public void onPress(final int primaryCode) {
        setVibration();

        final InputConnection ic = getCurrentInputConnection();

        if(popupKeypress &&
                (primaryCode == 32
                        || primaryCode == 126
                        || primaryCode == -5
                        || primaryCode == -1
                        || primaryCode == EmojiKeyboardView.KEYCODE_EMOJI_1
                        || primaryCode == EmojiKeyboardView.KEYCODE_EMOJI_2
                        || primaryCode == EmojiKeyboardView.KEYCODE_EMOJI_3
                        || primaryCode == EmojiKeyboardView.KEYCODE_EMOJI_4
                        || primaryCode == EmojiKeyboardView.KEYCODE_EMOJI_5)) {

            kv.setPreviewEnabled(false);
        }

        if(oppositeCase) {
            timer = new CountDownTimer(300, 1) {
                @Override
                public void onTick(long millisUntilFinished) {

                }

                @Override
                public void onFinish() {
                    if(!swipe) {
                        if(primaryCode == 46) {
                            ic.commitText(",", 1);

                            printedCommaa = true;

                            if (autoSpacing) {
                                ic.commitText(" ", 1);
                            }
                        }else if(primaryCode == 32) {
                            Intent intent = new Intent(getApplicationContext(), Home.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(intent);
                        }else if(primaryCode == -5) {
                            if(voiceInput) {
                                if (mVoiceRecognitionTrigger.isInstalled()) {
                                    mVoiceRecognitionTrigger.startVoiceRecognition();
                                }
                            }
                        }else {
                            char code = (char) primaryCode;

                            if(Character.isLetter(code) && caps){
                                code = Character.toLowerCase(code);
                            }else if(Character.isLetter(code) && !caps){
                                code = Character.toUpperCase(code);
                            }

                            ic.commitText(String.valueOf(code), 1);
                        }

                        printedDifferent = true;
                    }
                }
            }.start();
        }

        if(spaceDot) {
            if (primaryCode == 32) {
                doubleSpace++;

                if (doubleSpace == 2) {
                    ic.deleteSurroundingText(1, 0);
                    ic.commitText(".", 1);

                    if (autoSpacing) {
                        ic.commitText(" ", 1);
                    }

                    printedDot = true;
                    doubleSpace = 0;
                } else {
                    printedDot = false;
                }
            } else {
                printedDot = false;
                doubleSpace = 0;
            }
        }
    }

    @Override
    public void onRelease(int primaryCode) {
        if(oppositeCase) {
            timer.cancel();
            printedDifferent = false;
        }

        if(popupKeypress &&
                (primaryCode == 32
                        || primaryCode == 126
                        || primaryCode == -5
                        || primaryCode == -1
                        || primaryCode == EmojiKeyboardView.KEYCODE_EMOJI_1
                        || primaryCode == EmojiKeyboardView.KEYCODE_EMOJI_2
                        || primaryCode == EmojiKeyboardView.KEYCODE_EMOJI_3
                        || primaryCode == EmojiKeyboardView.KEYCODE_EMOJI_4
                        || primaryCode == EmojiKeyboardView.KEYCODE_EMOJI_5)) {

            kv.setPreviewEnabled(true);
        }

        if(printedCommaa) {
            if(autoSpacing) {
                InputConnection ic = getCurrentInputConnection();
                ic.deleteSurroundingText(1, 0);
            }

            if(allCaps) {
                caps = true;
                capsLock = false;
            }else {
                caps = false;
            }

            keyboard.setShifted(caps);
            kv.invalidateAllKeys();

            printedCommaa = false;
        }
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {

        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)  {
        if(volumeButtons && !vbListenerPause) {
            InputConnection ic = getCurrentInputConnection();

            if(keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
                ic.commitText("", -1);
            } else if(keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
                ic.commitText("", 2);
            }

            return true;
        }else {
            return super.onKeyDown(keyCode, event);
        }
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if(volumeButtons
                && (keyCode == KeyEvent.KEYCODE_VOLUME_UP)
                || (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN)) {
            return true;
        }else if(!vbListenerPause && keyCode == KeyEvent.KEYCODE_BACK) {
            screen = 1;

            if(shakeDelete) {
                mShaker.pause();
            }

            vbListenerPause = true;

            return true;
        }else {
            return super.onKeyUp(keyCode, event);
        }
    }

    @Override
    public boolean onKeyMultiple(int keyCode, int count, KeyEvent event) {

        return super.onKeyMultiple(keyCode, count, event);
    }

    @Override
    public void onText(CharSequence text) {

    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        return false;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        tTime.cancel();

        if(changeKeyboard) {
            MovementDetector.getInstance(getApplicationContext()).stop();
        }

        keyboard = prilang;
        kv = (KeyboardView) getLayoutInflater().inflate(R.layout.keyboard, null);
        kv.setKeyboard(keyboard);
        doubleUp = 1;
        screen = 1;
        caps = true;
        lang = "prilang";
        kv.invalidateAllKeys();
        keyboard.setShifted(caps);

        if(shakeDelete) {
            mShaker.pause();
        }

        if(volumeButtons) {
            vbListenerPause = true;
        }

        handleClose();
    }

    private void handleClose() {
        requestHideSelf(0);

        kv.closing();
    }

    //***SOUND***\\
    private void playClick() {
        stopPlaying();

        if(Preferences.getDefaults("sound_c", getApplicationContext()).equals("click")){
            mp = MediaPlayer.create(this, R.raw.click);
            mp.start();
        }else if(Preferences.getDefaults("sound_c", getApplicationContext()).equals("swoosh")){
            mp = MediaPlayer.create(this, R.raw.swoosh);
            mp.start();
        }else if(Preferences.getDefaults("sound_c", getApplicationContext()).equals("bubble")){
            mp = MediaPlayer.create(this, R.raw.bubble);
            mp.start();
        }else if(Preferences.getDefaults("sound_c", getApplicationContext()).equals("metal")){
            mp = MediaPlayer.create(this, R.raw.metal);
            mp.start();
        }else if(Preferences.getDefaults("sound_c", getApplicationContext()).equals("plastic")){
            mp = MediaPlayer.create(this, R.raw.plastic);
            mp.start();
        }else if(Preferences.getDefaults("sound_c", getApplicationContext()).equals("water")){
            mp = MediaPlayer.create(this, R.raw.water);
            mp.start();
        }else if(Preferences.getDefaults("sound_c", getApplicationContext()).equals("balls")){
            mp = MediaPlayer.create(this, R.raw.balls);
            mp.start();
        }else if(Preferences.getDefaults("sound_c", getApplicationContext()).equals("none")){
            mp = MediaPlayer.create(this, R.raw.balls);
            mp.setVolume(0, 0);
            mp.start();
        }
    }

    private void playSwipeH() {
        stopPlaying();

        if(Preferences.getDefaults("sound_h", getApplicationContext()).equals("click")){
            mp = MediaPlayer.create(this, R.raw.click);
            mp.start();
        }else if(Preferences.getDefaults("sound_h", getApplicationContext()).equals("swoosh")){
            mp = MediaPlayer.create(this, R.raw.swoosh);
            mp.start();
        }else if(Preferences.getDefaults("sound_h", getApplicationContext()).equals("bubble")){
            mp = MediaPlayer.create(this, R.raw.bubble);
            mp.start();
        }else if(Preferences.getDefaults("sound_h", getApplicationContext()).equals("metal")){
            mp = MediaPlayer.create(this, R.raw.metal);
            mp.start();
        }else if(Preferences.getDefaults("sound_h", getApplicationContext()).equals("plastic")){
            mp = MediaPlayer.create(this, R.raw.plastic);
            mp.start();
        }else if(Preferences.getDefaults("sound_h", getApplicationContext()).equals("water")){
            mp = MediaPlayer.create(this, R.raw.water);
            mp.start();
        }else if(Preferences.getDefaults("sound_h", getApplicationContext()).equals("balls")){
            mp = MediaPlayer.create(this, R.raw.balls);
            mp.start();
        }else if(Preferences.getDefaults("sound_h", getApplicationContext()).equals("none")){
            mp = MediaPlayer.create(this, R.raw.balls);
            mp.setVolume(0, 0);
            mp.start();
        }
    }

    private void playSwipeV() {
        stopPlaying();

        if(Preferences.getDefaults("sound_v", getApplicationContext()).equals("click")){
            mp = MediaPlayer.create(this, R.raw.click);
            mp.start();
        }else if(Preferences.getDefaults("sound_v", getApplicationContext()).equals("swoosh")){
            mp = MediaPlayer.create(this, R.raw.swoosh);
            mp.start();
        }else if(Preferences.getDefaults("sound_v", getApplicationContext()).equals("bubble")){
            mp = MediaPlayer.create(this, R.raw.bubble);
            mp.start();
        }else if(Preferences.getDefaults("sound_v", getApplicationContext()).equals("metal")){
            mp = MediaPlayer.create(this, R.raw.metal);
            mp.start();
        }else if(Preferences.getDefaults("sound_v", getApplicationContext()).equals("plastic")){
            mp = MediaPlayer.create(this, R.raw.plastic);
            mp.start();
        }else if(Preferences.getDefaults("sound_v", getApplicationContext()).equals("water")){
            mp = MediaPlayer.create(this, R.raw.water);
            mp.start();
        }else if(Preferences.getDefaults("sound_v", getApplicationContext()).equals("balls")){
            mp = MediaPlayer.create(this, R.raw.balls);
            mp.start();
        }else if(Preferences.getDefaults("sound_v", getApplicationContext()).equals("none")){
            mp = MediaPlayer.create(this, R.raw.balls);
            mp.setVolume(0, 0);
            mp.start();
        }
    }

    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }

    //***CAPS***\\

    private void changeCaps() {
        if(printChar) {
            if(allCaps) {
                caps = true;
                capsLock = true;
            }else {
                caps = false;
            }

            keyboard.setShifted(caps);
            kv.invalidateAllKeys();
            doubleUp = 0;
        }
    }

    private void capsChange() {
        if (bigCaps) {
            if(allCaps) {
                capsLock = true;
            }

            caps = true;
            keyboard.setShifted(caps);
            kv.invalidateAllKeys();
            doubleUp = 2;
        }
    }

    //***ANIMATION***\\

    private void pressAnimation() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.keypress);
        //view.startAnimation(anim);
    }

    private void slideAnimation() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.slider);
        kv.startAnimation(anim);
    }

    private void alphaAnimation() {
        AlphaAnimation transparency = new AlphaAnimation(1, (float) 0.75);
        transparency.setDuration(200);
        transparency.start();
        //view.startAnimation(transparency);
    }

    public static int getScreenHeight() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    private void initializeKeyboard() {
        sPrilang = Preferences.getDefaults("prilang", getApplicationContext());
        sSeclang = Preferences.getDefaults("seclang", getApplicationContext());

        size = Integer.parseInt(Preferences.getDefaults("size", getApplicationContext()));

        switch(sPrilang) {
            case "en":
                if(size == 1) {
                    prilang = new Keyboard(this, R.xml.english_small);
                    prilang_landscape = new Keyboard(this, R.xml.english);
                }else if(size == 2) {
                    prilang = new Keyboard(this, R.xml.english);
                    prilang_landscape = new Keyboard(this, R.xml.english_landscape);
                }else if(size == 3) {
                    prilang = new Keyboard(this, R.xml.english_landscape);
                    prilang_landscape = new Keyboard(this, R.xml.english_big);
                }
                break;
            case "sr":
                if(size == 1) {
                    prilang = new Keyboard(this, R.xml.serbian_small);
                    prilang_landscape = new Keyboard(this, R.xml.serbian);
                }else if(size == 2) {
                    prilang = new Keyboard(this, R.xml.serbian);
                    prilang_landscape = new Keyboard(this, R.xml.serbian_landscape);
                }else if(size == 3) {
                    prilang = new Keyboard(this, R.xml.serbian_landscape);
                    prilang_landscape = new Keyboard(this, R.xml.serbian_big);
                }
                break;
            case "el":
                if(size == 1) {
                    prilang = new Keyboard(this, R.xml.greek_small);
                    prilang_landscape = new Keyboard(this, R.xml.greek);
                }else if(size == 2) {
                    prilang = new Keyboard(this, R.xml.greek);
                    prilang_landscape = new Keyboard(this, R.xml.greek_landscape);
                }else if(size == 3) {
                    prilang = new Keyboard(this, R.xml.greek_landscape);
                    prilang_landscape = new Keyboard(this, R.xml.greek_big);
                }
                break;
            case "fr":
                if(size == 1) {
                    prilang = new Keyboard(this, R.xml.french_small);
                    prilang_landscape = new Keyboard(this, R.xml.french);
                }else if(size == 2) {
                    prilang = new Keyboard(this, R.xml.french);
                    prilang_landscape = new Keyboard(this, R.xml.french_landscape);
                }else if(size == 3) {
                    prilang = new Keyboard(this, R.xml.french_landscape);
                    prilang_landscape = new Keyboard(this, R.xml.french_big);
                }
                break;
            case "cz":
                if(size == 1) {
                    prilang = new Keyboard(this, R.xml.czech_small);
                    prilang_landscape = new Keyboard(this, R.xml.czech);
                }else if(size == 2) {
                    prilang = new Keyboard(this, R.xml.czech);
                    prilang_landscape = new Keyboard(this, R.xml.czech_landscape);
                }else if(size == 3) {
                    prilang = new Keyboard(this, R.xml.czech_landscape);
                    prilang_landscape = new Keyboard(this, R.xml.czech_big);
                }
                break;
            case "de":
                if(size == 1) {
                    prilang = new Keyboard(this, R.xml.german_small);
                    prilang_landscape = new Keyboard(this, R.xml.german);
                }else if(size == 2) {
                    prilang = new Keyboard(this, R.xml.german);
                    prilang_landscape = new Keyboard(this, R.xml.german_landscape);
                }else if(size == 3) {
                    prilang = new Keyboard(this, R.xml.german_landscape);
                    prilang_landscape = new Keyboard(this, R.xml.german_big);
                }
                break;
            case "it":
                if(size == 1) {
                    prilang = new Keyboard(this, R.xml.english_small);
                    prilang_landscape = new Keyboard(this, R.xml.english);
                }else if(size == 2) {
                    prilang = new Keyboard(this, R.xml.english);
                    prilang_landscape = new Keyboard(this, R.xml.english_landscape);
                }else if(size == 3) {
                    prilang = new Keyboard(this, R.xml.english_landscape);
                    prilang_landscape = new Keyboard(this, R.xml.english_big);
                }
                break;
            case "es":
                if(size == 1) {
                    prilang = new Keyboard(this, R.xml.english_small);
                    prilang_landscape = new Keyboard(this, R.xml.english);
                }else if(size == 2) {
                    prilang = new Keyboard(this, R.xml.english);
                    prilang_landscape = new Keyboard(this, R.xml.english_landscape);
                }else if(size == 3) {
                    prilang = new Keyboard(this, R.xml.english_landscape);
                    prilang_landscape = new Keyboard(this, R.xml.english_big);
                }
                break;
            case "ru":
                if(size == 1) {
                    prilang = new Keyboard(this, R.xml.russian_small);
                    prilang_landscape = new Keyboard(this, R.xml.russian);
                }else if(size == 2) {
                    prilang = new Keyboard(this, R.xml.russian);
                    prilang_landscape = new Keyboard(this, R.xml.russian_landscape);
                }else if(size == 3) {
                    prilang = new Keyboard(this, R.xml.russian_landscape);
                    prilang_landscape = new Keyboard(this, R.xml.russian_big);
                }
                break;
            case "tr":
                if(size == 1) {
                    prilang = new Keyboard(this, R.xml.turkish_small);
                    prilang_landscape = new Keyboard(this, R.xml.turkish);
                }else if(size == 2) {
                    prilang = new Keyboard(this, R.xml.turkish);
                    prilang_landscape = new Keyboard(this, R.xml.turkish_landscape);
                }else if(size == 3) {
                    prilang = new Keyboard(this, R.xml.turkish_landscape);
                    prilang_landscape = new Keyboard(this, R.xml.turkish_big);
                }
                break;
            case "hu":
                if(size == 1) {
                    prilang = new Keyboard(this, R.xml.hungarian_small);
                    prilang_landscape = new Keyboard(this, R.xml.hungarian);
                }else if(size == 2) {
                    prilang = new Keyboard(this, R.xml.hungarian);
                    prilang_landscape = new Keyboard(this, R.xml.hungarian_landscape);
                }else if(size == 3) {
                    prilang = new Keyboard(this, R.xml.hungarian_landscape);
                    prilang_landscape = new Keyboard(this, R.xml.hungarian_big);
                }
                break;
        }

        switch (sSeclang) {
            case "en":
                if (size == 1) {
                    seclang = new Keyboard(this, R.xml.english_small);
                    seclang_landscape = new Keyboard(this, R.xml.english);
                } else if (size == 2) {
                    seclang = new Keyboard(this, R.xml.english);
                    seclang_landscape = new Keyboard(this, R.xml.english_landscape);
                } else if (size == 3) {
                    seclang = new Keyboard(this, R.xml.english_landscape);
                    seclang_landscape = new Keyboard(this, R.xml.english_big);
                }
                break;
            case "sr":
                if (size == 1) {
                    seclang = new Keyboard(this, R.xml.serbian_small);
                    seclang_landscape = new Keyboard(this, R.xml.serbian);
                } else if (size == 2) {
                    seclang = new Keyboard(this, R.xml.serbian);
                    seclang_landscape = new Keyboard(this, R.xml.serbian_landscape);
                } else if (size == 3) {
                    seclang = new Keyboard(this, R.xml.serbian_landscape);
                    seclang_landscape = new Keyboard(this, R.xml.serbian_big);
                }
                break;
            case "el":
                if (size == 1) {
                    seclang = new Keyboard(this, R.xml.greek_small);
                    seclang_landscape = new Keyboard(this, R.xml.greek);
                } else if (size == 2) {
                    seclang = new Keyboard(this, R.xml.greek);
                    seclang_landscape = new Keyboard(this, R.xml.greek_landscape);
                } else if (size == 3) {
                    seclang = new Keyboard(this, R.xml.greek_landscape);
                    seclang_landscape = new Keyboard(this, R.xml.greek_big);
                }
                break;
            case "fr":
                if (size == 1) {
                    seclang = new Keyboard(this, R.xml.french_small);
                    seclang_landscape = new Keyboard(this, R.xml.french);
                } else if (size == 2) {
                    seclang = new Keyboard(this, R.xml.french);
                    seclang_landscape = new Keyboard(this, R.xml.french_landscape);
                } else if (size == 3) {
                    seclang = new Keyboard(this, R.xml.french_landscape);
                    seclang_landscape = new Keyboard(this, R.xml.french_big);
                }
                break;
            case "cz":
                if (size == 1) {
                    seclang = new Keyboard(this, R.xml.czech_small);
                    seclang_landscape = new Keyboard(this, R.xml.czech);
                } else if (size == 2) {
                    seclang = new Keyboard(this, R.xml.czech);
                    seclang_landscape = new Keyboard(this, R.xml.czech_landscape);
                } else if (size == 3) {
                    seclang = new Keyboard(this, R.xml.czech_landscape);
                    seclang_landscape = new Keyboard(this, R.xml.czech_big);
                }
                break;
            case "de":
                if (size == 1) {
                    seclang = new Keyboard(this, R.xml.german_small);
                    seclang_landscape = new Keyboard(this, R.xml.german);
                } else if (size == 2) {
                    seclang = new Keyboard(this, R.xml.german);
                    seclang_landscape = new Keyboard(this, R.xml.german_landscape);
                } else if (size == 3) {
                    seclang = new Keyboard(this, R.xml.german_landscape);
                    seclang_landscape = new Keyboard(this, R.xml.german_big);
                }
                break;
            case "it":
                if (size == 1) {
                    seclang = new Keyboard(this, R.xml.english_small);
                    seclang_landscape = new Keyboard(this, R.xml.english);
                } else if (size == 2) {
                    seclang = new Keyboard(this, R.xml.english);
                    seclang_landscape = new Keyboard(this, R.xml.english_landscape);
                } else if (size == 3) {
                    seclang = new Keyboard(this, R.xml.english_landscape);
                    seclang_landscape = new Keyboard(this, R.xml.english_big);
                }
                break;
            case "es":
                if (size == 1) {
                    seclang = new Keyboard(this, R.xml.english_small);
                    seclang_landscape = new Keyboard(this, R.xml.english);
                } else if (size == 2) {
                    seclang = new Keyboard(this, R.xml.english);
                    seclang_landscape = new Keyboard(this, R.xml.english_landscape);
                } else if (size == 3) {
                    seclang = new Keyboard(this, R.xml.english_landscape);
                    seclang_landscape = new Keyboard(this, R.xml.english_big);
                }
                break;
            case "ru":
                if (size == 1) {
                    seclang = new Keyboard(this, R.xml.russian_small);
                    seclang_landscape = new Keyboard(this, R.xml.russian);
                } else if (size == 2) {
                    seclang = new Keyboard(this, R.xml.russian);
                    seclang_landscape = new Keyboard(this, R.xml.russian_landscape);
                } else if (size == 3) {
                    seclang = new Keyboard(this, R.xml.russian_landscape);
                    seclang_landscape = new Keyboard(this, R.xml.russian_big);
                }
                break;
            case "tr":
                if (size == 1) {
                    seclang = new Keyboard(this, R.xml.turkish_small);
                    seclang_landscape = new Keyboard(this, R.xml.turkish);
                } else if (size == 2) {
                    seclang = new Keyboard(this, R.xml.turkish);
                    seclang_landscape = new Keyboard(this, R.xml.turkish_landscape);
                } else if (size == 3) {
                    seclang = new Keyboard(this, R.xml.turkish_landscape);
                    seclang_landscape = new Keyboard(this, R.xml.turkish_big);
                }
                break;
            case "hu":
                if (size == 1) {
                    seclang = new Keyboard(this, R.xml.hungarian_small);
                    seclang_landscape = new Keyboard(this, R.xml.hungarian);
                } else if (size == 2) {
                    seclang = new Keyboard(this, R.xml.hungarian);
                    seclang_landscape = new Keyboard(this, R.xml.hungarian_landscape);
                } else if (size == 3) {
                    seclang = new Keyboard(this, R.xml.hungarian_landscape);
                    seclang_landscape = new Keyboard(this, R.xml.hungarian_big);
                }
                break;
        }
    }

    private void setVibration() {
        Vibrator vibe = (Vibrator) this.getSystemService(Context.VIBRATOR_SERVICE);
        int VIBRATOR_SENSITIVITY = Integer.parseInt(Preferences.getDefaults("vibration", getApplicationContext()));
        vibe.vibrate(VIBRATOR_SENSITIVITY);
    }
}