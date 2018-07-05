package com.example.admin.day02_recycview.hodler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.day02_recycview.R;

public class ImageHolder extends RecyclerView.ViewHolder {
    public ImageView thrid_image;
    public TextView thrid_tv3;
    public ImageHolder(@NonNull View itemView) {
        super(itemView);
        thrid_image = itemView.findViewById(R.id.thrid_image);
        thrid_tv3 = itemView.findViewById(R.id.thrid_tv);
    }
}
