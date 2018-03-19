package com.malemone.apps.malemone.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.malemone.apps.malemone.Models.NearByList;
import com.malemone.apps.malemone.Near_By_Details;
import com.malemone.apps.malemone.News_More_Details;
import com.malemone.apps.malemone.R;
import com.malemone.apps.malemone.ViewHolder.NearByViewHolder;

import java.util.List;

/**
 * Created by mcsbusing on 2018/03/18.
 */

public class NearByAdapter extends RecyclerView.Adapter<NearByViewHolder> {

    List<NearByList> newsItems;
    Context ctx;

    public NearByAdapter(List<NearByList> newsItems, Context ctx) {
        this.newsItems = newsItems;
        this.ctx = ctx;
    }

    @Override
    public NearByViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.custom_mylist_layout,parent, false);

        return new NearByViewHolder(v);
    }

    @Override
    public void onBindViewHolder(NearByViewHolder holder, int position) {

        NearByList newsList = newsItems.get(position);
        holder.lblTitle.setText(newsList.getArticalTitle());
        holder.lblSubTitle.setText(newsList.getSubTitle());
        holder.lblDescription.setText(newsList.getDescription());
        holder.img.setImageResource(newsList.getImg());

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(ctx, newsList.getArticalTitle() +" was clicked.",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(ctx,Near_By_Details.class);
                v.getContext().startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return newsItems.size();
    }
}
