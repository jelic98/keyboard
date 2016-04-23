package keyboard.ecloga.com.eclogakeyboard;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
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

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FragmentSounds extends android.support.v4.app.Fragment implements View.OnClickListener{

    public FragmentSounds() {

    }

    Drawable DRAWABLE_V, DRAWABLE_C, DRAWABLE_H;
    MediaPlayer mp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.sounds, container, false);

        DRAWABLE_V = getResources().getDrawable(R.drawable.vertical_img);
        DRAWABLE_V.setColorFilter(getResources().getColor(R.color.primary), PorterDuff.Mode.MULTIPLY);

        DRAWABLE_C = getResources().getDrawable(R.drawable.click_img);
        DRAWABLE_C.setColorFilter(getResources().getColor(R.color.primary), PorterDuff.Mode.MULTIPLY);

        DRAWABLE_H = getResources().getDrawable(R.drawable.horizontal_img);
        DRAWABLE_H.setColorFilter(getResources().getColor(R.color.primary), PorterDuff.Mode.MULTIPLY);

        CardView cardView = (CardView) view.findViewById(R.id.cardView);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
                view.startAnimation(anim);

                Preferences.setDefaults("sound_v", "none", getActivity().getApplicationContext());
                Preferences.setDefaults("sound_c", "none", getActivity().getApplicationContext());
                Preferences.setDefaults("sound_h", "none", getActivity().getApplicationContext());

                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("Why you don't like to hear stuff?")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());
            }
        });

        TextView bubble = (TextView) view.findViewById(R.id.bubble);
        bubble.setOnClickListener(this);
        bubble.setSoundEffectsEnabled(false);

        ImageView bubble_v = (ImageView) view.findViewById(R.id.bubble_v);
        bubble_v.setImageDrawable(DRAWABLE_V);
        bubble_v.setOnClickListener(this);

        ImageView bubble_c = (ImageView) view.findViewById(R.id.bubble_c);
        bubble_c.setImageDrawable(DRAWABLE_C);
        bubble_c.setOnClickListener(this);

        ImageView bubble_h = (ImageView) view.findViewById(R.id.bubble_h);
        bubble_h.setImageDrawable(DRAWABLE_H);
        bubble_h.setOnClickListener(this);


        TextView click = (TextView) view.findViewById(R.id.click);
        click.setOnClickListener(this);
        click.setSoundEffectsEnabled(false);

        ImageView click_v = (ImageView) view.findViewById(R.id.click_v);
        click_v.setImageDrawable(DRAWABLE_V);
        click_v.setOnClickListener(this);

        ImageView click_c = (ImageView) view.findViewById(R.id.click_c);
        click_c.setImageDrawable(DRAWABLE_C);
        click_c.setOnClickListener(this);

        ImageView click_h = (ImageView) view.findViewById(R.id.click_h);
        click_h.setImageDrawable(DRAWABLE_H);
        click_h.setOnClickListener(this);


        TextView swoosh = (TextView) view.findViewById(R.id.swoosh);
        swoosh.setOnClickListener(this);
        swoosh.setSoundEffectsEnabled(false);

        ImageView swoosh_v = (ImageView) view.findViewById(R.id.swoosh_v);
        swoosh_v.setImageDrawable(DRAWABLE_V);
        swoosh_v.setOnClickListener(this);

        ImageView swoosh_c = (ImageView) view.findViewById(R.id.swoosh_c);
        swoosh_c.setImageDrawable(DRAWABLE_C);
        swoosh_c.setOnClickListener(this);

        ImageView swoosh_h = (ImageView) view.findViewById(R.id.swoosh_h);
        swoosh_h.setImageDrawable(DRAWABLE_H);
        swoosh_h.setOnClickListener(this);


        TextView water = (TextView) view.findViewById(R.id.water);
        water.setOnClickListener(this);
        water.setSoundEffectsEnabled(false);

        ImageView water_v = (ImageView) view.findViewById(R.id.water_v);
        water_v.setImageDrawable(DRAWABLE_V);
        water_v.setOnClickListener(this);

        ImageView water_c = (ImageView) view.findViewById(R.id.water_c);
        water_c.setImageDrawable(DRAWABLE_C);
        water_c.setOnClickListener(this);

        ImageView water_h = (ImageView) view.findViewById(R.id.water_h);
        water_h.setImageDrawable(DRAWABLE_H);
        water_h.setOnClickListener(this);


        TextView metal = (TextView) view.findViewById(R.id.metal);
        metal.setOnClickListener(this);
        metal.setSoundEffectsEnabled(false);

        ImageView metal_v = (ImageView) view.findViewById(R.id.metal_v);
        metal_v.setImageDrawable(DRAWABLE_V);
        metal_v.setOnClickListener(this);

        ImageView metal_c = (ImageView) view.findViewById(R.id.metal_c);
        metal_c.setImageDrawable(DRAWABLE_C);
        metal_c.setOnClickListener(this);

        ImageView metal_h = (ImageView) view.findViewById(R.id.metal_h);
        metal_h.setImageDrawable(DRAWABLE_H);
        metal_h.setOnClickListener(this);


        TextView plastic = (TextView) view.findViewById(R.id.plastic);
        plastic.setOnClickListener(this);
        plastic.setSoundEffectsEnabled(false);

        ImageView plastic_v = (ImageView) view.findViewById(R.id.plastic_v);
        plastic_v.setImageDrawable(DRAWABLE_V);
        plastic_v.setOnClickListener(this);

        ImageView plastic_c = (ImageView) view.findViewById(R.id.plastic_c);
        plastic_c.setImageDrawable(DRAWABLE_C);
        plastic_c.setOnClickListener(this);

        ImageView plastic_h = (ImageView) view.findViewById(R.id.plastic_h);
        plastic_h.setImageDrawable(DRAWABLE_H);
        plastic_h.setOnClickListener(this);


        TextView balls = (TextView) view.findViewById(R.id.balls);
        balls.setOnClickListener(this);
        balls.setSoundEffectsEnabled(false);

        ImageView balls_v = (ImageView) view.findViewById(R.id.balls_v);
        balls_v.setImageDrawable(DRAWABLE_V);
        balls_v.setOnClickListener(this);

        ImageView balls_c = (ImageView) view.findViewById(R.id.balls_c);
        balls_c.setImageDrawable(DRAWABLE_C);
        balls_c.setOnClickListener(this);

        ImageView balls_h = (ImageView) view.findViewById(R.id.balls_h);
        balls_h.setImageDrawable(DRAWABLE_H);
        balls_h.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.bubble ||
                v.getId() == R.id.swoosh ||
                v.getId() == R.id.click ||
                v.getId() == R.id.balls ||
                v.getId() == R.id.metal ||
                v.getId() == R.id.plastic ||
                v.getId() == R.id.water ) {

            Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click);
            v.startAnimation(anim);

            if(v.getId() == R.id.bubble) {
                stopSound();
                mp = MediaPlayer.create(getActivity(), R.raw.bubble);
                mp.start();
            }else if(v.getId() == R.id.swoosh) {
                stopSound();
                mp = MediaPlayer.create(getActivity(), R.raw.swoosh);
                mp.start();
            }else if(v.getId() == R.id.click) {
                stopSound();
                mp = MediaPlayer.create(getActivity(), R.raw.click);
                mp.start();
            }else if(v.getId() == R.id.plastic) {
                stopSound();
                mp = MediaPlayer.create(getActivity(), R.raw.plastic);
                mp.start();
            }else if(v.getId() == R.id.metal) {
                stopSound();
                mp = MediaPlayer.create(getActivity(), R.raw.metal);
                mp.start();
            }else if(v.getId() == R.id.water) {
                stopSound();
                mp = MediaPlayer.create(getActivity(), R.raw.water);
                mp.start();
            }else if(v.getId() == R.id.balls) {
                stopSound();
                mp = MediaPlayer.create(getActivity(), R.raw.balls);
                mp.start();
            }
        }else {
            Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click_zoom_out);
            v.startAnimation(anim);

            if(v.getId() == R.id.swoosh_v) {
                Preferences.setDefaults("sound_v", "swoosh", getActivity().getApplicationContext());
            }else if(v.getId() == R.id.swoosh_c) {
                Preferences.setDefaults("sound_c", "swoosh", getActivity().getApplicationContext());
            }else if(v.getId() == R.id.swoosh_h) {
                Preferences.setDefaults("sound_h", "swoosh", getActivity().getApplicationContext());
            }

            if(v.getId() == R.id.bubble_v) {
                Preferences.setDefaults("sound_v", "bubble", getActivity().getApplicationContext());
            }else if(v.getId() == R.id.bubble_c) {
                Preferences.setDefaults("sound_c", "bubble", getActivity().getApplicationContext());
            }else if(v.getId() == R.id.bubble_h) {
                Preferences.setDefaults("sound_h", "bubble", getActivity().getApplicationContext());
            }

            if(v.getId() == R.id.click_v) {
                Preferences.setDefaults("sound_v", "click", getActivity().getApplicationContext());
            }else if(v.getId() == R.id.click_c) {
                Preferences.setDefaults("sound_c", "click", getActivity().getApplicationContext());
            }else if(v.getId() == R.id.click_h) {
                Preferences.setDefaults("sound_h", "click", getActivity().getApplicationContext());
            }

            if(v.getId() == R.id.water_v) {
                Preferences.setDefaults("sound_v", "water", getActivity().getApplicationContext());
            }else if(v.getId() == R.id.water_c) {
                Preferences.setDefaults("sound_c", "water", getActivity().getApplicationContext());
            }else if(v.getId() == R.id.water_h) {
                Preferences.setDefaults("sound_h", "water", getActivity().getApplicationContext());
            }

            if(v.getId() == R.id.balls_v) {
                Preferences.setDefaults("sound_v", "balls", getActivity().getApplicationContext());
            }else if(v.getId() == R.id.balls_c) {
                Preferences.setDefaults("sound_c", "balls", getActivity().getApplicationContext());
            }else if(v.getId() == R.id.balls_h) {
                Preferences.setDefaults("sound_h", "balls", getActivity().getApplicationContext());
            }

            if(v.getId() == R.id.metal_v) {
                Preferences.setDefaults("sound_v", "metal", getActivity().getApplicationContext());
            }else if(v.getId() == R.id.metal_c) {
                Preferences.setDefaults("sound_c", "metal", getActivity().getApplicationContext());
            }else if(v.getId() == R.id.metal_h) {
                Preferences.setDefaults("sound_h", "metal", getActivity().getApplicationContext());
            }

            if(v.getId() == R.id.plastic_v) {
                Preferences.setDefaults("sound_v", "plastic", getActivity().getApplicationContext());
            }else if(v.getId() == R.id.plastic_c) {
                Preferences.setDefaults("sound_c", "plastic", getActivity().getApplicationContext());
            }else if(v.getId() == R.id.plastic_h) {
                Preferences.setDefaults("sound_h", "plastic", getActivity().getApplicationContext());
            }

            SnackbarManager.show(
                    Snackbar.with(getActivity())
                            .text("Hooray!")
                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                            .color(getResources().getColor(R.color.accent))
                            .textColor(getResources().getColor(R.color.gray))
                    , getActivity());
        }
    }

    private void stopSound() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
}
