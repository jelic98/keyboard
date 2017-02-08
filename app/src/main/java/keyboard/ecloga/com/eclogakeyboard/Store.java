package keyboard.ecloga.com.eclogakeyboard;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Toast;



public class Store extends ActionBarActivity {

    private Toolbar toolbar;
    private ViewPager mPager;
    private SlidingTabLayout mTabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.store);

        if(Preferences.getDefaults("premium", getApplicationContext()).equals("false")) {
            new AlertDialog.Builder(Store.this)
                    .setTitle("Unlock all themes")
                    .setMessage("If you want to get all themes and be awesome, please upgrade to premium version")
                    .setPositiveButton("Upgrade", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            startActivity(new Intent(Store.this, Upgrade.class));
                        }
                    })
                    .setNegativeButton("No, thanks", null).show();
        }

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mPager = (ViewPager) findViewById(R.id.pager);
        mTabs = (SlidingTabLayout) findViewById(R.id.tabs);

        mTabs.setBackgroundColor(getResources().getColor(R.color.primary));
        mTabs.setSelectedIndicatorColors(getResources().getColor(R.color.accent));

        mPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        mTabs.setViewPager(mPager);

        NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);

        drawerFragment.setUp((DrawerLayout) findViewById(R.id.drawer_layout), toolbar);

        overridePendingTransition(R.anim.activity_open, R.anim.activity_close);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, Home.class));
    }

    class MyPagerAdapter extends FragmentPagerAdapter {

        String[] tabs;

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
            tabs = getResources().getStringArray(R.array.tabs_store);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;

            if(position == 0) {
                fragment = new FragmentPatterns();
            }else if(position == 1) {
                fragment = new FragmentNature();
            }

            return fragment;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabs[position];
        }

        @Override
        public int getCount() {
            return 2;
        }
    }

    public static class MyFragment extends Fragment {
        public static MyFragment getInstance(int position) {
            MyFragment myFragment = new MyFragment();

            return  myFragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View layout = inflater.inflate(R.layout.patterns, container, false);

            return layout;
        }
    }
}
