package com.example.administrator.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bt_choice).setOnClickListener(this);
        findViewById(R.id.bt_popu).setOnClickListener(this);
        findViewById(R.id.bt_date).setOnClickListener(this);
        findViewById(R.id.bt_time).setOnClickListener(this);
        findViewById(R.id.bt_custom_alert).setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        switch(v.getId())
        {
            case R.id.bt_choice:
                //选择对话框
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                //设置标题（对话框主题）  返回值位构造器对象
                builder.setTitle("提示");
                //设置内容（对话框的下一步选择）
                builder.setMessage("是否退出此次编辑");
                //设置正面按钮
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //抛出一个Toast
                        Toast.makeText(MainActivity.this, "您选择了退出此次编辑", Toast.LENGTH_SHORT).show();
                    }
                });
                //设置反面按钮
                builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //抛出一个Toast
                        Toast.makeText(MainActivity.this, "您选择了继续此次编辑", Toast.LENGTH_SHORT).show();
                    }
                });
                //生成Dialog
                builder.create();
                //展示对话框
                builder.show();
                break;
            case R.id.bt_popu:
                break;
            case R.id.bt_custom_alert:
                //通过AlertDialog构造器来构造和设置属性
                AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
                //把xml文件渲染成view 文件（布局填充器LayoutInflate）
                View view = LayoutInflater.from(this).inflate(R.layout.dialog_custom_alert,null);
                //^%^*&&*&*^^%^%^……%*
                builder2.setView(view);
                //生成dialog（对话框）
                builder2.create().show();
                break;
            case R.id.bt_date:
                break;
            case R.id.bt_time:
                break;

        }
    }


}
