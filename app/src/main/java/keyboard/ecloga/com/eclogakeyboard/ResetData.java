package keyboard.ecloga.com.eclogakeyboard;

import android.content.Context;

public class ResetData {
    public static void resetData(Context context) {
        Preferences.setDefaults("name", "", context.getApplicationContext());
        Preferences.setDefaults("link", "", context.getApplicationContext());
        Preferences.setDefaults("prilang", "en", context.getApplicationContext());
        Preferences.setDefaults("seclang", "sr", context.getApplicationContext());
        Preferences.setDefaults("store", "none", context.getApplicationContext());
        Preferences.setDefaults("size", "2", context.getApplicationContext());
        Preferences.setDefaults("premium", "false", context.getApplicationContext());
        Preferences.setDefaults("voiceinput", "false", context.getApplicationContext());
        Preferences.setDefaults("autocapitalize", "false", context.getApplicationContext());
        Preferences.setDefaults("volumebuttons", "", context.getApplicationContext());
        Preferences.setDefaults("bgcolor", "blue", context.getApplicationContext());
        Preferences.setDefaults("sound_v", "bubble", context.getApplicationContext());
        Preferences.setDefaults("sound_c", "click", context.getApplicationContext());
        Preferences.setDefaults("sound_h", "water", context.getApplicationContext());
        Preferences.setDefaults("allcaps", "false", context.getApplicationContext());
        Preferences.setDefaults("autospacing", "false", context.getApplicationContext());
        Preferences.setDefaults("changekeyboard", "false", context.getApplicationContext());
        Preferences.setDefaults("shakedelete", "false", context.getApplicationContext());
        Preferences.setDefaults("doublespace", "false", context.getApplicationContext());
        Preferences.setDefaults("popup", "false", context.getApplicationContext());
        Preferences.setDefaults("oppositecase", "", context.getApplicationContext());
        Preferences.setDefaults("keypresscounter1", "false", context.getApplicationContext());
        Preferences.setDefaults("keypresscounter2", "false", context.getApplicationContext());
        Preferences.setDefaults("keypresscounter3", "false", context.getApplicationContext());
        Preferences.setDefaults("time1", "false", context.getApplicationContext());
        Preferences.setDefaults("time2", "false", context.getApplicationContext());
        Preferences.setDefaults("time3", "false", context.getApplicationContext());
        Preferences.setDefaults("keypresses", "0", context.getApplicationContext());
        Preferences.setDefaults("time", "0", context.getApplicationContext());
        Preferences.setDefaults("vibration", "0", context.getApplicationContext());
    }
}
