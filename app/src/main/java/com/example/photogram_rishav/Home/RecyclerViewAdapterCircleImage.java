package com.example.photogram_rishav.Home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.photogram_rishav.Profile.Card;
import com.example.photogram_rishav.R;

import java.util.List;

public class RecyclerViewAdapterCircleImage extends RecyclerView.Adapter<RecyclerViewAdapterCircleImage.MyViewHolder>{
    private List<Card> movieList;
    public RecyclerViewAdapterCircleImage(List<Card> movieList){
        this.movieList = movieList;
    }
    @Override
    public RecyclerViewAdapterCircleImage.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.circularstories,parent,false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(RecyclerViewAdapterCircleImage.MyViewHolder holder, final int position) {
        final Card movie = movieList.get(position);
       // holder.title.setText(movie.getTitle());
        holder.imageb1.setImageResource(movie.getImgurl());
       // holder.images.setBackgroundResource(movie.getImgurl());
    }
    @Override
    public int getItemCount() {
        return movieList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private ImageView imageb1;
        private ImageView images;
        private CardView cardView;
        public MyViewHolder(View itemView) {
            super(itemView);
           // title = itemView.findViewById(R.id.cardtitle);
            imageb1 = itemView.findViewById(R.id.profile_image_feed);
           // images =itemView.findViewById(R.id.smallimage);
            //cardView = itemView.findViewById(R.id.cardview);

        }
    }
}