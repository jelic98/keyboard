package keyboard.ecloga.com.eclogakeyboard;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.nispok.snackbar.Snackbar;
import com.nispok.snackbar.SnackbarManager;

public class FragmentPatterns extends android.support.v4.app.Fragment {
    public FragmentPatterns() {

    }

    private boolean longClick;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.patterns, container, false);

        ImageView iPattern_1 = (ImageView) view.findViewById(R.id.iPattern_1);
        iPattern_1.requestLayout();
        BitmapDrawable dPattern_1 = (BitmapDrawable) iPattern_1.getDrawable();
        Bitmap bPattern_1 = dPattern_1.getBitmap();
        bPattern_1 = Bitmap.createScaledBitmap(bPattern_1, 214, 120, true);
        iPattern_1.setImageBitmap(bPattern_1);

        ImageView iPattern_2 = (ImageView) view.findViewById(R.id.iPattern_2);
        iPattern_2.requestLayout();
        BitmapDrawable dPattern_2 = (BitmapDrawable) iPattern_2.getDrawable();
        Bitmap bPattern_2 = dPattern_2.getBitmap();
        bPattern_2 = Bitmap.createScaledBitmap(bPattern_2, 214, 120, true);
        iPattern_2.setImageBitmap(bPattern_2);

        ImageView iPattern_3 = (ImageView) view.findViewById(R.id.iPattern_3);
        iPattern_3.requestLayout();
        BitmapDrawable dPattern_3 = (BitmapDrawable) iPattern_3.getDrawable();
        Bitmap bPattern_3 = dPattern_3.getBitmap();
        bPattern_3 = Bitmap.createScaledBitmap(bPattern_3, 214, 120, true);
        iPattern_3.setImageBitmap(bPattern_3);

        ImageView iPattern_4 = (ImageView) view.findViewById(R.id.iPattern_4);
        iPattern_4.requestLayout();
        BitmapDrawable dPattern_4 = (BitmapDrawable) iPattern_4.getDrawable();
        Bitmap bPattern_4 = dPattern_4.getBitmap();
        bPattern_4 = Bitmap.createScaledBitmap(bPattern_4, 214, 120, true);
        iPattern_4.setImageBitmap(bPattern_4);

        ImageView iPattern_5 = (ImageView) view.findViewById(R.id.iPattern_5);
        iPattern_5.requestLayout();
        BitmapDrawable dPattern_5 = (BitmapDrawable) iPattern_5.getDrawable();
        Bitmap bPattern_5 = dPattern_5.getBitmap();
        bPattern_5 = Bitmap.createScaledBitmap(bPattern_5, 214, 120, true);
        iPattern_5.setImageBitmap(bPattern_5);

        ImageView iPattern_6 = (ImageView) view.findViewById(R.id.iPattern_6);
        iPattern_6.requestLayout();
        BitmapDrawable dPattern_6 = (BitmapDrawable) iPattern_6.getDrawable();
        Bitmap bPattern_6 = dPattern_6.getBitmap();
        bPattern_6 = Bitmap.createScaledBitmap(bPattern_6, 214, 120, true);
        iPattern_6.setImageBitmap(bPattern_6);

        ImageView iPattern_7 = (ImageView) view.findViewById(R.id.iPattern_7);
        iPattern_7.requestLayout();
        BitmapDrawable dPattern_7 = (BitmapDrawable) iPattern_7.getDrawable();
        Bitmap bPattern_7 = dPattern_7.getBitmap();
        bPattern_7 = Bitmap.createScaledBitmap(bPattern_7, 214, 120, true);
        iPattern_7.setImageBitmap(bPattern_7);

        ImageView iPattern_8 = (ImageView) view.findViewById(R.id.iPattern_8);
        iPattern_8.requestLayout();
        BitmapDrawable dPattern_8 = (BitmapDrawable) iPattern_8.getDrawable();
        Bitmap bPattern_8 = dPattern_8.getBitmap();
        bPattern_8 = Bitmap.createScaledBitmap(bPattern_8, 214, 120, true);
        iPattern_8.setImageBitmap(bPattern_8);

        ImageView iPattern_9 = (ImageView) view.findViewById(R.id.iPattern_9);
        iPattern_9.requestLayout();
        BitmapDrawable dPattern_9 = (BitmapDrawable) iPattern_9.getDrawable();
        Bitmap bPattern_9 = dPattern_9.getBitmap();
        bPattern_9 = Bitmap.createScaledBitmap(bPattern_9, 214, 120, true);
        iPattern_9.setImageBitmap(bPattern_9);

        ImageView iPattern_10 = (ImageView) view.findViewById(R.id.iPattern_10);
        iPattern_10.requestLayout();
        BitmapDrawable dPattern_10 = (BitmapDrawable) iPattern_10.getDrawable();
        Bitmap bPattern_10 = dPattern_10.getBitmap();
        bPattern_10 = Bitmap.createScaledBitmap(bPattern_10, 214, 120, true);
        iPattern_10.setImageBitmap(bPattern_10);

        ImageView iPattern_11 = (ImageView) view.findViewById(R.id.iPattern_11);
        iPattern_11.requestLayout();
        BitmapDrawable dPattern_11 = (BitmapDrawable) iPattern_11.getDrawable();
        Bitmap bPattern_11 = dPattern_11.getBitmap();
        bPattern_11 = Bitmap.createScaledBitmap(bPattern_11, 214, 120, true);
        iPattern_11.setImageBitmap(bPattern_11);

        ImageView iPattern_12 = (ImageView) view.findViewById(R.id.iPattern_12);
        iPattern_12.requestLayout();
        BitmapDrawable dPattern_12 = (BitmapDrawable) iPattern_12.getDrawable();
        Bitmap bPattern_12 = dPattern_12.getBitmap();
        bPattern_12 = Bitmap.createScaledBitmap(bPattern_12, 214, 120, true);
        iPattern_12.setImageBitmap(bPattern_12);

        ImageView iPattern_13 = (ImageView) view.findViewById(R.id.iPattern_13);
        iPattern_13.requestLayout();
        BitmapDrawable dPattern_13 = (BitmapDrawable) iPattern_13.getDrawable();
        Bitmap bPattern_13 = dPattern_13.getBitmap();
        bPattern_13 = Bitmap.createScaledBitmap(bPattern_13, 214, 120, true);
        iPattern_13.setImageBitmap(bPattern_13);

        ImageView iPattern_14 = (ImageView) view.findViewById(R.id.iPattern_14);
        iPattern_14.requestLayout();
        BitmapDrawable dPattern_14 = (BitmapDrawable) iPattern_14.getDrawable();
        Bitmap bPattern_14 = dPattern_14.getBitmap();
        bPattern_14 = Bitmap.createScaledBitmap(bPattern_14, 214, 120, true);
        iPattern_14.setImageBitmap(bPattern_14);

        ImageView iPattern_15 = (ImageView) view.findViewById(R.id.iPattern_15);
        iPattern_15.requestLayout();
        BitmapDrawable dPattern_15 = (BitmapDrawable) iPattern_15.getDrawable();
        Bitmap bPattern_15 = dPattern_15.getBitmap();
        bPattern_15 = Bitmap.createScaledBitmap(bPattern_15, 214, 120, true);
        iPattern_15.setImageBitmap(bPattern_15);

        ImageView iPattern_16 = (ImageView) view.findViewById(R.id.iPattern_16);
        iPattern_16.requestLayout();
        BitmapDrawable dPattern_16 = (BitmapDrawable) iPattern_16.getDrawable();
        Bitmap bPattern_16 = dPattern_16.getBitmap();
        bPattern_16 = Bitmap.createScaledBitmap(bPattern_16, 214, 120, true);
        iPattern_16.setImageBitmap(bPattern_16);

        ImageView iPattern_17 = (ImageView) view.findViewById(R.id.iPattern_17);
        iPattern_17.requestLayout();
        BitmapDrawable dPattern_17 = (BitmapDrawable) iPattern_17.getDrawable();
        Bitmap bPattern_17 = dPattern_17.getBitmap();
        bPattern_17 = Bitmap.createScaledBitmap(bPattern_17, 214, 120, true);
        iPattern_17.setImageBitmap(bPattern_17);

        return view;
    }
}
