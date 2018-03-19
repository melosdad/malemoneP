package com.malemone.apps.malemone.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;
import com.malemone.apps.malemone.R;

/**
 * Created by mcsbusing on 2018/03/17.
 */

public class NewsViewHolder extends RecyclerView.ViewHolder{


    public TextView lblArticleHeading, lblArticleSummary;
    public ImageView articlePicture, btnLike, btnShare, btnViewMore;
    public LinearLayout linearLayout;

    public NewsViewHolder(View itemView) {
        super(itemView);

        lblArticleHeading = (TextView) itemView.findViewById(R.id.articleHeading);
        lblArticleSummary= (TextView) itemView.findViewById(R.id.articleSummary);
        articlePicture = (ImageView) itemView.findViewById(R.id.articlePicture);
        linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayoutItem);
        btnLike = (ImageView) itemView.findViewById(R.id.newsFeed_btnLike);
        btnShare = (ImageView) itemView.findViewById(R.id.newFeed_btnShare);
        btnViewMore = (ImageView) itemView.findViewById(R.id.newFeed_btnViewMore);
    }

}
