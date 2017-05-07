package com.hackingbuzz.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private GridLayoutManager gl;
    private StaggeredGridLayoutManager sgl;
    String[] contry = {"India","Pakistan","China","SiiLanks","America","Bhutan",
            "Afganisthan","Nigeria","SouthAfica"};
    String[] capital = {"Delhi","Billi","laCosa","Costa","Parveeb","Kotali","Mitali","Rutba","Korma"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gl=new GridLayoutManager(this,3);
        sgl=new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.HORIZONTAL);
        recyclerView =(RecyclerView) findViewById(R.id.recycler_bin);


        recyclerAdapter = new RecyclerAdapter(capital,contry,this);
       // layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        recyclerView.setLayoutManager(sgl);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(recyclerAdapter);


    }
}

