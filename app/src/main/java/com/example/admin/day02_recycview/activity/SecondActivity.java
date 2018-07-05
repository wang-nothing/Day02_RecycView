package com.example.admin.day02_recycview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Button;

import com.example.admin.day02_recycview.R;
import com.example.admin.day02_recycview.adapter.SecondAdapter;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView recyclerview;
    private Button btn_add;
    private Button btn_del;
    private List<String> datas;
    private SecondAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initViews();
        initDatas();
        adapter = new SecondAdapter(SecondActivity.this, datas);
        recyclerview.setAdapter(adapter);
    }

    private void initDatas() {
        datas = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            datas.add("撒旦"+i);
        }
        recyclerview.setLayoutManager(new StaggeredGridLayoutManager(3, OrientationHelper.VERTICAL));
    }

    private void initViews() {
        recyclerview = findViewById(R.id.recyclerview);
        btn_add = findViewById(R.id.btn_add);
        btn_del = findViewById(R.id.btn_del);
        btn_del.setOnClickListener(this);
        btn_add.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_add:
                datas.add(2,"零空间");
                adapter.notifyItemInserted(2);
                break;
            case R.id.btn_del:
                datas.remove(2);
                adapter.notifyItemRemoved(2);
                break;
        }
    }
}
