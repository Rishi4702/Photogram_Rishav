package com.example.photogram_rishav.Home;

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

import com.example.photogram_rishav.Profile.Card;
import com.example.photogram_rishav.Profile.RecyclerViewAdapter;
import com.example.photogram_rishav.R;
import com.example.photogram_rishav.utils.BottomNavigationHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private List<Card> persons;
    private List<DataSetList> arraylist;
    RecyclerView recyclerView;
    RecyclerView recyclerView1;
    RecyclerViewAdapterCircleImage recyclerViewAdapter1;
    RecyclerViewAdapter recyclerViewAdapter;
    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
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

        recyclerView1 = (RecyclerView)findViewById(R.id.circleRecycler);
        recyclerViewAdapter1 = new RecyclerViewAdapterCircleImage(persons);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(this ,LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(layoutManager1);
        recyclerView1.setAdapter(recyclerViewAdapter1);

        recyclerView = (RecyclerView)findViewById(R.id.feedRecycler);
       // recyclerViewAdapter = new RecyclerViewAdapter(persons);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        //recyclerView.setAdapter(recyclerViewAdapter);
        arraylist = new ArrayList<>();
        arraylist.add(new DataSetList("https://www.slow-dreams.com/images/flowers/Senza-titolo-1.jpg"));
        arraylist.add(new DataSetList("https://www.shlomifish.org/Files/files/video/Ariana%20Grande%20-%20Problem%20ft.%20Iggy%20Azalea-iS1g8G_njx8.webm"));
        arraylist.add(new DataSetList("https://www.shlomifish.org/Files/files/video/Beatallica%20-%20Hey%20Dude%20(Euro%20Tour%2008)-ZsT0rpWDlvo.webm"));
        arraylist.add(new DataSetList("https://www.shlomifish.org/Files/files/video/Eminem%20w%20Rihanna%20vs%20Guns%20n%20Roses%20%20-%20Love%20The%20Way%20You%20Lie%20Paradise%20City%20mashup-fhSb8Et5BbI.webm"));
        arraylist.add(new DataSetList("https://www.profolio.lv/assets/webm/KoApgutIT/3.mp4"));
        arraylist.add(new DataSetList("https://www.profolio.lv/assets/webm/KoApgutIT/11.webm"));
        arraylist.add(new DataSetList("https://www.cnipa-hb.com/statics/default/video/video_4.mp4"));

        YoutubeAdapter youtubeAdapter = new YoutubeAdapter(arraylist,getApplicationContext());
        recyclerView.setAdapter(youtubeAdapter);

    }
    private void setupBottomNavigationView(){
        BottomNavigationView vb = (BottomNavigationView) findViewById(R.id.bottomNavViewBar);
        BottomNavigationHelper.enableNavigation(HomeActivity.this,vb);
        Menu menu = vb.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);
    }

}
