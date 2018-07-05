package com.example.admin.day02_recycview.hodler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.day02_recycview.R;

public class ImageLeftHolder extends RecyclerView.ViewHolder {
    public ImageView thrid_left_image;
    public TextView thrid_tv2;
    public ImageLeftHolder(@NonNull View itemView) {
        super(itemView);
        thrid_tv2 = itemView.findViewById(R.id.thrid_tv);
        thrid_left_image = itemView.findViewById(R.id.thrid_left_image);
    }
}
