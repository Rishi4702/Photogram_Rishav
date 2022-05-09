package com.example.photogram_rishav.Search;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.photogram_rishav.R;
import com.example.photogram_rishav.utils.BottomNavigationHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SearchActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setupBottomNavigationView();
    }
    private void setupBottomNavigationView(){
        BottomNavigationView vb = (BottomNavigationView) findViewById(R.id.bottomNavViewBar);
        BottomNavigationHelper.enableNavigation(SearchActivity.this,vb);
        Menu menu = vb.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);
    }
}
