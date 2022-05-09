package com.example.photogram_rishav.Home;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.photogram_rishav.Profile.Card;
import com.example.photogram_rishav.Profile.RecyclerViewAdapter;
import com.example.photogram_rishav.R;
import com.example.photogram_rishav.utils.BottomNavigationHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private List<Card> persons;
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setupBottomNavigationView();
        setupViewPager();

    }

    private void setupBottomNavigationView() {
        BottomNavigationView vb = (BottomNavigationView) findViewById(R.id.bottomNavViewBar);
        BottomNavigationHelper.enableNavigation(HomeActivity.this, vb);
        Menu menu = vb.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);
    }
        //purpose is to reuse this code in future if we want similar messaging option like instagram
    private void setupViewPager( ){
        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment());
        ViewPager viewPager = (ViewPager) findViewById(R.id.container);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Photogram");
    }

}
