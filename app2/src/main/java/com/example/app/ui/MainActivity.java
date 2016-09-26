package com.example.app.ui;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.app.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //设置支持toolbar,代替以前的Actionbar
        setSupportActionBar(toolbar);
        //支持图标导航
        ActionBar actionBar = getSupportActionBar();
        //关闭当前界面，回到上一层界面
        assert actionBar !=null;
        actionBar.setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onNavigateUp() {
        //结束当前Activity生命周期
        finish();
        return super.onNavigateUp();
    }
}
