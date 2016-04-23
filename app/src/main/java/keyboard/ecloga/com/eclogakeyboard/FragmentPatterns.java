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
import com.afollestad.materialdialogs.MaterialDialog;
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

        final TextView tPattern_1 = (TextView) view.findViewById(R.id.tPattern_1);
        if(Preferences.getDefaults("pattern_1", getActivity()).equals("false")) {
            tPattern_1.setVisibility(View.VISIBLE);
        }else {
            tPattern_1.setVisibility(View.INVISIBLE);
        }

        final CardView pattern_1 = (CardView) view.findViewById(R.id.pattern_1);
        pattern_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                pattern_1.startAnimation(anim);

                if (Preferences.getDefaults("pattern_1", getActivity()).equals("false")) {
                    new MaterialDialog.Builder(getActivity())
                            .title("Unlock theme")
                            .titleColor(getResources().getColor(R.color.gray))
                            .contentColor(getResources().getColor(R.color.gray))
                            .negativeColor(getResources().getColor(R.color.primary))
                            .positiveColor(getResources().getColor(R.color.primary))
                            .backgroundColor(getResources().getColor(R.color.white))
                            .content("Please input activation code you received by email or friend")
                            .inputType(InputType.TYPE_CLASS_TEXT)
                            .input(null, null, new MaterialDialog.InputCallback() {
                                @Override
                                public void onInput(MaterialDialog dialog, CharSequence input) {
                                    String code = String.valueOf(input);

                                    if (code.equals("p1jlaek")) {
                                        Preferences.setDefaults("pattern_1", "true", getActivity());

                                        tPattern_1.setVisibility(View.INVISIBLE);

                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Enjoy!")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    } else {
                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Invalid activation code.")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    }
                                }
                            })
                            .positiveText("Done")
                            .negativeText("Back")
                            .callback(new MaterialDialog.ButtonCallback() {
                                @Override
                                public void onPositive(MaterialDialog dialog) {

                                }
                            })
                            .show();
                } else {
                    if (!longClick) {
                        Preferences.setDefaults("bgcolor", "pattern_1", getActivity());

                        SnackbarManager.show(
                                Snackbar.with(getActivity())
                                        .text("Let's Roll!")
                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                        .color(getResources().getColor(R.color.accent))
                                        .textColor(getResources().getColor(R.color.gray))
                                , getActivity());
                    }
                }
            }
        });

        pattern_1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: pattern_1")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tPattern_2 = (TextView) view.findViewById(R.id.tPattern_2);
        if(Preferences.getDefaults("pattern_2", getActivity()).equals("false")) {
            tPattern_2.setVisibility(View.VISIBLE);
        }else {
            tPattern_2.setVisibility(View.INVISIBLE);
        }

        final CardView pattern_2 = (CardView) view.findViewById(R.id.pattern_2);
        pattern_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                pattern_2.startAnimation(anim);

                if(Preferences.getDefaults("pattern_2", getActivity()).equals("false")) {
                    new MaterialDialog.Builder(getActivity())
                            .title("Unlock theme")
                            .titleColor(getResources().getColor(R.color.gray))
                            .contentColor(getResources().getColor(R.color.gray))
                            .negativeColor(getResources().getColor(R.color.primary))
                            .positiveColor(getResources().getColor(R.color.primary))
                            .backgroundColor(getResources().getColor(R.color.white))
                            .content("Please input activation code you received by email or friend")
                            .inputType(InputType.TYPE_CLASS_TEXT)
                            .input(null, null, new MaterialDialog.InputCallback() {
                                @Override
                                public void onInput(MaterialDialog dialog, CharSequence input) {
                                    String code = String.valueOf(input);

                                    if(code.equals("p2jlaek")) {
                                        Preferences.setDefaults("pattern_2", "true", getActivity());

                                        tPattern_2.setVisibility(View.INVISIBLE);

                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Enjoy!")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    }else {
                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Invalid activation code.")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    }
                                }
                            })
                            .positiveText("Done")
                            .negativeText("Back")
                            .callback(new MaterialDialog.ButtonCallback() {
                                @Override
                                public void onPositive(MaterialDialog dialog) {

                                }
                            })
                            .show();
                }else {
                    if(!longClick) {
                        Preferences.setDefaults("bgcolor", "pattern_2", getActivity());

                        SnackbarManager.show(
                                Snackbar.with(getActivity())
                                        .text("Let's Roll!")
                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                        .color(getResources().getColor(R.color.accent))
                                        .textColor(getResources().getColor(R.color.gray))
                                , getActivity());
                    }
                }
            }
        });

        pattern_2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: pattern_2")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tPattern_3 = (TextView) view.findViewById(R.id.tPattern_3);
        if(Preferences.getDefaults("pattern_3", getActivity()).equals("false")) {
            tPattern_3.setVisibility(View.VISIBLE);
        }else {
            tPattern_3.setVisibility(View.INVISIBLE);
        }

        final CardView pattern_3 = (CardView) view.findViewById(R.id.pattern_3);
        pattern_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                pattern_3.startAnimation(anim);

                if(Preferences.getDefaults("pattern_3", getActivity()).equals("false")) {
                    new MaterialDialog.Builder(getActivity())
                            .title("Unlock theme")
                            .titleColor(getResources().getColor(R.color.gray))
                            .contentColor(getResources().getColor(R.color.gray))
                            .negativeColor(getResources().getColor(R.color.primary))
                            .positiveColor(getResources().getColor(R.color.primary))
                            .backgroundColor(getResources().getColor(R.color.white))
                            .content("Please input activation code you received by email or friend")
                            .inputType(InputType.TYPE_CLASS_TEXT)
                            .input(null, null, new MaterialDialog.InputCallback() {
                                @Override
                                public void onInput(MaterialDialog dialog, CharSequence input) {
                                    String code = String.valueOf(input);

                                    if(code.equals("p3jlaek")) {
                                        Preferences.setDefaults("pattern_3", "true", getActivity());

                                        tPattern_3.setVisibility(View.INVISIBLE);

                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Enjoy!")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    }else {
                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Invalid activation code.")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    }
                                }
                            })
                            .positiveText("Done")
                            .negativeText("Back")
                            .callback(new MaterialDialog.ButtonCallback() {
                                @Override
                                public void onPositive(MaterialDialog dialog) {

                                }
                            })
                            .show();
                }else {
                    if(!longClick) {
                        Preferences.setDefaults("bgcolor", "pattern_3", getActivity());

                        SnackbarManager.show(
                                Snackbar.with(getActivity())
                                        .text("Let's Roll!")
                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                        .color(getResources().getColor(R.color.accent))
                                        .textColor(getResources().getColor(R.color.gray))
                                , getActivity());
                    }
                }
            }
        });

        pattern_3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: pattern_3")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tPattern_4 = (TextView) view.findViewById(R.id.tPattern_4);
        if(Preferences.getDefaults("pattern_4", getActivity()).equals("false")) {
            tPattern_4.setVisibility(View.VISIBLE);
        }else {
            tPattern_4.setVisibility(View.INVISIBLE);
        }

        final CardView pattern_4 = (CardView) view.findViewById(R.id.pattern_4);
        pattern_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                pattern_4.startAnimation(anim);

                if(Preferences.getDefaults("pattern_4", getActivity()).equals("false")) {
                    new MaterialDialog.Builder(getActivity())
                            .title("Unlock theme")
                            .titleColor(getResources().getColor(R.color.gray))
                            .contentColor(getResources().getColor(R.color.gray))
                            .negativeColor(getResources().getColor(R.color.primary))
                            .positiveColor(getResources().getColor(R.color.primary))
                            .backgroundColor(getResources().getColor(R.color.white))
                            .content("Please input activation code you received by email or friend")
                            .inputType(InputType.TYPE_CLASS_TEXT)
                            .input(null, null, new MaterialDialog.InputCallback() {
                                @Override
                                public void onInput(MaterialDialog dialog, CharSequence input) {
                                    String code = String.valueOf(input);

                                    if(code.equals("p4jlaek")) {
                                        Preferences.setDefaults("pattern_4", "true", getActivity());

                                        tPattern_4.setVisibility(View.INVISIBLE);

                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Enjoy!")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    }else {
                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Invalid activation code.")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    }
                                }
                            })
                            .positiveText("Done")
                            .negativeText("Back")
                            .callback(new MaterialDialog.ButtonCallback() {
                                @Override
                                public void onPositive(MaterialDialog dialog) {

                                }
                            })
                            .show();
                }else {
                    if(!longClick) {
                        Preferences.setDefaults("bgcolor", "pattern_4", getActivity());

                        SnackbarManager.show(
                                Snackbar.with(getActivity())
                                        .text("Let's Roll!")
                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                        .color(getResources().getColor(R.color.accent))
                                        .textColor(getResources().getColor(R.color.gray))
                                , getActivity());
                    }
                }
            }
        });

        pattern_4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: pattern_4")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tPattern_5 = (TextView) view.findViewById(R.id.tPattern_5);
        if(Preferences.getDefaults("pattern_5", getActivity()).equals("false")) {
            tPattern_5.setVisibility(View.VISIBLE);
        }else {
            tPattern_5.setVisibility(View.INVISIBLE);
        }

        final CardView pattern_5 = (CardView) view.findViewById(R.id.pattern_5);
        pattern_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                pattern_5.startAnimation(anim);

                if(Preferences.getDefaults("pattern_5", getActivity()).equals("false")) {
                    new MaterialDialog.Builder(getActivity())
                            .title("Unlock theme")
                            .titleColor(getResources().getColor(R.color.gray))
                            .contentColor(getResources().getColor(R.color.gray))
                            .negativeColor(getResources().getColor(R.color.primary))
                            .positiveColor(getResources().getColor(R.color.primary))
                            .backgroundColor(getResources().getColor(R.color.white))
                            .content("Please input activation code you received by email or friend")
                            .inputType(InputType.TYPE_CLASS_TEXT)
                            .input(null, null, new MaterialDialog.InputCallback() {
                                @Override
                                public void onInput(MaterialDialog dialog, CharSequence input) {
                                    String code = String.valueOf(input);

                                    if(code.equals("p5jlaek")) {
                                        Preferences.setDefaults("pattern_5", "true", getActivity());

                                        tPattern_5.setVisibility(View.INVISIBLE);

                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Enjoy!")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    }else {
                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Invalid activation code.")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    }
                                }
                            })
                            .positiveText("Done")
                            .negativeText("Back")
                            .callback(new MaterialDialog.ButtonCallback() {
                                @Override
                                public void onPositive(MaterialDialog dialog) {

                                }
                            })
                            .show();
                }else {
                    if(!longClick) {
                        Preferences.setDefaults("bgcolor", "pattern_5", getActivity());

                        SnackbarManager.show(
                                Snackbar.with(getActivity())
                                        .text("Let's Roll!")
                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                        .color(getResources().getColor(R.color.accent))
                                        .textColor(getResources().getColor(R.color.gray))
                                , getActivity());
                    }
                }
            }
        });

        pattern_5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: pattern_5")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tPattern_6 = (TextView) view.findViewById(R.id.tPattern_6);
        if(Preferences.getDefaults("pattern_6", getActivity()).equals("false")) {
            tPattern_6.setVisibility(View.VISIBLE);
        }else {
            tPattern_6.setVisibility(View.INVISIBLE);
        }

        final CardView pattern_6 = (CardView) view.findViewById(R.id.pattern_6);
        pattern_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                pattern_6.startAnimation(anim);

                if(Preferences.getDefaults("pattern_6", getActivity()).equals("false")) {
                    new MaterialDialog.Builder(getActivity())
                            .title("Unlock theme")
                            .titleColor(getResources().getColor(R.color.gray))
                            .contentColor(getResources().getColor(R.color.gray))
                            .negativeColor(getResources().getColor(R.color.primary))
                            .positiveColor(getResources().getColor(R.color.primary))
                            .backgroundColor(getResources().getColor(R.color.white))
                            .content("Please input activation code you received by email or friend")
                            .inputType(InputType.TYPE_CLASS_TEXT)
                            .input(null, null, new MaterialDialog.InputCallback() {
                                @Override
                                public void onInput(MaterialDialog dialog, CharSequence input) {
                                    String code = String.valueOf(input);

                                    if(code.equals("p6jlaek")) {
                                        Preferences.setDefaults("pattern_6", "true", getActivity());

                                        tPattern_6.setVisibility(View.INVISIBLE);

                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Enjoy!")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    }else {
                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Invalid activation code.")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    }
                                }
                            })
                            .positiveText("Done")
                            .negativeText("Back")
                            .callback(new MaterialDialog.ButtonCallback() {
                                @Override
                                public void onPositive(MaterialDialog dialog) {

                                }
                            })
                            .show();
                }else {
                    if(!longClick) {
                        Preferences.setDefaults("bgcolor", "pattern_6", getActivity());

                        SnackbarManager.show(
                                Snackbar.with(getActivity())
                                        .text("Let's Roll!")
                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                        .color(getResources().getColor(R.color.accent))
                                        .textColor(getResources().getColor(R.color.gray))
                                , getActivity());
                    }
                }
            }
        });

        pattern_6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: pattern_6")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tPattern_7 = (TextView) view.findViewById(R.id.tPattern_7);
        if(Preferences.getDefaults("pattern_7", getActivity()).equals("false")) {
            tPattern_7.setVisibility(View.VISIBLE);
        }else {
            tPattern_7.setVisibility(View.INVISIBLE);
        }

        final CardView pattern_7 = (CardView) view.findViewById(R.id.pattern_7);
        pattern_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                pattern_7.startAnimation(anim);

                if (Preferences.getDefaults("pattern_7", getActivity()).equals("false")) {
                    new MaterialDialog.Builder(getActivity())
                            .title("Unlock theme")
                            .titleColor(getResources().getColor(R.color.gray))
                            .contentColor(getResources().getColor(R.color.gray))
                            .negativeColor(getResources().getColor(R.color.primary))
                            .positiveColor(getResources().getColor(R.color.primary))
                            .backgroundColor(getResources().getColor(R.color.white))
                            .content("Please input activation code you received by email or friend")
                            .inputType(InputType.TYPE_CLASS_TEXT)
                            .input(null, null, new MaterialDialog.InputCallback() {
                                @Override
                                public void onInput(MaterialDialog dialog, CharSequence input) {
                                    String code = String.valueOf(input);

                                    if (code.equals("p7jlaek")) {
                                        Preferences.setDefaults("pattern_7", "true", getActivity());

                                        tPattern_7.setVisibility(View.INVISIBLE);

                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Enjoy!")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    } else {
                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Invalid activation code.")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    }
                                }
                            })
                            .positiveText("Done")
                            .negativeText("Back")
                            .callback(new MaterialDialog.ButtonCallback() {
                                @Override
                                public void onPositive(MaterialDialog dialog) {

                                }
                            })
                            .show();
                } else {
                    if(!longClick) {
                        Preferences.setDefaults("bgcolor", "pattern_7", getActivity());

                        SnackbarManager.show(
                                Snackbar.with(getActivity())
                                        .text("Let's Roll!")
                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                        .color(getResources().getColor(R.color.accent))
                                        .textColor(getResources().getColor(R.color.gray))
                                , getActivity());
                    }
                }
            }
        });

        pattern_7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: pattern_7")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tPattern_8 = (TextView) view.findViewById(R.id.tPattern_8);
        if(Preferences.getDefaults("pattern_8", getActivity()).equals("false")) {
            tPattern_8.setVisibility(View.VISIBLE);
        }else {
            tPattern_8.setVisibility(View.INVISIBLE);
        }

        final CardView pattern_8 = (CardView) view.findViewById(R.id.pattern_8);
        pattern_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                pattern_8.startAnimation(anim);

                if (Preferences.getDefaults("pattern_8", getActivity()).equals("false")) {
                    new MaterialDialog.Builder(getActivity())
                            .title("Unlock theme")
                            .titleColor(getResources().getColor(R.color.gray))
                            .contentColor(getResources().getColor(R.color.gray))
                            .negativeColor(getResources().getColor(R.color.primary))
                            .positiveColor(getResources().getColor(R.color.primary))
                            .backgroundColor(getResources().getColor(R.color.white))
                            .content("Please input activation code you received by email or friend")
                            .inputType(InputType.TYPE_CLASS_TEXT)
                            .input(null, null, new MaterialDialog.InputCallback() {
                                @Override
                                public void onInput(MaterialDialog dialog, CharSequence input) {
                                    String code = String.valueOf(input);

                                    if (code.equals("p8jlaek")) {
                                        Preferences.setDefaults("pattern_8", "true", getActivity());

                                        tPattern_8.setVisibility(View.INVISIBLE);

                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Enjoy!")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    } else {
                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Invalid activation code.")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    }
                                }
                            })
                            .positiveText("Done")
                            .negativeText("Back")
                            .callback(new MaterialDialog.ButtonCallback() {
                                @Override
                                public void onPositive(MaterialDialog dialog) {

                                }
                            })
                            .show();
                } else {
                    if(!longClick) {
                        Preferences.setDefaults("bgcolor", "pattern_8", getActivity());

                        SnackbarManager.show(
                                Snackbar.with(getActivity())
                                        .text("Let's Roll!")
                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                        .color(getResources().getColor(R.color.accent))
                                        .textColor(getResources().getColor(R.color.gray))
                                , getActivity());
                    }
                }
            }
        });

        pattern_8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: pattern_8")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tPattern_9 = (TextView) view.findViewById(R.id.tPattern_9);
        if(Preferences.getDefaults("pattern_9", getActivity()).equals("false")) {
            tPattern_9.setVisibility(View.VISIBLE);
        }else {
            tPattern_9.setVisibility(View.INVISIBLE);
        }

        final CardView pattern_9 = (CardView) view.findViewById(R.id.pattern_9);
        pattern_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                pattern_9.startAnimation(anim);

                if (Preferences.getDefaults("pattern_9", getActivity()).equals("false")) {
                    new MaterialDialog.Builder(getActivity())
                            .title("Unlock theme")
                            .titleColor(getResources().getColor(R.color.gray))
                            .contentColor(getResources().getColor(R.color.gray))
                            .negativeColor(getResources().getColor(R.color.primary))
                            .positiveColor(getResources().getColor(R.color.primary))
                            .backgroundColor(getResources().getColor(R.color.white))
                            .content("Please input activation code you received by email or friend")
                            .inputType(InputType.TYPE_CLASS_TEXT)
                            .input(null, null, new MaterialDialog.InputCallback() {
                                @Override
                                public void onInput(MaterialDialog dialog, CharSequence input) {
                                    String code = String.valueOf(input);

                                    if (code.equals("p9jlaek")) {
                                        Preferences.setDefaults("pattern_9", "true", getActivity());

                                        tPattern_9.setVisibility(View.INVISIBLE);

                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Enjoy!")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    } else {
                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Invalid activation code.")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    }
                                }
                            })
                            .positiveText("Done")
                            .negativeText("Back")
                            .callback(new MaterialDialog.ButtonCallback() {
                                @Override
                                public void onPositive(MaterialDialog dialog) {

                                }
                            })
                            .show();
                } else {
                    if(!longClick) {
                        Preferences.setDefaults("bgcolor", "pattern_9", getActivity());

                        SnackbarManager.show(
                                Snackbar.with(getActivity())
                                        .text("Let's Roll!")
                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                        .color(getResources().getColor(R.color.accent))
                                        .textColor(getResources().getColor(R.color.gray))
                                , getActivity());
                    }
                }
            }
        });

        pattern_9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: pattern_9")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tPattern_10 = (TextView) view.findViewById(R.id.tPattern_10);
        if(Preferences.getDefaults("pattern_10", getActivity()).equals("false")) {
            tPattern_10.setVisibility(View.VISIBLE);
        }else {
            tPattern_10.setVisibility(View.INVISIBLE);
        }

        final CardView pattern_10 = (CardView) view.findViewById(R.id.pattern_10);
        pattern_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                pattern_10.startAnimation(anim);

                if (Preferences.getDefaults("pattern_10", getActivity()).equals("false")) {
                    new MaterialDialog.Builder(getActivity())
                            .title("Unlock theme")
                            .titleColor(getResources().getColor(R.color.gray))
                            .contentColor(getResources().getColor(R.color.gray))
                            .negativeColor(getResources().getColor(R.color.primary))
                            .positiveColor(getResources().getColor(R.color.primary))
                            .backgroundColor(getResources().getColor(R.color.white))
                            .content("Please input activation code you received by email or friend")
                            .inputType(InputType.TYPE_CLASS_TEXT)
                            .input(null, null, new MaterialDialog.InputCallback() {
                                @Override
                                public void onInput(MaterialDialog dialog, CharSequence input) {
                                    String code = String.valueOf(input);

                                    if (code.equals("p10jlaek")) {
                                        Preferences.setDefaults("pattern_10", "true", getActivity());

                                        tPattern_10.setVisibility(View.INVISIBLE);

                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Enjoy!")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    } else {
                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Invalid activation code.")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    }
                                }
                            })
                            .positiveText("Done")
                            .negativeText("Back")
                            .callback(new MaterialDialog.ButtonCallback() {
                                @Override
                                public void onPositive(MaterialDialog dialog) {

                                }
                            })
                            .show();
                } else {
                    if(!longClick) {
                        Preferences.setDefaults("bgcolor", "pattern_10", getActivity());

                        SnackbarManager.show(
                                Snackbar.with(getActivity())
                                        .text("Let's Roll!")
                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                        .color(getResources().getColor(R.color.accent))
                                        .textColor(getResources().getColor(R.color.gray))
                                , getActivity());
                    }
                }
            }
        });

        pattern_10.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: pattern_10")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tPattern_11 = (TextView) view.findViewById(R.id.tPattern_11);
        if(Preferences.getDefaults("pattern_11", getActivity()).equals("false")) {
            tPattern_11.setVisibility(View.VISIBLE);
        }else {
            tPattern_11.setVisibility(View.INVISIBLE);
        }

        final CardView pattern_11 = (CardView) view.findViewById(R.id.pattern_11);
        pattern_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                pattern_11.startAnimation(anim);

                if (Preferences.getDefaults("pattern_11", getActivity()).equals("false")) {
                    new MaterialDialog.Builder(getActivity())
                            .title("Unlock theme")
                            .titleColor(getResources().getColor(R.color.gray))
                            .contentColor(getResources().getColor(R.color.gray))
                            .negativeColor(getResources().getColor(R.color.primary))
                            .positiveColor(getResources().getColor(R.color.primary))
                            .backgroundColor(getResources().getColor(R.color.white))
                            .content("Please input activation code you received by email or friend")
                            .inputType(InputType.TYPE_CLASS_TEXT)
                            .input(null, null, new MaterialDialog.InputCallback() {
                                @Override
                                public void onInput(MaterialDialog dialog, CharSequence input) {
                                    String code = String.valueOf(input);

                                    if (code.equals("p11jlaek")) {
                                        Preferences.setDefaults("pattern_11", "true", getActivity());

                                        tPattern_11.setVisibility(View.INVISIBLE);

                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Enjoy!")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    } else {
                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Invalid activation code.")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    }
                                }
                            })
                            .positiveText("Done")
                            .negativeText("Back")
                            .callback(new MaterialDialog.ButtonCallback() {
                                @Override
                                public void onPositive(MaterialDialog dialog) {

                                }
                            })
                            .show();
                } else {
                    if(!longClick) {
                        Preferences.setDefaults("bgcolor", "pattern_11", getActivity());

                        SnackbarManager.show(
                                Snackbar.with(getActivity())
                                        .text("Let's Roll!")
                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                        .color(getResources().getColor(R.color.accent))
                                        .textColor(getResources().getColor(R.color.gray))
                                , getActivity());
                    }
                }
            }
        });

        pattern_11.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: pattern_11")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tPattern_12 = (TextView) view.findViewById(R.id.tPattern_12);
        if(Preferences.getDefaults("pattern_12", getActivity()).equals("false")) {
            tPattern_12.setVisibility(View.VISIBLE);
        }else {
            tPattern_12.setVisibility(View.INVISIBLE);
        }

        final CardView pattern_12 = (CardView) view.findViewById(R.id.pattern_12);
        pattern_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                pattern_12.startAnimation(anim);

                if (Preferences.getDefaults("pattern_12", getActivity()).equals("false")) {
                    new MaterialDialog.Builder(getActivity())
                            .title("Unlock theme")
                            .titleColor(getResources().getColor(R.color.gray))
                            .contentColor(getResources().getColor(R.color.gray))
                            .negativeColor(getResources().getColor(R.color.primary))
                            .positiveColor(getResources().getColor(R.color.primary))
                            .backgroundColor(getResources().getColor(R.color.white))
                            .content("Please input activation code you received by email or friend")
                            .inputType(InputType.TYPE_CLASS_TEXT)
                            .input(null, null, new MaterialDialog.InputCallback() {
                                @Override
                                public void onInput(MaterialDialog dialog, CharSequence input) {
                                    String code = String.valueOf(input);

                                    if (code.equals("p12jlaek")) {
                                        Preferences.setDefaults("pattern_12", "true", getActivity());

                                        tPattern_12.setVisibility(View.INVISIBLE);

                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Enjoy!")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    } else {
                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Invalid activation code.")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    }
                                }
                            })
                            .positiveText("Done")
                            .negativeText("Back")
                            .callback(new MaterialDialog.ButtonCallback() {
                                @Override
                                public void onPositive(MaterialDialog dialog) {

                                }
                            })
                            .show();
                } else {
                    if(!longClick) {
                        Preferences.setDefaults("bgcolor", "pattern_12", getActivity());

                        SnackbarManager.show(
                                Snackbar.with(getActivity())
                                        .text("Let's Roll!")
                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                        .color(getResources().getColor(R.color.accent))
                                        .textColor(getResources().getColor(R.color.gray))
                                , getActivity());
                    }
                }
            }
        });

        pattern_12.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: pattern_12")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tPattern_13 = (TextView) view.findViewById(R.id.tPattern_13);
        if(Preferences.getDefaults("pattern_13", getActivity()).equals("false")) {
            tPattern_13.setVisibility(View.VISIBLE);
        }else {
            tPattern_13.setVisibility(View.INVISIBLE);
        }

        final CardView pattern_13 = (CardView) view.findViewById(R.id.pattern_13);
        pattern_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                pattern_13.startAnimation(anim);

                if (Preferences.getDefaults("pattern_13", getActivity()).equals("false")) {
                    new MaterialDialog.Builder(getActivity())
                            .title("Unlock theme")
                            .titleColor(getResources().getColor(R.color.gray))
                            .contentColor(getResources().getColor(R.color.gray))
                            .negativeColor(getResources().getColor(R.color.primary))
                            .positiveColor(getResources().getColor(R.color.primary))
                            .backgroundColor(getResources().getColor(R.color.white))
                            .content("Please input activation code you received by email or friend")
                            .inputType(InputType.TYPE_CLASS_TEXT)
                            .input(null, null, new MaterialDialog.InputCallback() {
                                @Override
                                public void onInput(MaterialDialog dialog, CharSequence input) {
                                    String code = String.valueOf(input);

                                    if (code.equals("p13jlaek")) {
                                        Preferences.setDefaults("pattern_13", "true", getActivity());

                                        tPattern_13.setVisibility(View.INVISIBLE);

                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Enjoy!")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    } else {
                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Invalid activation code.")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    }
                                }
                            })
                            .positiveText("Done")
                            .negativeText("Back")
                            .callback(new MaterialDialog.ButtonCallback() {
                                @Override
                                public void onPositive(MaterialDialog dialog) {

                                }
                            })
                            .show();
                } else {
                    if(!longClick) {
                        Preferences.setDefaults("bgcolor", "pattern_13", getActivity());

                        SnackbarManager.show(
                                Snackbar.with(getActivity())
                                        .text("Let's Roll!")
                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                        .color(getResources().getColor(R.color.accent))
                                        .textColor(getResources().getColor(R.color.gray))
                                , getActivity());
                    }
                }
            }
        });

        pattern_13.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: pattern_13")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tPattern_14 = (TextView) view.findViewById(R.id.tPattern_14);
        if(Preferences.getDefaults("pattern_14", getActivity()).equals("false")) {
            tPattern_14.setVisibility(View.VISIBLE);
        }else {
            tPattern_14.setVisibility(View.INVISIBLE);
        }

        final CardView pattern_14 = (CardView) view.findViewById(R.id.pattern_14);
        pattern_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                pattern_14.startAnimation(anim);

                if (Preferences.getDefaults("pattern_14", getActivity()).equals("false")) {
                    new MaterialDialog.Builder(getActivity())
                            .title("Unlock theme")
                            .titleColor(getResources().getColor(R.color.gray))
                            .contentColor(getResources().getColor(R.color.gray))
                            .negativeColor(getResources().getColor(R.color.primary))
                            .positiveColor(getResources().getColor(R.color.primary))
                            .backgroundColor(getResources().getColor(R.color.white))
                            .content("Please input activation code you received by email or friend")
                            .inputType(InputType.TYPE_CLASS_TEXT)
                            .input(null, null, new MaterialDialog.InputCallback() {
                                @Override
                                public void onInput(MaterialDialog dialog, CharSequence input) {
                                    String code = String.valueOf(input);

                                    if (code.equals("p14jlaek")) {
                                        Preferences.setDefaults("pattern_14", "true", getActivity());

                                        tPattern_14.setVisibility(View.INVISIBLE);

                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Enjoy!")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    } else {
                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Invalid activation code.")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    }
                                }
                            })
                            .positiveText("Done")
                            .negativeText("Back")
                            .callback(new MaterialDialog.ButtonCallback() {
                                @Override
                                public void onPositive(MaterialDialog dialog) {

                                }
                            })
                            .show();
                } else {
                    if(!longClick) {
                        Preferences.setDefaults("bgcolor", "pattern_14", getActivity());

                        SnackbarManager.show(
                                Snackbar.with(getActivity())
                                        .text("Let's Roll!")
                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                        .color(getResources().getColor(R.color.accent))
                                        .textColor(getResources().getColor(R.color.gray))
                                , getActivity());
                    }
                }
            }
        });

        pattern_14.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: pattern_14")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tPattern_15 = (TextView) view.findViewById(R.id.tPattern_15);
        if(Preferences.getDefaults("pattern_15", getActivity()).equals("false")) {
            tPattern_15.setVisibility(View.VISIBLE);
        }else {
            tPattern_15.setVisibility(View.INVISIBLE);
        }

        final CardView pattern_15 = (CardView) view.findViewById(R.id.pattern_15);
        pattern_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                pattern_15.startAnimation(anim);

                if (Preferences.getDefaults("pattern_15", getActivity()).equals("false")) {
                    new MaterialDialog.Builder(getActivity())
                            .title("Unlock theme")
                            .titleColor(getResources().getColor(R.color.gray))
                            .contentColor(getResources().getColor(R.color.gray))
                            .negativeColor(getResources().getColor(R.color.primary))
                            .positiveColor(getResources().getColor(R.color.primary))
                            .backgroundColor(getResources().getColor(R.color.white))
                            .content("Please input activation code you received by email or friend")
                            .inputType(InputType.TYPE_CLASS_TEXT)
                            .input(null, null, new MaterialDialog.InputCallback() {
                                @Override
                                public void onInput(MaterialDialog dialog, CharSequence input) {
                                    String code = String.valueOf(input);

                                    if (code.equals("p15jlaek")) {
                                        Preferences.setDefaults("pattern_15", "true", getActivity());

                                        tPattern_15.setVisibility(View.INVISIBLE);

                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Enjoy!")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    } else {
                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Invalid activation code.")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    }
                                }
                            })
                            .positiveText("Done")
                            .negativeText("Back")
                            .callback(new MaterialDialog.ButtonCallback() {
                                @Override
                                public void onPositive(MaterialDialog dialog) {

                                }
                            })
                            .show();
                } else {
                    if(!longClick) {
                        Preferences.setDefaults("bgcolor", "pattern_15", getActivity());

                        SnackbarManager.show(
                                Snackbar.with(getActivity())
                                        .text("Let's Roll!")
                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                        .color(getResources().getColor(R.color.accent))
                                        .textColor(getResources().getColor(R.color.gray))
                                , getActivity());
                    }
                }
            }
        });

        pattern_15.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: pattern_15")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tPattern_16 = (TextView) view.findViewById(R.id.tPattern_16);
        if(Preferences.getDefaults("pattern_16", getActivity()).equals("false")) {
            tPattern_16.setVisibility(View.VISIBLE);
        }else {
            tPattern_16.setVisibility(View.INVISIBLE);
        }

        final CardView pattern_16 = (CardView) view.findViewById(R.id.pattern_16);
        pattern_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                pattern_16.startAnimation(anim);

                if (Preferences.getDefaults("pattern_16", getActivity()).equals("false")) {
                    new MaterialDialog.Builder(getActivity())
                            .title("Unlock theme")
                            .titleColor(getResources().getColor(R.color.gray))
                            .contentColor(getResources().getColor(R.color.gray))
                            .negativeColor(getResources().getColor(R.color.primary))
                            .positiveColor(getResources().getColor(R.color.primary))
                            .backgroundColor(getResources().getColor(R.color.white))
                            .content("Please input activation code you received by email or friend")
                            .inputType(InputType.TYPE_CLASS_TEXT)
                            .input(null, null, new MaterialDialog.InputCallback() {
                                @Override
                                public void onInput(MaterialDialog dialog, CharSequence input) {
                                    String code = String.valueOf(input);

                                    if (code.equals("p16jlaek")) {
                                        Preferences.setDefaults("pattern_16", "true", getActivity());

                                        tPattern_16.setVisibility(View.INVISIBLE);

                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Enjoy!")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    } else {
                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Invalid activation code.")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    }
                                }
                            })
                            .positiveText("Done")
                            .negativeText("Back")
                            .callback(new MaterialDialog.ButtonCallback() {
                                @Override
                                public void onPositive(MaterialDialog dialog) {

                                }
                            })
                            .show();
                } else {
                    if(!longClick) {
                        Preferences.setDefaults("bgcolor", "pattern_16", getActivity());

                        SnackbarManager.show(
                                Snackbar.with(getActivity())
                                        .text("Let's Roll!")
                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                        .color(getResources().getColor(R.color.accent))
                                        .textColor(getResources().getColor(R.color.gray))
                                , getActivity());
                    }
                }
            }
        });

        pattern_16.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: pattern_16")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tPattern_17 = (TextView) view.findViewById(R.id.tPattern_17);
        if(Preferences.getDefaults("pattern_17", getActivity()).equals("false")) {
            tPattern_17.setVisibility(View.VISIBLE);
        }else {
            tPattern_17.setVisibility(View.INVISIBLE);
        }

        final CardView pattern_17 = (CardView) view.findViewById(R.id.pattern_17);
        pattern_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                pattern_17.startAnimation(anim);

                if (Preferences.getDefaults("pattern_17", getActivity()).equals("false")) {
                    new MaterialDialog.Builder(getActivity())
                            .title("Unlock theme")
                            .titleColor(getResources().getColor(R.color.gray))
                            .contentColor(getResources().getColor(R.color.gray))
                            .negativeColor(getResources().getColor(R.color.primary))
                            .positiveColor(getResources().getColor(R.color.primary))
                            .backgroundColor(getResources().getColor(R.color.white))
                            .content("Please input activation code you received by email or friend")
                            .inputType(InputType.TYPE_CLASS_TEXT)
                            .input(null, null, new MaterialDialog.InputCallback() {
                                @Override
                                public void onInput(MaterialDialog dialog, CharSequence input) {
                                    String code = String.valueOf(input);

                                    if (code.equals("p17jlaek")) {
                                        Preferences.setDefaults("pattern_17", "true", getActivity());

                                        tPattern_17.setVisibility(View.INVISIBLE);

                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Enjoy!")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    } else {
                                        SnackbarManager.show(
                                                Snackbar.with(getActivity())
                                                        .text("Invalid activation code.")
                                                        .color(R.color.white)
                                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                                        .color(getResources().getColor(R.color.accent))
                                                        .textColor(getResources().getColor(R.color.gray))
                                                , getActivity());
                                    }
                                }
                            })
                            .positiveText("Done")
                            .negativeText("Back")
                            .callback(new MaterialDialog.ButtonCallback() {
                                @Override
                                public void onPositive(MaterialDialog dialog) {

                                }
                            })
                            .show();
                } else {
                    if (!longClick) {
                        Preferences.setDefaults("bgcolor", "pattern_17", getActivity());

                        SnackbarManager.show(
                                Snackbar.with(getActivity())
                                        .text("Let's Roll!")
                                        .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                        .color(getResources().getColor(R.color.accent))
                                        .textColor(getResources().getColor(R.color.gray))
                                , getActivity());
                    }
                }
            }
        });

        pattern_17.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: pattern_17")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        if(Preferences.getDefaults("premium", getActivity().getApplicationContext()).equals("true")) {
            Preferences.setDefaults("pattern_1", "true", getActivity());
            tPattern_1.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("pattern_2", "true", getActivity());
            tPattern_2.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("pattern_3", "true", getActivity());
            tPattern_3.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("pattern_4", "true", getActivity());
            tPattern_4.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("pattern_5", "true", getActivity());
            tPattern_5.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("pattern_6", "true", getActivity());
            tPattern_6.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("pattern_7", "true", getActivity());
            tPattern_7.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("pattern_8", "true", getActivity());
            tPattern_8.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("pattern_9", "true", getActivity());
            tPattern_9.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("pattern_10", "true", getActivity());
            tPattern_10.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("pattern_11", "true", getActivity());
            tPattern_11.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("pattern_12", "true", getActivity());
            tPattern_12.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("pattern_13", "true", getActivity());
            tPattern_13.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("pattern_14", "true", getActivity());
            tPattern_14.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("pattern_15", "true", getActivity());
            tPattern_15.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("pattern_16", "true", getActivity());
            tPattern_16.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("pattern_17", "true", getActivity());
            tPattern_17.setVisibility(View.INVISIBLE);
        }

        String store = Preferences.getDefaults("store", getActivity().getApplicationContext());

        if(store.contains("pattern_1")) {
            Preferences.setDefaults("pattern_1", "true", getActivity());
            tPattern_1.setVisibility(View.INVISIBLE);
        }

        if(store.contains("pattern_2")) {
            Preferences.setDefaults("pattern_2", "true", getActivity());
            tPattern_2.setVisibility(View.INVISIBLE);
        }

        if(store.contains("pattern_3")) {
            Preferences.setDefaults("pattern_3", "true", getActivity());
            tPattern_3.setVisibility(View.INVISIBLE);
        }

        if(store.contains("pattern_4")) {
            Preferences.setDefaults("pattern_4", "true", getActivity());
            tPattern_4.setVisibility(View.INVISIBLE);
        }

        if(store.contains("pattern_5")) {
            Preferences.setDefaults("pattern_5", "true", getActivity());
            tPattern_5.setVisibility(View.INVISIBLE);
        }

        if(store.contains("pattern_6")) {
            Preferences.setDefaults("pattern_6", "true", getActivity());
            tPattern_6.setVisibility(View.INVISIBLE);
        }

        if(store.contains("pattern_7")) {
            Preferences.setDefaults("pattern_7", "true", getActivity());
            tPattern_7.setVisibility(View.INVISIBLE);
        }

        if(store.contains("pattern_8")) {
            Preferences.setDefaults("pattern_8", "true", getActivity());
            tPattern_8.setVisibility(View.INVISIBLE);
        }

        if(store.contains("pattern_9")) {
            Preferences.setDefaults("pattern_9", "true", getActivity());
            tPattern_9.setVisibility(View.INVISIBLE);
        }

        if(store.contains("pattern_10")) {
            Preferences.setDefaults("pattern_10", "true", getActivity());
            tPattern_10.setVisibility(View.INVISIBLE);
        }

        if(store.contains("pattern_11")) {
            Preferences.setDefaults("pattern_11", "true", getActivity());
            tPattern_11.setVisibility(View.INVISIBLE);
        }

        if(store.contains("pattern_12")) {
            Preferences.setDefaults("pattern_12", "true", getActivity());
            tPattern_12.setVisibility(View.INVISIBLE);
        }

        if(store.contains("pattern_13")) {
            Preferences.setDefaults("pattern_13", "true", getActivity());
            tPattern_13.setVisibility(View.INVISIBLE);
        }

        if(store.contains("pattern_14")) {
            Preferences.setDefaults("pattern_14", "true", getActivity());
            tPattern_14.setVisibility(View.INVISIBLE);
        }

        if(store.contains("pattern_15")) {
            Preferences.setDefaults("pattern_15", "true", getActivity());
            tPattern_15.setVisibility(View.INVISIBLE);
        }

        if(store.contains("pattern_16")) {
            Preferences.setDefaults("pattern_16", "true", getActivity());
            tPattern_16.setVisibility(View.INVISIBLE);
        }

        if(store.contains("pattern_17")) {
            Preferences.setDefaults("pattern_17", "true", getActivity());
            tPattern_17.setVisibility(View.INVISIBLE);
        }

        return view;
    }
}
