package com.example.thejob;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class Courses extends Fragment {
    CardView is,it,ds,cs;






    public Courses() {
        // Required empty public constructor
    }







    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_courses, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        is=getActivity().findViewById(R.id.iscours);
        is.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),CoursesRecycler.class);
                intent.putExtra("id",1);
                startActivity(intent);
            }
        });
        it=getActivity().findViewById(R.id.Itcours);
        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),CoursesRecycler.class);
                intent.putExtra("id",2);
                startActivity(intent);
            }
        });
        ds=getActivity().findViewById(R.id.dscours);
        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),CoursesRecycler.class);
                intent.putExtra("id",3);
                startActivity(intent);
            }
        });
        cs=getActivity().findViewById(R.id.Cscours);
        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),CoursesRecycler.class);
                intent.putExtra("id",4);
                startActivity(intent);
            }
        });
    }
}