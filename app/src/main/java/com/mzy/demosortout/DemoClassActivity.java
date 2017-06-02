package com.mzy.demosortout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.mzy.demosortout.guidedemo.GuiDeClassActivity;

public class DemoClassActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_class);
        initView();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_democlass_yindao:
                Intent intent=new Intent(this, GuiDeClassActivity.class);
                startActivity(intent);
                break;
        }
    }

    private void initView() {
        findViewById(R.id.tv_democlass_yindao).setOnClickListener(this);
    }
}
