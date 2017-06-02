package com.mzy.demosortout.guidedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.mzy.demosortout.R;

import java.util.ArrayList;
import java.util.List;

public class GuiDeClassActivity extends AppCompatActivity {

    private ListView lv_gdc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gui_de_class);
        initView();
        initData();
    }

    private void initData() {
        List<String> list=new ArrayList<>();
        list.add("引导页效果01");
        GuIDeClassAdapter guiAdapter=new GuIDeClassAdapter(list,this);
        lv_gdc.setAdapter(guiAdapter);
    }

    private void initView() {
        lv_gdc = (ListView) findViewById(R.id.lv_gdc);
    }
}
