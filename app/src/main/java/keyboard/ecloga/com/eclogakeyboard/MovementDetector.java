package keyboard.ecloga.com.eclogakeyboard;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;
import java.util.HashSet;

public class MovementDetector implements SensorEventListener {

    private Sensor accelerometer;
    private SensorManager mSensorMgr;
    public static Context mContext;
    private float preX, preY;
    public static String [] direction = {"NONE","NONE"};

    private MovementDetector(Context context) {
        if(context != null) {
            mContext = context;
        }
    }

    private static MovementDetector mInstance;

    public static MovementDetector getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new MovementDetector(context);
            mInstance.init();
        }
        return mInstance;
    }

    private HashSet<Listener> mListeners = new HashSet<MovementDetector.Listener>();

    private void init() {
        mSensorMgr = (SensorManager) mContext.getSystemService(Context.SENSOR_SERVICE);
        accelerometer = mSensorMgr.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
    }

    public void start() {
        mSensorMgr.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_NORMAL);
    }

    public void stop() {
        mSensorMgr.unregisterListener(this);
    }

    public void addListener(Listener listener) {
        mListeners.add(listener);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_GYROSCOPE) {

            float x = event.values[0];
            float y = event.values[1];

            float deltaX = preX - x;
            float deltaY = preY - y;

            if(deltaX > 2) {
                direction[1] = "NONE";
                direction[0] = "UP";
            }else if(deltaX < -2) {
                direction[1] = "NONE";
                direction[0] = "DOWN";
            }

            if(deltaY > 6) {
                direction[0] = "NONE";
                direction[1] = "LEFT";
            } else if(deltaY < -6) {
                direction[0] = "NONE";
                direction[1] = "RIGHT";
            }

            preX = x;
            preY = y;

            float diff = (float) Math.sqrt(x * x + y * y);

            if (diff > 5) {
                for (Listener listener : mListeners) {
                    listener.onMotionDetected(event, diff);
                }
            }

            Log.d("GYROSCOPE", String.valueOf(deltaX) + " " + String.valueOf(deltaY));
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    public interface Listener {
        void onMotionDetected(SensorEvent event, float acceleration);
    }
}