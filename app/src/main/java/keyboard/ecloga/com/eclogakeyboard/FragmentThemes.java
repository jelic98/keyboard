package keyboard.ecloga.com.eclogakeyboard;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.widget.DrawerLayout;
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

public class FragmentThemes extends android.support.v4.app.Fragment implements View.OnClickListener{

    public FragmentThemes() {

    }

    Button upload, black, white, random, transparent;
    Button red, pink, purple, blue, green, yellow, orange, grey;
    Button lightred, lightpink, lightpurple, lightblue, lightgreen, lightyellow, lightorange, lightgrey;
    Button darkred, darkpink, darkpurple, darkblue, darkgreen, darkyellow, darkorange, darkgrey;
    Button gradient_1, gradient_2, gradient_3, gradient_4, gradient_5, gradient_6, gradient_7, gradient_8, gradient_9, gradient_10;

    private Uri mImageCaptureUri;
    private AlertDialog dialog;

    private static final int PICK_FROM_CAMERA = 1;
    private static final int CROP_FROM_CAMERA = 2;
    private static final int PICK_FROM_FILE = 3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.themes, container, false);

        final String [] items			= new String [] {"Take from camera", "Select from gallery"};
        ArrayAdapter<String> adapter	= new ArrayAdapter<String> (getActivity(), android.R.layout.select_dialog_item,items);
        AlertDialog.Builder builder		= new AlertDialog.Builder(getActivity());

        builder.setTitle("Select Image");
        builder.setAdapter(adapter, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                if (item == 0) {
                    Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                    mImageCaptureUri = Uri.fromFile(new File(Environment.getExternalStorageDirectory(),
                            "tmp_avatar_" + String.valueOf(System.currentTimeMillis()) + ".jpg"));

                    intent.putExtra(android.provider.MediaStore.EXTRA_OUTPUT, mImageCaptureUri);

                    try {
                        intent.putExtra("return-data", true);

                        startActivityForResult(intent, PICK_FROM_CAMERA);
                    } catch (ActivityNotFoundException e) {
                        e.printStackTrace();
                    }
                } else {
                    Intent intent = new Intent();

                    intent.setType("image/*");
                    intent.setAction(Intent.ACTION_GET_CONTENT);

                    startActivityForResult(Intent.createChooser(intent, "Complete action using"), PICK_FROM_FILE);
                }
            }
        });

        dialog = builder.create();

        random = (Button) view.findViewById(R.id.random);
        random.setOnClickListener(this);

        upload = (Button) view.findViewById(R.id.upload);
        upload.setOnClickListener(this);

        black = (Button) view.findViewById(R.id.black);
        black.setOnClickListener(this);

        white = (Button) view.findViewById(R.id.white);
        white.setOnClickListener(this);

        transparent = (Button) view.findViewById(R.id.transparent);
        transparent.setOnClickListener(this);

        gradient_1 = (Button) view.findViewById(R.id.gradient_1);
        gradient_1.setOnClickListener(this);

        gradient_2 = (Button) view.findViewById(R.id.gradient_2);
        gradient_2.setOnClickListener(this);

        gradient_3 = (Button) view.findViewById(R.id.gradient_3);
        gradient_3.setOnClickListener(this);

        gradient_4 = (Button) view.findViewById(R.id.gradient_4);
        gradient_4.setOnClickListener(this);

        gradient_5 = (Button) view.findViewById(R.id.gradient_5);
        gradient_5.setOnClickListener(this);

        gradient_6 = (Button) view.findViewById(R.id.gradient_6);
        gradient_6.setOnClickListener(this);

        gradient_7 = (Button) view.findViewById(R.id.gradient_7);
        gradient_7.setOnClickListener(this);

        gradient_8 = (Button) view.findViewById(R.id.gradient_8);
        gradient_8.setOnClickListener(this);

        gradient_9 = (Button) view.findViewById(R.id.gradient_9);
        gradient_9.setOnClickListener(this);

        gradient_10 = (Button) view.findViewById(R.id.gradient_10);
        gradient_10.setOnClickListener(this);

        red = (Button) view.findViewById(R.id.red);
        red.setOnClickListener(this);

        pink = (Button) view.findViewById(R.id.pink);
        pink.setOnClickListener(this);

        purple = (Button) view.findViewById(R.id.purple);
        purple.setOnClickListener(this);

        blue = (Button) view.findViewById(R.id.blue);
        blue.setOnClickListener(this);

        green = (Button) view.findViewById(R.id.green);
        green.setOnClickListener(this);

        yellow = (Button) view.findViewById(R.id.yellow);
        yellow.setOnClickListener(this);

        orange = (Button) view.findViewById(R.id.orange);
        orange.setOnClickListener(this);

        grey = (Button) view.findViewById(R.id.grey);
        grey.setOnClickListener(this);

        lightred = (Button) view.findViewById(R.id.lightred);
        lightred.setOnClickListener(this);

        lightpink = (Button) view.findViewById(R.id.lightpink);
        lightpink.setOnClickListener(this);

        lightpurple = (Button) view.findViewById(R.id.lightpurple);
        lightpurple.setOnClickListener(this);

        lightblue = (Button) view.findViewById(R.id.lightblue);
        lightblue.setOnClickListener(this);

        lightgreen = (Button) view.findViewById(R.id.lightgreen);
        lightgreen.setOnClickListener(this);

        lightyellow = (Button) view.findViewById(R.id.lightyellow);
        lightyellow.setOnClickListener(this);

        lightorange = (Button) view.findViewById(R.id.lightorange);
        lightorange.setOnClickListener(this);

        lightgrey = (Button) view.findViewById(R.id.lightgrey);
        lightgrey.setOnClickListener(this);

        darkred = (Button) view.findViewById(R.id.darkred);
        darkred.setOnClickListener(this);

        darkpink = (Button) view.findViewById(R.id.darkpink);
        darkpink.setOnClickListener(this);

        darkpurple = (Button) view.findViewById(R.id.darkpurple);
        darkpurple.setOnClickListener(this);

        darkblue = (Button) view.findViewById(R.id.darkblue);
        darkblue.setOnClickListener(this);

        darkgreen = (Button) view.findViewById(R.id.darkgreen);
        darkgreen.setOnClickListener(this);

        darkyellow = (Button) view.findViewById(R.id.darkyellow);
        darkyellow.setOnClickListener(this);

        darkorange = (Button) view.findViewById(R.id.darkorange);
        darkorange.setOnClickListener(this);

        darkgrey = (Button) view.findViewById(R.id.darkgrey);
        darkgrey.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.click);
        v.startAnimation(anim);

        switch (v.getId()) {
            case R.id.upload:
                if(Preferences.getDefaults("premium", getActivity().getApplicationContext()).equals("true")) {
                    dialog.show();
                }else {
                    SnackbarManager.show(
                            Snackbar.with(getActivity())
                                    .text("Not available in free verison")
                                    .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                    .color(getResources().getColor(R.color.accent))
                                    .textColor(getResources().getColor(R.color.gray))
                            , getActivity());
                }
                break;
            case R.id.random:
                if(Preferences.getDefaults("premium", getActivity().getApplicationContext()).equals("true")) {
                    Preferences.setDefaults("bgcolor", "random", getActivity());
                    SnackbarManager.show(
                            Snackbar.with(getActivity())
                                    .text("Whoo-hoo!")
                                    .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                    .color(getResources().getColor(R.color.accent))
                                    .textColor(getResources().getColor(R.color.gray))
                            , getActivity());
                }else {
                    SnackbarManager.show(
                            Snackbar.with(getActivity())
                                    .text("Not available in free verison")
                                    .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                    .color(getResources().getColor(R.color.accent))
                                    .textColor(getResources().getColor(R.color.gray))
                            , getActivity());
                }
                break;
            default:
                Preferences.setDefaults(
                        "bgcolor",
                        v.getResources().getResourceName(v.getId()).substring(38,
                                v.getResources().getResourceName(v.getId()).length()),
                        getActivity());

                SnackbarManager.show(
                        Snackbar.with(getActivity())
                                .text("Let's Roll!")
                                .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                .color(getResources().getColor(R.color.accent))
                                .textColor(getResources().getColor(R.color.gray))
                        , getActivity());
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode != Activity.RESULT_OK) return;

        switch (requestCode) {
            case PICK_FROM_CAMERA:
                doCrop();
                break;

            case PICK_FROM_FILE:
                mImageCaptureUri = data.getData();
                doCrop();
                break;

            case CROP_FROM_CAMERA:
                Bundle extras = data.getExtras();

                if (extras != null) {
                    Bitmap photo = extras.getParcelable("data");
                    BitmapDrawable bdrawable = new BitmapDrawable(getActivity().getResources(), photo);
                    upload.setBackgroundDrawable(bdrawable);

                    ByteArrayOutputStream bao = new ByteArrayOutputStream();
                    photo.compress(Bitmap.CompressFormat.JPEG, 90, bao);
                    byte [] ba = bao.toByteArray();
                    String uploadString = Base64.encodeToString(ba, Base64.URL_SAFE);
                    Preferences.setDefaults("bgcolor", uploadString, getActivity());

                    SnackbarManager.show(
                            Snackbar.with(getActivity())
                                    .text("Fancy!")
                                    .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                    .color(getResources().getColor(R.color.accent))
                                    .textColor(getResources().getColor(R.color.gray))
                            , getActivity());
                }

                File f = new File(mImageCaptureUri.getPath());

                if (f.exists()) {
                    f.delete();
                }
                break;
        }
    }

    private void doCrop() {
        final ArrayList<CropOption> cropOptions = new ArrayList<CropOption>();

        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setType("image/*");

        List<ResolveInfo> list = getActivity().getPackageManager().queryIntentActivities(intent, 0);

        int size = list.size();

        if(size == 0) {
            SnackbarManager.show(
                    Snackbar.with(getActivity())
                            .text("Crop app missing")
                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                    , getActivity());
        }else {
            intent.setData(mImageCaptureUri);

            intent.putExtra("outputX", 200);
            intent.putExtra("outputY", 200);
            intent.putExtra("aspectX", 1);
            intent.putExtra("aspectY", 1);
            intent.putExtra("scale", true);
            intent.putExtra("return-data", true);

            if(size == 1) {
                Intent i 		= new Intent(intent);
                ResolveInfo res	= list.get(0);

                i.setComponent( new ComponentName(res.activityInfo.packageName, res.activityInfo.name));

                startActivityForResult(i, CROP_FROM_CAMERA);
            }else {
                for (ResolveInfo res : list) {
                    final CropOption co = new CropOption();

                    co.title = getActivity().getPackageManager().getApplicationLabel(res.activityInfo.applicationInfo);
                    co.icon	= getActivity().getPackageManager().getApplicationIcon(res.activityInfo.applicationInfo);
                    co.appIntent = new Intent(intent);

                    co.appIntent.setComponent( new ComponentName(res.activityInfo.packageName, res.activityInfo.name));

                    cropOptions.add(co);
                }

                CropOptionAdapter adapter = new CropOptionAdapter(getActivity(), cropOptions);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Choose Crop App");
                builder.setAdapter( adapter, new DialogInterface.OnClickListener() {
                    public void onClick( DialogInterface dialog, int item ) {
                        startActivityForResult( cropOptions.get(item).appIntent, CROP_FROM_CAMERA);
                    }
                });

                builder.setOnCancelListener( new DialogInterface.OnCancelListener() {
                    @Override
                    public void onCancel( DialogInterface dialog ) {

                        if (mImageCaptureUri != null ) {
                            getActivity().getContentResolver().delete(mImageCaptureUri, null, null );
                            mImageCaptureUri = null;
                        }
                    }
                } );

                AlertDialog alert = builder.create();

                alert.show();
            }
        }
    }
}
