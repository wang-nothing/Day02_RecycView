package com.example.admin.day02_recycview.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.admin.day02_recycview.R;
import com.example.admin.day02_recycview.hodler.SecondHolder;

import java.util.ArrayList;
import java.util.List;

public class SecondAdapter extends RecyclerView.Adapter<SecondHolder> {
    private Context context;
    private List<String> datas;
    private List<Integer> heightList;

    public SecondAdapter(Context context, List<String> datas) {
        this.context = context;
        this.datas = datas;
        heightList = new ArrayList<>();
        for (int i = 0; i < datas.size(); i++) {
            heightList.add((int)(Math.random() * 100 +200));
        }
    }

    @NonNull
    @Override
    public SecondHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new SecondHolder(LayoutInflater.from(context).inflate(R.layout.second_item,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SecondHolder secondHolder, int i) {
        ViewGroup.LayoutParams layoutParams = secondHolder.second_tv.getLayoutParams();
        layoutParams.height = heightList.get(i);
        secondHolder.second_tv.setBackgroundColor(Color.rgb((int)(Math.random() * 100 + 155),(int)(Math.random() * 100 + 155),(int)(Math.random() * 100 + 155)));
        secondHolder.second_tv.setText(datas.get(i));
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }
}
