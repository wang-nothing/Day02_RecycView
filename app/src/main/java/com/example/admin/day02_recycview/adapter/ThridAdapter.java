package com.example.admin.day02_recycview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.admin.day02_recycview.R;
import com.example.admin.day02_recycview.hodler.ImageHolder;
import com.example.admin.day02_recycview.hodler.ImageLeftHolder;
import com.example.admin.day02_recycview.hodler.ThridHolder;

import java.util.List;

public class ThridAdapter extends RecyclerView.Adapter {
    private Context context;
    private List<String> datas;
    private final int ITEM_TYPE_ONE = 1;
    private final int ITEM_TYPE_TWO = 2;
    private final int ITEM_TYPE_THREE = 3;

    public ThridAdapter(Context context, List<String> datas) {
        this.context = context;
        this.datas = datas;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder holder = null;
        switch (i){
            case ITEM_TYPE_ONE:
                holder = new ThridHolder(LayoutInflater.from(context).inflate(R.layout.thrid_item,viewGroup,false));
                break;
            case ITEM_TYPE_TWO:
                holder = new ImageHolder(LayoutInflater.from(context).inflate(R.layout.thrid_image,viewGroup,false));
                break;
            case ITEM_TYPE_THREE:
                holder = new ImageLeftHolder(LayoutInflater.from(context).inflate(R.layout.thrid_left_image,viewGroup,false));
                break;
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int viewType = getItemViewType(i);
        switch (viewType){
            case ITEM_TYPE_ONE:
                ((ThridHolder) viewHolder).thrid_tv.setText(datas.get(i));
                break;
            case ITEM_TYPE_TWO:
                ((ImageHolder) viewHolder).thrid_tv3.setText(datas.get(i));
                break;
            case ITEM_TYPE_THREE:
                ((ImageLeftHolder) viewHolder).thrid_tv2.setText(datas.get(i));
                break;
        }
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position % 3 == 0){
            return ITEM_TYPE_ONE;
        }else if (position % 3 == 1){
            return ITEM_TYPE_TWO;
        }else{
            return ITEM_TYPE_THREE;
        }
    }
}
