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

        final TextView tNature_1 = (TextView) view.findViewById(R.id.tNature_1);
        if(Preferences.getDefaults("nature_1", getActivity()).equals("false")) {
            tNature_1.setVisibility(View.VISIBLE);
        }else {
            tNature_1.setVisibility(View.INVISIBLE);
        }

        final CardView nature_1 = (CardView) view.findViewById(R.id.nature_1);
        nature_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                nature_1.startAnimation(anim);

                if (Preferences.getDefaults("nature_1", getActivity()).equals("false")) {
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

                                    if (code.equals("n1jlaek")) {
                                        Preferences.setDefaults("nature_1", "true", getActivity());

                                        tNature_1.setVisibility(View.INVISIBLE);

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
                        Preferences.setDefaults("bgcolor", "nature_1", getActivity());

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

        nature_1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: nature_1")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tNature_2 = (TextView) view.findViewById(R.id.tNature_2);
        if(Preferences.getDefaults("nature_2", getActivity()).equals("false")) {
            tNature_2.setVisibility(View.VISIBLE);
        }else {
            tNature_2.setVisibility(View.INVISIBLE);
        }

        final CardView nature_2 = (CardView) view.findViewById(R.id.nature_2);
        nature_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                nature_2.startAnimation(anim);

                if(Preferences.getDefaults("nature_2", getActivity()).equals("false")) {
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

                                    if(code.equals("n2jlaek")) {
                                        Preferences.setDefaults("nature_2", "true", getActivity());

                                        tNature_2.setVisibility(View.INVISIBLE);

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
                        Preferences.setDefaults("bgcolor", "nature_2", getActivity());

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

        nature_2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: nature_2")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tNature_3 = (TextView) view.findViewById(R.id.tNature_3);
        if(Preferences.getDefaults("nature_3", getActivity()).equals("false")) {
            tNature_3.setVisibility(View.VISIBLE);
        }else {
            tNature_3.setVisibility(View.INVISIBLE);
        }

        final CardView nature_3 = (CardView) view.findViewById(R.id.nature_3);
        nature_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                nature_3.startAnimation(anim);

                if(Preferences.getDefaults("nature_3", getActivity()).equals("false")) {
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

                                    if(code.equals("n3jlaek")) {
                                        Preferences.setDefaults("nature_3", "true", getActivity());

                                        tNature_3.setVisibility(View.INVISIBLE);

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
                        Preferences.setDefaults("bgcolor", "nature_3", getActivity());

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

        nature_3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: nature_3")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tNature_4 = (TextView) view.findViewById(R.id.tNature_4);
        if(Preferences.getDefaults("nature_4", getActivity()).equals("false")) {
            tNature_4.setVisibility(View.VISIBLE);
        }else {
            tNature_4.setVisibility(View.INVISIBLE);
        }

        final CardView nature_4 = (CardView) view.findViewById(R.id.nature_4);
        nature_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                nature_4.startAnimation(anim);

                if(Preferences.getDefaults("nature_4", getActivity()).equals("false")) {
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

                                    if(code.equals("n4jlaek")) {
                                        Preferences.setDefaults("nature_4", "true", getActivity());

                                        tNature_4.setVisibility(View.INVISIBLE);

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
                        Preferences.setDefaults("bgcolor", "nature_4", getActivity());

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

        nature_4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: nature_4")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tNature_5 = (TextView) view.findViewById(R.id.tNature_5);
        if(Preferences.getDefaults("nature_5", getActivity()).equals("false")) {
            tNature_5.setVisibility(View.VISIBLE);
        }else {
            tNature_5.setVisibility(View.INVISIBLE);
        }

        final CardView nature_5 = (CardView) view.findViewById(R.id.nature_5);
        nature_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                nature_5.startAnimation(anim);

                if(Preferences.getDefaults("nature_5", getActivity()).equals("false")) {
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

                                    if(code.equals("n5jlaek")) {
                                        Preferences.setDefaults("nature_5", "true", getActivity());

                                        tNature_5.setVisibility(View.INVISIBLE);

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
                        Preferences.setDefaults("bgcolor", "nature_5", getActivity());

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

        nature_5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: nature_5")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tNature_6 = (TextView) view.findViewById(R.id.tNature_6);
        if(Preferences.getDefaults("nature_6", getActivity()).equals("false")) {
            tNature_6.setVisibility(View.VISIBLE);
        }else {
            tNature_6.setVisibility(View.INVISIBLE);
        }

        final CardView nature_6 = (CardView) view.findViewById(R.id.nature_6);
        nature_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                nature_6.startAnimation(anim);

                if(Preferences.getDefaults("nature_6", getActivity()).equals("false")) {
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

                                    if(code.equals("n6jlaek")) {
                                        Preferences.setDefaults("nature_6", "true", getActivity());

                                        tNature_6.setVisibility(View.INVISIBLE);

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
                        Preferences.setDefaults("bgcolor", "nature_6", getActivity());

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

        nature_6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: nature_6")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tNature_7 = (TextView) view.findViewById(R.id.tNature_7);
        if(Preferences.getDefaults("nature_7", getActivity()).equals("false")) {
            tNature_7.setVisibility(View.VISIBLE);
        }else {
            tNature_7.setVisibility(View.INVISIBLE);
        }

        final CardView nature_7 = (CardView) view.findViewById(R.id.nature_7);
        nature_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                nature_7.startAnimation(anim);

                if (Preferences.getDefaults("nature_7", getActivity()).equals("false")) {
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

                                    if (code.equals("n7jlaek")) {
                                        Preferences.setDefaults("nature_7", "true", getActivity());

                                        tNature_7.setVisibility(View.INVISIBLE);

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
                        Preferences.setDefaults("bgcolor", "nature_7", getActivity());

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

        nature_7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: nature_7")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tNature_8 = (TextView) view.findViewById(R.id.tNature_8);
        if(Preferences.getDefaults("nature_8", getActivity()).equals("false")) {
            tNature_8.setVisibility(View.VISIBLE);
        }else {
            tNature_8.setVisibility(View.INVISIBLE);
        }

        final CardView nature_8 = (CardView) view.findViewById(R.id.nature_8);
        nature_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                nature_8.startAnimation(anim);

                if (Preferences.getDefaults("nature_8", getActivity()).equals("false")) {
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

                                    if (code.equals("n8jlaek")) {
                                        Preferences.setDefaults("nature_8", "true", getActivity());

                                        tNature_8.setVisibility(View.INVISIBLE);

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
                        Preferences.setDefaults("bgcolor", "nature_8", getActivity());

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

        nature_8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: nature_8")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tNature_9 = (TextView) view.findViewById(R.id.tNature_9);
        if(Preferences.getDefaults("nature_9", getActivity()).equals("false")) {
            tNature_9.setVisibility(View.VISIBLE);
        }else {
            tNature_9.setVisibility(View.INVISIBLE);
        }

        final CardView nature_9 = (CardView) view.findViewById(R.id.nature_9);
        nature_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                nature_9.startAnimation(anim);

                if (Preferences.getDefaults("nature_9", getActivity()).equals("false")) {
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

                                    if (code.equals("n9jlaek")) {
                                        Preferences.setDefaults("nature_9", "true", getActivity());

                                        tNature_9.setVisibility(View.INVISIBLE);

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
                        Preferences.setDefaults("bgcolor", "nature_9", getActivity());

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

        nature_9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: nature_9")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tNature_10 = (TextView) view.findViewById(R.id.tNature_10);
        if(Preferences.getDefaults("nature_10", getActivity()).equals("false")) {
            tNature_10.setVisibility(View.VISIBLE);
        }else {
            tNature_10.setVisibility(View.INVISIBLE);
        }

        final CardView nature_10 = (CardView) view.findViewById(R.id.nature_10);
        nature_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                nature_10.startAnimation(anim);

                if (Preferences.getDefaults("nature_10", getActivity()).equals("false")) {
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

                                    if (code.equals("n10jlaek")) {
                                        Preferences.setDefaults("nature_10", "true", getActivity());

                                        tNature_10.setVisibility(View.INVISIBLE);

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
                        Preferences.setDefaults("bgcolor", "nature_10", getActivity());

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

        nature_10.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: nature_10")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tNature_11 = (TextView) view.findViewById(R.id.tNature_11);
        if(Preferences.getDefaults("nature_11", getActivity()).equals("false")) {
            tNature_11.setVisibility(View.VISIBLE);
        }else {
            tNature_11.setVisibility(View.INVISIBLE);
        }

        final CardView nature_11 = (CardView) view.findViewById(R.id.nature_11);
        nature_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                nature_11.startAnimation(anim);

                if (Preferences.getDefaults("nature_11", getActivity()).equals("false")) {
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

                                    if (code.equals("n11jlaek")) {
                                        Preferences.setDefaults("nature_11", "true", getActivity());

                                        tNature_11.setVisibility(View.INVISIBLE);

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
                        Preferences.setDefaults("bgcolor", "nature_11", getActivity());

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

        nature_11.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: nature_11")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tNature_12 = (TextView) view.findViewById(R.id.tNature_12);
        if(Preferences.getDefaults("nature_12", getActivity()).equals("false")) {
            tNature_12.setVisibility(View.VISIBLE);
        }else {
            tNature_12.setVisibility(View.INVISIBLE);
        }

        final CardView nature_12 = (CardView) view.findViewById(R.id.nature_12);
        nature_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                nature_12.startAnimation(anim);

                if (Preferences.getDefaults("nature_12", getActivity()).equals("false")) {
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

                                    if (code.equals("n12jlaek")) {
                                        Preferences.setDefaults("nature_12", "true", getActivity());

                                        tNature_12.setVisibility(View.INVISIBLE);

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
                        Preferences.setDefaults("bgcolor", "nature_12", getActivity());

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

        nature_12.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: nature_12")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tNature_13 = (TextView) view.findViewById(R.id.tNature_13);
        if(Preferences.getDefaults("nature_13", getActivity()).equals("false")) {
            tNature_13.setVisibility(View.VISIBLE);
        }else {
            tNature_13.setVisibility(View.INVISIBLE);
        }

        final CardView nature_13 = (CardView) view.findViewById(R.id.nature_13);
        nature_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                nature_13.startAnimation(anim);

                if (Preferences.getDefaults("nature_13", getActivity()).equals("false")) {
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

                                    if (code.equals("n13jlaek")) {
                                        Preferences.setDefaults("nature_13", "true", getActivity());

                                        tNature_13.setVisibility(View.INVISIBLE);

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
                        Preferences.setDefaults("bgcolor", "nature_13", getActivity());

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

        nature_13.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: nature_13")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        final TextView tNature_14 = (TextView) view.findViewById(R.id.tNature_14);
        if(Preferences.getDefaults("nature_14", getActivity()).equals("false")) {
            tNature_14.setVisibility(View.VISIBLE);
        }else {
            tNature_14.setVisibility(View.INVISIBLE);
        }

        final CardView nature_14 = (CardView) view.findViewById(R.id.nature_14);
        nature_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                nature_14.startAnimation(anim);

                if (Preferences.getDefaults("nature_14", getActivity()).equals("false")) {
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

                                    if (code.equals("n14jlaek")) {
                                        Preferences.setDefaults("nature_14", "true", getActivity());

                                        tNature_14.setVisibility(View.INVISIBLE);

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
                        Preferences.setDefaults("bgcolor", "nature_14", getActivity());

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

        nature_14.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("ID: nature_14")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());

                longClick = true;

                return false;
            }
        });

        if(Preferences.getDefaults("premium", getActivity().getApplicationContext()).equals("true")) {
            Preferences.setDefaults("nature_1", "true", getActivity());
            tNature_1.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("nature_2", "true", getActivity());
            tNature_2.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("nature_3", "true", getActivity());
            tNature_3.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("nature_4", "true", getActivity());
            tNature_4.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("nature_5", "true", getActivity());
            tNature_5.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("nature_6", "true", getActivity());
            tNature_6.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("nature_7", "true", getActivity());
            tNature_7.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("nature_8", "true", getActivity());
            tNature_8.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("nature_9", "true", getActivity());
            tNature_9.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("nature_10", "true", getActivity());
            tNature_10.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("nature_11", "true", getActivity());
            tNature_11.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("nature_12", "true", getActivity());
            tNature_12.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("nature_13", "true", getActivity());
            tNature_13.setVisibility(View.INVISIBLE);

            Preferences.setDefaults("nature_14", "true", getActivity());
            tNature_14.setVisibility(View.INVISIBLE);
        }

        String store = Preferences.getDefaults("store", getActivity().getApplicationContext());

        if(store.contains("nature_1")) {
            Preferences.setDefaults("nature_1", "true", getActivity());
            tNature_1.setVisibility(View.INVISIBLE);
        }

        if(store.contains("nature_2")) {
            Preferences.setDefaults("nature_2", "true", getActivity());
            tNature_2.setVisibility(View.INVISIBLE);
        }

        if(store.contains("nature_3")) {
            Preferences.setDefaults("nature_3", "true", getActivity());
            tNature_3.setVisibility(View.INVISIBLE);
        }

        if(store.contains("nature_4")) {
            Preferences.setDefaults("nature_4", "true", getActivity());
            tNature_4.setVisibility(View.INVISIBLE);
        }

        if(store.contains("nature_5")) {
            Preferences.setDefaults("nature_5", "true", getActivity());
            tNature_5.setVisibility(View.INVISIBLE);
        }

        if(store.contains("nature_6")) {
            Preferences.setDefaults("nature_6", "true", getActivity());
            tNature_6.setVisibility(View.INVISIBLE);
        }

        if(store.contains("nature_7")) {
            Preferences.setDefaults("nature_7", "true", getActivity());
            tNature_7.setVisibility(View.INVISIBLE);
        }

        if(store.contains("nature_8")) {
            Preferences.setDefaults("nature_8", "true", getActivity());
            tNature_8.setVisibility(View.INVISIBLE);
        }

        if(store.contains("nature_9")) {
            Preferences.setDefaults("nature_9", "true", getActivity());
            tNature_9.setVisibility(View.INVISIBLE);
        }

        if(store.contains("nature_10")) {
            Preferences.setDefaults("nature_10", "true", getActivity());
            tNature_10.setVisibility(View.INVISIBLE);
        }

        if(store.contains("nature_11")) {
            Preferences.setDefaults("nature_11", "true", getActivity());
            tNature_11.setVisibility(View.INVISIBLE);
        }

        if(store.contains("nature_12")) {
            Preferences.setDefaults("nature_12", "true", getActivity());
            tNature_12.setVisibility(View.INVISIBLE);
        }

        if(store.contains("nature_13")) {
            Preferences.setDefaults("nature_13", "true", getActivity());
            tNature_13.setVisibility(View.INVISIBLE);
        }

        if(store.contains("nature_14")) {
            Preferences.setDefaults("nature_14", "true", getActivity());
            tNature_14.setVisibility(View.INVISIBLE);
        }

        return view;
    }
}
