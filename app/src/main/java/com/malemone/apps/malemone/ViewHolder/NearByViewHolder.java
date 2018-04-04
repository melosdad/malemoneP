package com.malemone.apps.malemone.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.malemone.apps.malemone.R;

/**
 * Created by mcsbusing on 2018/03/18.
 */

public class NearByViewHolder extends RecyclerView.ViewHolder {

    public TextView lblTitle, lblSubTitle, lblDescription;
    public ImageView img;
    public LinearLayout linearLayout;

    public NearByViewHolder(View itemView) {
        super(itemView);

        lblTitle = (TextView) itemView.findViewById(R.id.item);
        lblSubTitle = (TextView) itemView.findViewById(R.id.line2);
        lblDescription = (TextView) itemView.findViewById(R.id.text_view);
        img = (ImageView) itemView.findViewById(R.id.icon);

        linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayoutItem);



    }
}
