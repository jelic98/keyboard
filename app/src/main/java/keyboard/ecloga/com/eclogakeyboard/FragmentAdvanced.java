package keyboard.ecloga.com.eclogakeyboard;


import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.andexert.expandablelayout.library.ExpandableLayout;
import com.andexert.expandablelayout.library.ExpandableLayoutListView;
import com.nispok.snackbar.Snackbar;
import com.nispok.snackbar.SnackbarManager;

import org.adw.library.widgets.discreteseekbar.DiscreteSeekBar;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentAdvanced extends android.support.v4.app.Fragment {

    public FragmentAdvanced() {

    }

    private DiscreteSeekBar discreteSeekBar;
    private int progress;
    private TextView content_text;
    private ImageView arrow_down;
    private Drawable d;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.advanced, container, false);

        content_text = (TextView) view.findViewById(R.id.content_text);
        content_text.setText("Sensitivity(" + Preferences.getDefaults("vibration", getActivity()) + "ms)");

        arrow_down = (ImageView) view.findViewById(R.id.arrow_down);
        d = getResources().getDrawable(R.drawable.arrow_down);
        d.setColorFilter(getResources().getColor(R.color.primary), PorterDuff.Mode.MULTIPLY);
        arrow_down.setImageDrawable(d);

        discreteSeekBar = (DiscreteSeekBar) view.findViewById(R.id.discreteSeekBar);
        discreteSeekBar.setProgress(Integer.parseInt(Preferences.getDefaults("vibration", getActivity())));
        discreteSeekBar.setOnProgressChangeListener(new DiscreteSeekBar.OnProgressChangeListener() {
            @Override
            public void onProgressChanged(DiscreteSeekBar discreteSeekBar, int i, boolean b) {
                progress = i;
                content_text.setText("Sensitivity(" + progress + "ms)");
            }

            @Override
            public void onStartTrackingTouch(DiscreteSeekBar discreteSeekBar) {

            }

            @Override
            public void onStopTrackingTouch(DiscreteSeekBar discreteSeekBar) {
                Preferences.setDefaults("vibration", String.valueOf(progress), getActivity().getApplicationContext());
            }
        });

        final CheckBox cbAutoCapitalize = (CheckBox) view.findViewById(R.id.cbAutoCapitalize);
        if(Preferences.getDefaults("autocapitalize", getActivity().getApplication()).equals("true")) {
            cbAutoCapitalize.setChecked(true);
        }else{
            cbAutoCapitalize.setChecked(false);
        }
        cbAutoCapitalize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbAutoCapitalize.isChecked()) {
                    Preferences.setDefaults("autocapitalize", "true", getActivity().getApplicationContext());
                } else {
                    Preferences.setDefaults("autocapitalize", "false", getActivity().getApplicationContext());
                }
            }
        });

       final CheckBox cbAutoSpacing = (CheckBox) view.findViewById(R.id.cbAutoSpacing);
        if(Preferences.getDefaults("autospacing", getActivity().getApplication()).equals("true")) {
            cbAutoSpacing.setChecked(true);
        }else{
            cbAutoSpacing.setChecked(false);
        }
        cbAutoSpacing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbAutoSpacing.isChecked()) {
                    Preferences.setDefaults("autospacing", "true", getActivity().getApplicationContext());
                }else {
                    Preferences.setDefaults("autospacing", "false", getActivity().getApplicationContext());
                }
            }
        });

        final CheckBox cbVoiceInput = (CheckBox) view.findViewById(R.id.cbVoiceInput);
        if(Preferences.getDefaults("voiceinput", getActivity().getApplication()).equals("true")) {
            cbVoiceInput.setChecked(true);
        }else{
            cbVoiceInput.setChecked(false);
        }
        cbVoiceInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbVoiceInput.isChecked()) {
                    Preferences.setDefaults("voiceinput", "true", getActivity().getApplicationContext());
                } else {
                    Preferences.setDefaults("voiceinput", "false", getActivity().getApplicationContext());
                }
            }
        });

        final CheckBox cbPopup = (CheckBox) view.findViewById(R.id.cbPopup);
        if(Preferences.getDefaults("popup", getActivity().getApplication()).equals("true")) {
            cbPopup.setChecked(true);
        }else{
            cbPopup.setChecked(false);
        }
        cbPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbPopup.isChecked()) {
                    Preferences.setDefaults("popup", "true", getActivity().getApplicationContext());
                }else {
                    Preferences.setDefaults("popup", "false", getActivity().getApplicationContext());
                }
            }
        });

        final CheckBox cbAllCaps = (CheckBox) view.findViewById(R.id.cbAllCaps);
        if(Preferences.getDefaults("allcaps", getActivity().getApplication()).equals("true")) {
            cbAllCaps.setChecked(true);
        }else{
            cbAllCaps.setChecked(false);
        }
        cbAllCaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbAllCaps.isChecked()) {
                    Preferences.setDefaults("allcaps", "true", getActivity().getApplicationContext());
                }else {
                    Preferences.setDefaults("allcaps", "false", getActivity().getApplicationContext());
                }
            }
        });

        final CheckBox cbChangeKeyboard = (CheckBox) view.findViewById(R.id.cbChangeKeyboard);
        if(Preferences.getDefaults("changekeyboard", getActivity().getApplication()).equals("true")) {
            cbChangeKeyboard.setChecked(true);
        }else{
            cbChangeKeyboard.setChecked(false);
        }
        cbChangeKeyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbChangeKeyboard.isChecked()) {
                    Preferences.setDefaults("changekeyboard", "true", getActivity().getApplicationContext());
                }else {
                    Preferences.setDefaults("changekeyboard", "false", getActivity().getApplicationContext());
                }
            }
        });

        final CheckBox cbDoubleSpace = (CheckBox) view.findViewById(R.id.cbDoubleSpace);
        if(Preferences.getDefaults("doublespace", getActivity().getApplication()).equals("true")) {
            cbDoubleSpace.setChecked(true);
        }else{
            cbDoubleSpace.setChecked(false);
        }
        cbDoubleSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbDoubleSpace.isChecked()) {
                    Preferences.setDefaults("doublespace", "true", getActivity().getApplicationContext());
                }else {
                    Preferences.setDefaults("doublespace", "false", getActivity().getApplicationContext());
                }
            }
        });

        final CheckBox cbOppositeCase = (CheckBox) view.findViewById(R.id.cbOppositeCase);
        if(Preferences.getDefaults("oppositecase", getActivity().getApplication()).equals("true")) {
            cbOppositeCase.setChecked(true);
        }else{
            cbOppositeCase.setChecked(false);
        }
        cbOppositeCase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbOppositeCase.isChecked()) {
                    Preferences.setDefaults("oppositecase", "true", getActivity().getApplicationContext());
                }else {
                    Preferences.setDefaults("oppositecase", "false", getActivity().getApplicationContext());
                }
            }
        });

        final CheckBox cbShakeDelete = (CheckBox) view.findViewById(R.id.cbShakeDelete);
        if(Preferences.getDefaults("shakedelete", getActivity().getApplication()).equals("true")) {
            cbShakeDelete.setChecked(true);
        }else{
            cbShakeDelete.setChecked(false);
        }
        cbShakeDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbShakeDelete.isChecked()) {
                    Preferences.setDefaults("shakedelete", "true", getActivity().getApplicationContext());
                }else {
                    Preferences.setDefaults("shakedelete", "false", getActivity().getApplicationContext());
                }
            }
        });

        final CheckBox cbVolumeButtons = (CheckBox) view.findViewById(R.id.cbVolumeButtons);
        if(Preferences.getDefaults("volumebuttons", getActivity().getApplication()).equals("true")) {
            cbVolumeButtons.setChecked(true);
        }else{
            cbVolumeButtons.setChecked(false);
        }
        cbVolumeButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbVolumeButtons.isChecked()) {
                    Preferences.setDefaults("volumebuttons", "true", getActivity().getApplicationContext());
                }else {
                    Preferences.setDefaults("volumebuttons", "false", getActivity().getApplicationContext());
                }
            }
        });

        return view;
    }
}
