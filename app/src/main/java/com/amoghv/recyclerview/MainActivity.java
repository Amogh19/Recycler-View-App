package com.amoghv.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;
    int[] img;
    String[] titles;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler=findViewById(R.id.recyclerview);
        titles=getResources().getStringArray(R.array.imageTitles);
        img=new int[]{R.drawable.a,R.drawable.a2,R.drawable.b,R.drawable.b2,R.drawable.c,R.drawable.c2,R.drawable.d,R.drawable.d2,R.drawable.e,R.drawable.e2};
        adapter = new MyAdapter(this,titles,img);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(adapter);
    }
}