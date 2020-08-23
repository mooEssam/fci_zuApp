package com.example.thejob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class CoursesRecycler extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<CourseModel> list;
    int is,it,ds,cs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_recycler);
        is=1;
        it=2;
        ds=3;
        cs=4;

        recyclerView=findViewById(R.id.coursesrecyclerview);
        list=new ArrayList<>();
        list.add(new CourseModel("Computer Vision","I must explain to you how all this a mistaken idea of denouncing great explorer of the rut the is lder of human happiness"));
        list.add(new CourseModel("Computer Vision","I must explain to you how all this a mistaken idea of denouncing great explorer of the rut the is lder of human happiness"));
        list.add(new CourseModel("Computer Vision","I must explain to you how all this a mistaken idea of denouncing great explorer of the rut the is lder of human happiness"));
        list.add(new CourseModel("Computer Vision","I must explain to you how all this a mistaken idea of denouncing great explorer of the rut the is lder of human happiness"));
        list.add(new CourseModel("Computer Vision","I must explain to you how all this a mistaken idea of denouncing great explorer of the rut the is lder of human happiness"));
        list.add(new CourseModel("Computer Vision","I must explain to you how all this a mistaken idea of denouncing great explorer of the rut the is lder of human happiness"));
        list.add(new CourseModel("Computer Vision","I must explain to you how all this a mistaken idea of denouncing great explorer of the rut the is lder of human happiness"));
        list.add(new CourseModel("Computer Vision","I must explain to you how all this a mistaken idea of denouncing great explorer of the rut the is lder of human happiness"));
        list.add(new CourseModel("Computer Vision","I must explain to you how all this a mistaken idea of denouncing great explorer of the rut the is lder of human happiness"));
        list.add(new CourseModel("Computer Vision","I must explain to you how all this a mistaken idea of denouncing great explorer of the rut the is lder of human happiness"));
        list.add(new CourseModel("Computer Vision","I must explain to you how all this a mistaken idea of denouncing great explorer of the rut the is lder of human happiness"));
        list.add(new CourseModel("Computer Vision","I must explain to you how all this a mistaken idea of denouncing great explorer of the rut the is lder of human happiness"));
        list.add(new CourseModel("Computer Vision","I must explain to you how all this a mistaken idea of denouncing great explorer of the rut the is lder of human happiness"));
        list.add(new CourseModel("Computer Vision","I must explain to you how all this a mistaken idea of denouncing great explorer of the rut the is lder of human happiness"));
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        CoursesAdapter adapter=new CoursesAdapter(this,list);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}