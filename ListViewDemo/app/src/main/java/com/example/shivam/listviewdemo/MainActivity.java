package com.example.shivam.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lstView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstView=(ListView)findViewById(R.id.lstView);
//        String[] names={"Chicken Biryani","Tandori Chicken","Butter Chicken","Roti"};
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,names);
        int [] images={R.drawable.batman,R.drawable.ironman,R.drawable.mickey};
        String [] names={"Batman","Iron Man","Mickey Mouse"};
        CustomAdapter customAdapter= new CustomAdapter(MainActivity.this,images,names);
        lstView.setAdapter(customAdapter);
//        lstView.setAdapter(arrayAdapter);
    }
}
