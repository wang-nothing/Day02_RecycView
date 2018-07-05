package com.example.admin.day02_recycview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.admin.day02_recycview.MainActivity;
import com.example.admin.day02_recycview.R;
import com.example.admin.day02_recycview.adapter.ListAdapter;

import java.util.ArrayList;
import java.util.List;

public class FristActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView recyc_view;
    private Button btn_list;
    private Button btn_grid;
    private Button btn_list_hor;
    private Button btn_grid_hor;
    private List<String> datas;
    private ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist);
        initViews();
        initDatas();
        adapter = new ListAdapter(FristActivity.this, datas);
        recyc_view.setAdapter(adapter);
    }

    private void initViews() {
        recyc_view = findViewById(R.id.recyc_view);
        btn_list = findViewById(R.id.btn_list);
        btn_grid = findViewById(R.id.btn_grid);
        btn_list_hor = findViewById(R.id.btn_list_hor);
        btn_grid_hor = findViewById(R.id.btn_grid_hor);
        btn_list.setOnClickListener(this);
        btn_grid.setOnClickListener(this);
        btn_list_hor.setOnClickListener(this);
        btn_grid_hor.setOnClickListener(this);
    }

    private void initDatas() {
        datas = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            datas.add("请问" + i);
        }
        recyc_view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_list:
                recyc_view.setLayoutManager(new LinearLayoutManager(this));
                adapter.notifyDataSetChanged();
                break;
            case R.id.btn_grid:
                recyc_view.setLayoutManager(new GridLayoutManager(this, 3));
                adapter.notifyDataSetChanged();
                break;
            case R.id.btn_list_hor:
                recyc_view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
                adapter.notifyDataSetChanged();
                break;
            case R.id.btn_grid_hor:
                recyc_view.setLayoutManager(new GridLayoutManager(this, 3, GridLayoutManager.HORIZONTAL, false));
                adapter.notifyDataSetChanged();
                break;

        }
    }
}
