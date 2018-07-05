package com.example.admin.day02_recycview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.admin.day02_recycview.activity.FristActivity;
import com.example.admin.day02_recycview.activity.SecondActivity;
import com.example.admin.day02_recycview.activity.ThridActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
        lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new String[]{"布局管理器", "瀑布流", "多条目 下划线 条目点击"}));
        lv.setOnItemClickListener(this);
}

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i){
            case 0:
                startActivity(new Intent(MainActivity.this, FristActivity.class));
                break;
                case 1:
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
                break;
                case 2:
                startActivity(new Intent(MainActivity.this, ThridActivity.class));
                break;
                //dongxi
        }
    }
}
