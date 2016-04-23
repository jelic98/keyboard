package keyboard.ecloga.com.eclogakeyboard;


import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.os.CountDownTimer;
import android.support.v7.widget.CardView;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.nispok.snackbar.Snackbar;
import com.nispok.snackbar.SnackbarManager;

import org.adw.library.widgets.discreteseekbar.DiscreteSeekBar;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentGeneral extends android.support.v4.app.Fragment implements View.OnTouchListener{

    public FragmentGeneral() {

    }

    private DiscreteSeekBar discreteSeekBar;
    private int progress;
    private RelativeLayout.LayoutParams params;
    private ImageView ivPreview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.general, container, false);

        ivPreview = (ImageView) view.findViewById(R.id.ivPreview);
        ivPreview.setVisibility(View.INVISIBLE);

        params = (RelativeLayout.LayoutParams) ivPreview.getLayoutParams();

        switch(Integer.parseInt(Preferences.getDefaults("size", getActivity()))) {
            case 1:
                params.height = (int) (getScreenHeight() * 0.29);
                break;
            case 2:
                params.height = (int) (getScreenHeight() * 0.37);
                break;
            case 3:
                params.height = (int) (getScreenHeight() * 0.47);
                break;
        }

        ivPreview.setLayoutParams(params);

        final CardView cardView1 = (CardView) view.findViewById(R.id.cardView1);
        final CardView cardView2 = (CardView) view.findViewById(R.id.cardView2);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.click_zoom_out);
                cardView1.startAnimation(anim);

                Intent intent = new Intent(getActivity(), SelectLanguage.class);
                String index = "primary";
                intent.putExtra("index", index);
                startActivity(intent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.click_zoom_out);
                cardView2.startAnimation(anim);

                Intent intent = new Intent(getActivity(), SelectLanguage.class);
                String index = "secondary";
                intent.putExtra("index", index);
                startActivity(intent);
            }
        });

        discreteSeekBar = (DiscreteSeekBar) view.findViewById(R.id.discreteSeekBar);
        discreteSeekBar.setMax(3);
        discreteSeekBar.setMin(1);
        discreteSeekBar.setProgress(Integer.parseInt(Preferences.getDefaults("size", getActivity())));
        discreteSeekBar.setOnProgressChangeListener(new DiscreteSeekBar.OnProgressChangeListener() {
            @Override
            public void onProgressChanged(DiscreteSeekBar discreteSeekBar, int i, boolean b) {
                progress = i;

                switch(progress) {
                    case 1:
                        params.height = (int) (getScreenHeight() * 0.29);
                        Preferences.setDefaults("size", String.valueOf(1), getActivity());
                        break;
                    case 2:
                        params.height = (int) (getScreenHeight() * 0.37);
                        Preferences.setDefaults("size", String.valueOf(2), getActivity());
                        break;
                    case 3:
                        params.height = (int) (getScreenHeight() * 0.47);
                        Preferences.setDefaults("size", String.valueOf(3), getActivity());
                        break;
                }

                Animation anim = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.click);
                ivPreview.startAnimation(anim);

                ivPreview.setLayoutParams(params);

                new CountDownTimer(1000, 1000) {
                    @Override
                    public void onFinish() {
                        Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.fadeout);
                        ivPreview.startAnimation(anim);

                        ivPreview.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onTick(long l) {

                    }
                }.start();
            }

            @Override
            public void onStartTrackingTouch(DiscreteSeekBar discreteSeekBar) {
                ivPreview.setVisibility(View.VISIBLE);
            }

            @Override
            public void onStopTrackingTouch(DiscreteSeekBar discreteSeekBar) {
                Preferences.setDefaults("size", String.valueOf(progress), getActivity().getApplicationContext());
            }
        });

        return view;
    }

    public static int getScreenHeight() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}
