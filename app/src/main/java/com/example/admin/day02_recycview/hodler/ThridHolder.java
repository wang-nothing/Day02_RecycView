package com.example.admin.day02_recycview.hodler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.admin.day02_recycview.R;

public class ThridHolder extends RecyclerView.ViewHolder {
    public TextView thrid_tv;
    public ThridHolder(@NonNull View itemView) {
        super(itemView);
        thrid_tv = itemView.findViewById(R.id.thrid_tv);
    }
}
