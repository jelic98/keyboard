package keyboard.ecloga.com.eclogakeyboard;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.nispok.snackbar.Snackbar;
import com.nispok.snackbar.SnackbarManager;

public class FragmentNature extends android.support.v4.app.Fragment {
    public FragmentNature() {

    }

    private boolean longClick;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.nature, container, false);

        ImageView iNature_1 = (ImageView) view.findViewById(R.id.iNature_1);
        iNature_1.requestLayout();
        BitmapDrawable dNature_1 = (BitmapDrawable) iNature_1.getDrawable();
        Bitmap bNature_1 = dNature_1.getBitmap();
        bNature_1 = Bitmap.createScaledBitmap(bNature_1, 214, 120, true);
        iNature_1.setImageBitmap(bNature_1);

        ImageView iNature_2 = (ImageView) view.findViewById(R.id.iNature_2);
        iNature_2.requestLayout();
        BitmapDrawable dNature_2 = (BitmapDrawable) iNature_2.getDrawable();
        Bitmap bNature_2 = dNature_2.getBitmap();
        bNature_2 = Bitmap.createScaledBitmap(bNature_2, 214, 120, true);
        iNature_2.setImageBitmap(bNature_2);

        ImageView iNature_3 = (ImageView) view.findViewById(R.id.iNature_3);
        iNature_3.requestLayout();
        BitmapDrawable dNature_3 = (BitmapDrawable) iNature_3.getDrawable();
        Bitmap bNature_3 = dNature_3.getBitmap();
        bNature_3 = Bitmap.createScaledBitmap(bNature_3, 214, 120, true);
        iNature_3.setImageBitmap(bNature_3);

        ImageView iNature_4 = (ImageView) view.findViewById(R.id.iNature_4);
        iNature_4.requestLayout();
        BitmapDrawable dNature_4 = (BitmapDrawable) iNature_4.getDrawable();
        Bitmap bNature_4 = dNature_4.getBitmap();
        bNature_4 = Bitmap.createScaledBitmap(bNature_4, 214, 120, true);
        iNature_4.setImageBitmap(bNature_4);

        ImageView iNature_5 = (ImageView) view.findViewById(R.id.iNature_5);
        iNature_5.requestLayout();
        BitmapDrawable dNature_5 = (BitmapDrawable) iNature_5.getDrawable();
        Bitmap bNature_5 = dNature_5.getBitmap();
        bNature_5 = Bitmap.createScaledBitmap(bNature_5, 214, 120, true);
        iNature_5.setImageBitmap(bNature_5);

        ImageView iNature_6 = (ImageView) view.findViewById(R.id.iNature_6);
        iNature_6.requestLayout();
        BitmapDrawable dNature_6 = (BitmapDrawable) iNature_6.getDrawable();
        Bitmap bNature_6 = dNature_6.getBitmap();
        bNature_6 = Bitmap.createScaledBitmap(bNature_6, 214, 120, true);
        iNature_6.setImageBitmap(bNature_6);

        ImageView iNature_7 = (ImageView) view.findViewById(R.id.iNature_7);
        iNature_7.requestLayout();
        BitmapDrawable dNature_7 = (BitmapDrawable) iNature_7.getDrawable();
        Bitmap bNature_7 = dNature_7.getBitmap();
        bNature_7 = Bitmap.createScaledBitmap(bNature_7, 214, 120, true);
        iNature_7.setImageBitmap(bNature_7);

        ImageView iNature_8 = (ImageView) view.findViewById(R.id.iNature_8);
        iNature_8.requestLayout();
        BitmapDrawable dNature_8 = (BitmapDrawable) iNature_8.getDrawable();
        Bitmap bNature_8 = dNature_8.getBitmap();
        bNature_8 = Bitmap.createScaledBitmap(bNature_8, 214, 120, true);
        iNature_8.setImageBitmap(bNature_8);

        ImageView iNature_9 = (ImageView) view.findViewById(R.id.iNature_9);
        iNature_9.requestLayout();
        BitmapDrawable dNature_9 = (BitmapDrawable) iNature_9.getDrawable();
        Bitmap bNature_9 = dNature_9.getBitmap();
        bNature_9 = Bitmap.createScaledBitmap(bNature_9, 214, 120, true);
        iNature_9.setImageBitmap(bNature_9);

        ImageView iNature_10 = (ImageView) view.findViewById(R.id.iNature_10);
        iNature_10.requestLayout();
        BitmapDrawable dNature_10 = (BitmapDrawable) iNature_10.getDrawable();
        Bitmap bNature_10 = dNature_10.getBitmap();
        bNature_10 = Bitmap.createScaledBitmap(bNature_10, 214, 120, true);
        iNature_10.setImageBitmap(bNature_10);

        ImageView iNature_11 = (ImageView) view.findViewById(R.id.iNature_11);
        iNature_11.requestLayout();
        BitmapDrawable dNature_11 = (BitmapDrawable) iNature_11.getDrawable();
        Bitmap bNature_11 = dNature_11.getBitmap();
        bNature_11 = Bitmap.createScaledBitmap(bNature_11, 214, 120, true);
        iNature_11.setImageBitmap(bNature_11);

        ImageView iNature_12 = (ImageView) view.findViewById(R.id.iNature_12);
        iNature_12.requestLayout();
        BitmapDrawable dNature_12 = (BitmapDrawable) iNature_12.getDrawable();
        Bitmap bNature_12 = dNature_12.getBitmap();
        bNature_12 = Bitmap.createScaledBitmap(bNature_12, 214, 120, true);
        iNature_12.setImageBitmap(bNature_12);

        ImageView iNature_13 = (ImageView) view.findViewById(R.id.iNature_13);
        iNature_13.requestLayout();
        BitmapDrawable dNature_13 = (BitmapDrawable) iNature_13.getDrawable();
        Bitmap bNature_13 = dNature_13.getBitmap();
        bNature_13 = Bitmap.createScaledBitmap(bNature_13, 214, 120, true);
        iNature_13.setImageBitmap(bNature_13);

        ImageView iNature_14 = (ImageView) view.findViewById(R.id.iNature_14);
        iNature_14.requestLayout();
        BitmapDrawable dNature_14 = (BitmapDrawable) iNature_14.getDrawable();
        Bitmap bNature_14 = dNature_14.getBitmap();
        bNature_14 = Bitmap.createScaledBitmap(bNature_14, 214, 120, true);
        iNature_14.setImageBitmap(bNature_14);

        return view;
    }
}
