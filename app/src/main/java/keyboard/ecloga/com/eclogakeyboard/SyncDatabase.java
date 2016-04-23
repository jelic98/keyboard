package keyboard.ecloga.com.eclogakeyboard;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.StrictMode;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class SyncDatabase {
    public static String getFromDB(String linkToGetData) throws IOException {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        HttpClient httpclient = new DefaultHttpClient();
        HttpGet httpget = new HttpGet("http://www.ecloga.org/keyboard_load.php?link=" + linkToGetData);
        HttpResponse response = httpclient.execute(httpget);
        String theResponse =  EntityUtils.toString(response.getEntity());

        return theResponse;
    }


    public static String setToDB(String... dataToSave) throws IOException {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        HttpClient httpclient = new DefaultHttpClient();
        HttpGet httpget = new HttpGet("http://www.ecloga.org/keyboard_save.php?"
                + "link=" + dataToSave[1] + "&"
                + "prilang=" + dataToSave[2] + "&"
                + "seclang=" + dataToSave[3] + "&"
                + "premium=" + dataToSave[4] + "&"
                + "store=" + dataToSave[5] + "&"
                + "size=" + dataToSave[6] + "&"
                + "sound_v=" + dataToSave[7] + "&"
                + "sound_c=" + dataToSave[8] + "&"
                + "sound_h=" + dataToSave[9] + "&"
                + "bgcolor=" + dataToSave[10] + "&"
                + "autocapitalize=" + dataToSave[11] + "&"
                + "volumebuttons=" + dataToSave[12] + "&"
                + "allcaps=" + dataToSave[13] + "&"
                + "autospacing=" + dataToSave[14] + "&"
                + "changekeyboard=" + dataToSave[15] + "&"
                + "shakedelete=" + dataToSave[16] + "&"
                + "doublespace=" + dataToSave[17] + "&"
                + "popup=" + dataToSave[18] + "&"
                + "oppositecase=" + dataToSave[19] + "&"
                + "keypresscounter1=" + dataToSave[20] + "&"
                + "keypresscounter2=" + dataToSave[21] + "&"
                + "keypresscounter3=" + dataToSave[22] + "&"
                + "time1=" + dataToSave[23] + "&"
                + "time2=" + dataToSave[24] + "&"
                + "time3=" + dataToSave[25] + "&"
                + "keypresses=" + dataToSave[26] + "&"
                + "time=" + dataToSave[27] + "&"
                + "voiceinput=" + dataToSave[28] + "&"
                + "vibration=" + dataToSave[29]);

        HttpResponse response = httpclient.execute(httpget);
        String theResponse =  EntityUtils.toString(response.getEntity());

        return theResponse;
    }

    public static boolean isNetworkAvailable(Context context) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        ConnectivityManager connectivityManager
                = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null;
    }

    public static boolean hasActiveInternetConnection(Context context) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        if (isNetworkAvailable(context)) {
            try {
                HttpURLConnection urlc = (HttpURLConnection) (new URL("http://www.google.com").openConnection());
                urlc.setRequestProperty("User-Agent", "Test");
                urlc.setRequestProperty("Connection", "close");
                urlc.setConnectTimeout(1500);
                urlc.connect();
                return (urlc.getResponseCode() == 200);
            } catch (IOException e) {}
        }

        return false;
    }
}
