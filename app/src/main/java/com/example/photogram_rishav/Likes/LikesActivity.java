package com.example.photogram_rishav.Likes;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.photogram_rishav.Profile.Card;
import com.example.photogram_rishav.Profile.RecyclerViewAdapter;
import com.example.photogram_rishav.R;
import com.example.photogram_rishav.utils.BottomNavigationHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class LikesActivity extends AppCompatActivity {
    private List<Card> persons1;
    RecyclerView recyclerView1;
    RecyclerViewAdapter recyclerViewAdapter1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        persons1 = new ArrayList<>();
        persons1.add(new Card( R.drawable.photo_1483985988355_763728e1935b,"personA"));
        persons1.add(new Card( R.drawable.casey_horner_g2jaomgglpe_unsplash,"pseras"));
        persons1.add(new Card( R.drawable.denny_muller_hfwa_axq6ek_unsplash,"asfasfas"));
        persons1.add(new Card( R.drawable.efe_kurnaz_rncpixixooy_unsplash,"personA"));
        persons1.add(new Card( R.drawable.mado_el_khouly_ma8yoaokpfy_unsplash,"pseras"));
        persons1.add(new Card( R.drawable.oc_gonzalez_a_11n8ithzo_unsplash,"asfasfas"));
        persons1.add(new Card( R.drawable.osman_rana_di9khxi0ooe_unsplash,"personA"));
        persons1.add(new Card( R.drawable.sigmund_65u8d_inh0m_unsplash,"pseras"));
        persons1.add(new Card( R.drawable.photo_1483985988355_763728e1935b,"asfasfas"));
        persons1.add(new Card( R.drawable.casey_horner_g2jaomgglpe_unsplash,"personA"));
        persons1.add(new Card( R.drawable.efe_kurnaz_rncpixixooy_unsplash,"pseras"));
        persons1.add(new Card( R.drawable.denny_muller_hfwa_axq6ek_unsplash,"asfasfas"));
        recyclerView1 = (RecyclerView)findViewById(R.id.favRecycler);
        recyclerViewAdapter1 = new RecyclerViewAdapter(persons1);
        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(this);
        recyclerView1.setLayoutManager(layoutManager2);
        recyclerView1.setAdapter(recyclerViewAdapter1);
        setupBottomNavigationView();
    }
    private void setupBottomNavigationView(){
        BottomNavigationView vb = (BottomNavigationView) findViewById(R.id.bottomNavViewBar);
        BottomNavigationHelper.enableNavigation(LikesActivity.this,vb);
        Menu menu = vb.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);
    }
}
