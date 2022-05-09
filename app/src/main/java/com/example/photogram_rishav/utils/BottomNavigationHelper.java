package com.example.photogram_rishav.utils;



import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.example.photogram_rishav.Home.HomeActivity;
import com.example.photogram_rishav.Likes.LikesActivity;
import com.example.photogram_rishav.Profile.ProfileActivity;
import com.example.photogram_rishav.R;
import com.example.photogram_rishav.Search.SearchActivity;
import com.example.photogram_rishav.Shared.SharedActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationHelper {
    public static void  enableNavigation(final Context context, BottomNavigationView bv){
        bv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_house:
                        Intent intent1 = new Intent(context, HomeActivity.class);
                        context.startActivity(intent1);
                        break;
                    case R.id.ic_search:
                        Intent intent2 = new Intent(context, SearchActivity.class);
                        context.startActivity(intent2);
                        break;
                    case R.id.ic_circle:
                        Intent intent3 = new Intent(context, SharedActivity.class);
                        context.startActivity(intent3);
                        break;
                    case R.id.ic_like:
                        Intent intent4 = new Intent(context, LikesActivity.class);
                        context.startActivity(intent4);
                        break;
                    case R.id.ic_profile:
                        Intent intent5 = new Intent(context, ProfileActivity.class);
                        context.startActivity(intent5);
                        break;
                }
                return false;
            }
        });

    }
}
