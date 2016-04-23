package keyboard.ecloga.com.eclogakeyboard;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.*;
import android.provider.Settings;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import com.github.clans.fab.FloatingActionButton;
import com.purplebrain.adbuddiz.sdk.AdBuddiz;

public class Home extends ActionBarActivity {

    private Toolbar toolbar;
    private CardView cardView1;
    private FloatingActionButton fab;
    private EditText editText;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        Preferences.setDefaults("boot", "true", getApplicationContext());

        counter = 0;

        editText = (EditText) findViewById(R.id.editText);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;

                if(counter == 0) {
                    editText.setVisibility(View.INVISIBLE);
                }else {
                    if(counter % 2 == 0) {
                        editText.setVisibility(View.INVISIBLE);
                    }else {
                        editText.setVisibility(View.VISIBLE);
                    }
                }

                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT);
            }
        });

        cardView1 = (CardView) findViewById(R.id.cardView1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.click);
                cardView1.startAnimation(anim);

                startActivity(new Intent(Settings.ACTION_SETTINGS));
            }
        });

        overridePendingTransition(R.anim.activity_open, R.anim.activity_close);

        //AdBuddiz.setPublisherKey("eaa54db5-db0b-4465-84e8-45198d13617c");
        //AdBuddiz.cacheAds(this);
        //AdBuddiz.showAd(this);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);

        drawerFragment.setUp((DrawerLayout) findViewById(R.id.drawer_layout), toolbar);
    }
}
