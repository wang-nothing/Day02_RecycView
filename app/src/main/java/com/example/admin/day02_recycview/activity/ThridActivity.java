package com.example.admin.day02_recycview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.admin.day02_recycview.R;

import java.util.ArrayList;
import java.util.List;

public class ThridActivity extends AppCompatActivity {
    private RecyclerView recycler_view;
    private List<String> datas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrid);
        initViews();
        initDatas();
    }

    private void initDatas() {
        datas = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            datas.add("行政村"+i);
        }
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initViews() {
        recycler_view = findViewById(R.id.recycler_view);
    }
}
