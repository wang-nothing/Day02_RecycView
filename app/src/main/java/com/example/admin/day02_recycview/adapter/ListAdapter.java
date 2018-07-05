package com.example.admin.day02_recycview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.admin.day02_recycview.R;
import com.example.admin.day02_recycview.hodler.ListHolder;

import java.util.List;
import java.util.zip.InflaterInputStream;

public class ListAdapter extends RecyclerView.Adapter<ListHolder> {
    private Context context;
    private List<String> datas;

    public ListAdapter(Context context, List<String> datas) {
        this.context = context;
        this.datas = datas;
    }

    @NonNull
    @Override
    public ListHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ListHolder(LayoutInflater.from(context).inflate(R.layout.textlayout,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ListHolder listHolder, int i) {
        listHolder.tv_text.setText(datas.get(i));
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }
}
