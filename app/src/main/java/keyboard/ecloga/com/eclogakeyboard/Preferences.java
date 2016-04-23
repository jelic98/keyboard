package keyboard.ecloga.com.eclogakeyboard;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Preferences {

    public static void setDefaults(String key, String value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static String getDefaults(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);

        if(key.equals("bgcolor")) {
            return preferences.getString(key, "blue");
        }else if(key.equals("vibration")) {
            return preferences.getString(key, String.valueOf(50));
        }else if(key.equals("sound_v")) {
                return preferences.getString(key, "bubble");
        }else if(key.equals("sound_c")) {
            return preferences.getString(key, "click");
        }else if(key.equals("sound_h")) {
            return preferences.getString(key, "water");
        }else if(key.equals("size")) {
            return preferences.getString(key, String.valueOf(2));
        }else if(key.equals("keypresses")) {
            return preferences.getString(key, String.valueOf(0));
        }else if(key.equals("time")) {
            return preferences.getString(key, String.valueOf(0));
        }else if(key.equals("prilang")) {
            return preferences.getString(key, "en");
        }else if(key.equals("seclang")) {
            return preferences.getString(key, "sr");
        }else if(key.equals("store")) {
            return preferences.getString(key, "");
        }else if(key.equals("autocapitalize")) {
            return preferences.getString(key, "true");
        }else if(key.equals("autospacing")) {
            return preferences.getString(key, "true");
        }else if(key.equals("oppositecase")) {
            return preferences.getString(key, "tre");
        }else if(key.equals("shakedelete")) {
            return preferences.getString(key, "true");
        }else if(key.equals("volumebuttons")) {
            return preferences.getString(key, "true");
        }else if(key.equals("doublespace")) {
            return preferences.getString(key, "true");
        }else {
            return preferences.getString(key, "false");
        }
    }
}
