package com.example.admin.day02_recycview.hodler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.admin.day02_recycview.R;

public class ListHolder extends RecyclerView.ViewHolder {
    public TextView tv_text;
    public ListHolder(@NonNull View itemView) {
        super(itemView);
        tv_text = itemView.findViewById(R.id.tv_text);
    }
}
