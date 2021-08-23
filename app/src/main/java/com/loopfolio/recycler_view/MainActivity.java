package com.loopfolio.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler = findViewById(R.id.recycler);
        int []images={R.drawable.user_one,R.drawable.user_two,R.drawable.user_three,R.drawable.user_four,R.drawable.user_one,R.drawable.user_two,R.drawable.user_three,R.drawable.user_four,R.drawable.user_one,R.drawable.user_two,R.drawable.user_three,R.drawable.user_four,R.drawable.user_one,R.drawable.user_two,R.drawable.user_three,R.drawable.user_four};
        String[] name={"Ram","jon","suresh","jon","Tom","Roy","gita","pavan","Ram","jon","suresh","jon","Tom","Roy","gita","pavan"};

//        recycler.setLayoutManager(new LinearLayoutManager(this));
//        recycler.setAdapter(new myadapter(name,images));


        //**************Recycler View Horizonatal method 1
//
//        LinearLayoutManager layoutManager= new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        recycler.setLayoutManager(layoutManager);
//        recycler.setAdapter(new myadapter(name,images));

        //**************Recycler View Horizonatal method 2

//        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
//        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
//        recycler.setLayoutManager(linearLayoutManager);
//        recycler.setAdapter(new myadapter(name,images));

        //************Grid Recycler View Vertical
        GridLayoutManager gridLayoutManager=new GridLayoutManager(getApplicationContext(),2);
        recycler.setLayoutManager(gridLayoutManager);
        recycler.setAdapter(new myadapter(name,images));

        //************Grid Recycler View HORIZONTAL
//        GridLayoutManager gridLayoutManager=new GridLayoutManager(getApplicationContext(),2);
//        gridLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
//        recycler.setLayoutManager(gridLayoutManager);
//        recycler.setAdapter(new myadapter(name,images));

        //***********Staggered recyclerview With Vertical
//        StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(3,LinearLayoutManager.VERTICAL);
//        recycler.setLayoutManager(staggeredGridLayoutManager);
//        recycler.setAdapter(new myadapter(name,images));

        //***********Staggered recyclerview With HORIZONTAL
//        StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(2,LinearLayoutManager.HORIZONTAL);
//        recycler.setLayoutManager(staggeredGridLayoutManager);
//        recycler.setAdapter(new myadapter(name,images));

//      What is recycler view ?
//        --View Group to display large set of data
//        --For each item in large dataset, it displays a view
//        --Efficient way to implement Scrollable List
//        --For each item , we have a view.But if we create a view for each iteam in one Go then we have 500 view but user can only see 10-15 viewa at a time. memory wastage

//        View Holder- This will hold the view and helps in recycling
//        adapter - This will adapt our data so that it can be displayed


    }
}