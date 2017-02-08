package keyboard.ecloga.com.eclogakeyboard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.nispok.snackbar.Snackbar;
import com.nispok.snackbar.SnackbarManager;

import java.util.ArrayList;
import java.util.List;

import static android.content.Context.CONTEXT_IGNORE_SECURITY;

public class NavigationDrawerFragment extends android.support.v4.app.Fragment implements Adapter.ClickListener {

    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;
    private RecyclerView recyclerView;
    private Adapter adapter;

    public NavigationDrawerFragment() {
        
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_navigation_drawer, container, false);
        recyclerView = (RecyclerView) layout.findViewById(R.id.drawerList);

        adapter = new Adapter(getActivity(), getData());
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return layout;
    }

    public static List<Information> getData() {
        List<Information> data = new ArrayList<>();

        int[] icons = {
                R.drawable.personalize,
                R.drawable.settings,
                R.drawable.store,
                R.drawable.stats,
                R.drawable.upgrade,
                R.drawable.help,
                R.drawable.about};

        String[] titles = {
                "Personalize",
                "Settings",
                "Store",
                "Stats & Badges",
                "Upgrade",
                "Help & Feedback",
                "About Us"};

        for(int i = 0; i < titles.length && i < icons.length; i++) {
            Information current = new Information();

            current.iconId = icons[i];
            current.title = titles[i];

            data.add(current);
        }

        return data;
    }

    public void setUp(DrawerLayout drawerLayout, Toolbar toolbar) {
        mDrawerLayout = drawerLayout;
        mDrawerToggle = new ActionBarDrawerToggle(getActivity(), drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close){
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {

            }
        };

        mDrawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerLayout.post(new Runnable() {
            @Override
            public void run() {
                mDrawerToggle.syncState();
            }
        });
    }

    @Override
    public void itemClicked(View view, int position, TextView title, ImageView icon) {

        switch(position) {
            case 1:
                startActivity(new Intent(getActivity(), Personalize.class));

                if(!getActivity().getClass().getSimpleName().equals("Home")) {
                    this.getActivity().finish();
                }
                break;
            case 2:
                startActivity(new Intent(getActivity(), Settings.class));

                if(!getActivity().getClass().getSimpleName().equals("Home")) {
                    this.getActivity().finish();
                }
                break;
            case 3:
                startActivity(new Intent(getActivity(), Store.class));

                if(!getActivity().getClass().getSimpleName().equals("Home")) {
                    this.getActivity().finish();
                }
                break;
            case 4:
                startActivity(new Intent(getActivity(), Statistics.class));

                if(!getActivity().getClass().getSimpleName().equals("Home")) {
                    this.getActivity().finish();
                }
                break;
            case 5:
                startActivity(new Intent(getActivity(), Upgrade.class));

                if(!getActivity().getClass().getSimpleName().equals("Home")) {
                    this.getActivity().finish();
                }
                break;
            case 6:
                startActivity(new Intent(getActivity(), Help.class));
                if(!getActivity().getClass().getSimpleName().equals("Home")) {
                    this.getActivity().finish();
                }
                break;
            case 7:
                startActivity(new Intent(getActivity(), About.class));

                if(!getActivity().getClass().getSimpleName().equals("Home")) {
                    this.getActivity().finish();
                }
                break;
        }
    }
}
