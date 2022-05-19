package com.example.photogram_rishav.Home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.photogram_rishav.R;

import java.util.List;

public class YoutubeAdapter extends RecyclerView.Adapter<YoutubeViewHolder> {
    List<DataSetList> arraylist;
    Context context;

    public YoutubeAdapter(List<DataSetList> arraylist,Context context) {
        this.context = context;
        this.arraylist =arraylist;
    }

    @NonNull
    @Override
    public YoutubeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.video_card,parent,false);
        return new YoutubeViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull YoutubeViewHolder holder, int position) {
        DataSetList current = arraylist.get(position);
        holder.webView.loadUrl(current.getLink());
    }

    @Override
    public int getItemCount() {
        return arraylist.size();
    }
}
