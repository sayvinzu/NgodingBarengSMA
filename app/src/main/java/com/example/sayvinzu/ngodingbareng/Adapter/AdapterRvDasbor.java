package com.example.sayvinzu.ngodingbareng.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sayvinzu.ngodingbareng.Activity.DetailActivity;
import com.example.sayvinzu.ngodingbareng.Activity.DetailActivity2;
import com.example.sayvinzu.ngodingbareng.Fragment.FragmentDasbor;
import com.example.sayvinzu.ngodingbareng.R;
import com.squareup.picasso.Picasso;

/**
 * Created by SAYVINZU on 13/10/2017.
 */

public class AdapterRvDasbor extends RecyclerView.Adapter<AdapterRvDasbor.ViewHolder> {

    String title [];
    int imgBg [], imgType [];
    //Activity activity;
    Activity activity;

    public AdapterRvDasbor(String[] title, int[] imgBg, int[] imgType, Activity activity) {
        this.title = title;
        this.imgBg = imgBg;
        this.imgType = imgType;
        this.activity = activity;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_dasbor, parent, false);
        ViewHolder VH = new ViewHolder(v);
        return VH;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        holder.title.setText(title[position]);
        //holder.imgBg.setImageResource(imgBg[position]);
        Picasso.with(activity).load(imgBg[position]).resize(800, 370).into(holder.imgBg);
        holder.imgBg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity, DetailActivity.class);
                i.putExtra("imgBg",imgBg[position]);
                i.putExtra("title",title[position]);
                activity.startActivity(i);
            }
        });

        holder.imgType.setImageResource(imgType[position]);

    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        ImageView imgBg, imgType;

        public ViewHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.txt_titleList);
            imgBg = (ImageView) itemView.findViewById(R.id.img_List);
            imgType = (ImageView) itemView.findViewById(R.id.img_Type);
        }
    }
}
