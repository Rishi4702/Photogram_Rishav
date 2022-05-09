package com.example.photogram_rishav.Profile;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.photogram_rishav.R;
import com.example.photogram_rishav.utils.BottomNavigationHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity {
    private List<Card> persons;
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setupBottomNavigationView();
        persons = new ArrayList<>();
//        persons.add(new Card( R.drawable.photo_1483985988355_763728e1935b,"personA"));
        persons.add(new Card( R.drawable.casey_horner_g2jaomgglpe_unsplash,"pseras"));
        persons.add(new Card( R.drawable.denny_muller_hfwa_axq6ek_unsplash,"asfasfas"));
        persons.add(new Card( R.drawable.efe_kurnaz_rncpixixooy_unsplash,"personA"));
        persons.add(new Card( R.drawable.mado_el_khouly_ma8yoaokpfy_unsplash,"pseras"));
        persons.add(new Card( R.drawable.oc_gonzalez_a_11n8ithzo_unsplash,"asfasfas"));
        persons.add(new Card( R.drawable.osman_rana_di9khxi0ooe_unsplash,"personA"));
        persons.add(new Card( R.drawable.sigmund_65u8d_inh0m_unsplash,"pseras"));
        persons.add(new Card( R.drawable.photo_1483985988355_763728e1935b,"asfasfas"));
        persons.add(new Card( R.drawable.casey_horner_g2jaomgglpe_unsplash,"personA"));
        persons.add(new Card( R.drawable.efe_kurnaz_rncpixixooy_unsplash,"pseras"));
        persons.add(new Card( R.drawable.denny_muller_hfwa_axq6ek_unsplash,"asfasfas"));
        recyclerView = (RecyclerView)findViewById(R.id.idRVCourse);
        recyclerViewAdapter = new RecyclerViewAdapter(persons);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerViewAdapter);
        ImageView img = (ImageView) findViewById(R.id.likepic);;

    }
    private void setupBottomNavigationView(){
        BottomNavigationView vb = (BottomNavigationView) findViewById(R.id.bottomNavViewBar);
        BottomNavigationHelper.enableNavigation(ProfileActivity.this,vb);
        Menu menu = vb.getMenu();
        MenuItem menuItem = menu.getItem(4);
        menuItem.setChecked(true);
    }

}
