package com.malemone.apps.malemone.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.malemone.apps.malemone.Destination;
import com.malemone.apps.malemone.Models.NewsList;
import com.malemone.apps.malemone.News_More_Details;
import com.malemone.apps.malemone.R;
import com.malemone.apps.malemone.ViewHolder.NewsViewHolder;

import java.util.List;

/**
 * Created by mcsbusing on 2018/03/17.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsViewHolder>{

    List<NewsList> newsItems;
    Context ctx;

    public NewsAdapter(List<NewsList> newsItems, Context ctx) {
        this.newsItems = newsItems;
        this.ctx = ctx;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.news_item_layout,parent, false);

        return new NewsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {

        NewsList newsList = newsItems.get(position);
        holder.lblArticleHeading.setText(newsList.getArticalHeading());
        holder.lblArticleSummary.setText(newsList.getArticleSummary());
        holder.articlePicture.setImageResource(newsList.getArticalPicture());

        /*holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(ctx, newsList.getArticalTitle() +" was clicked.",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(ctx,News_More_Details.class);
                v.getContext().startActivity(intent);

            }
        });*/

        holder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx, holder.lblArticleHeading.getText() + " Like button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx, holder.lblArticleHeading.getText() + " Share button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        holder.btnViewMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ctx,News_More_Details.class);
                v.getContext().startActivity(intent);
            }
        });

        holder.articlePicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ctx,News_More_Details.class);
                v.getContext().startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return newsItems.size();
    }
}
