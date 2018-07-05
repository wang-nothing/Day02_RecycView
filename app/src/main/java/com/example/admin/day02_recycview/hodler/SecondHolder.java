package com.example.admin.day02_recycview.hodler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.admin.day02_recycview.R;

public class SecondHolder extends RecyclerView.ViewHolder {
    public TextView second_tv;
    public SecondHolder(@NonNull View itemView) {
        super(itemView);
        second_tv = itemView.findViewById(R.id.second_tv);
    }
}
