package com.example.thejob;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import java.util.ArrayList;


public class About_us_fragment extends Fragment {
ViewFlipper viewFlipper;
RecyclerView recyclerView;
TeamAdapter teamAdapter;
ArrayList<Doctor> team;


    public About_us_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_us_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int images[]={R.drawable.mission1,R.drawable.mission2,R.drawable.mission3,R.drawable.mission4};
        viewFlipper=getActivity().findViewById(R.id.ourmissionflibber);
        for (int image:images)
        {
            fllibers(image);

        }
        team=new ArrayList<>();
        team.add(new Doctor(R.drawable.user,"Dr / Marawa","project Manager"));
        team.add(new Doctor(R.drawable.user,"Eng / Mahmoud Elmahdy","Superviser"));
        team.add(new Doctor(R.drawable.user,"Mahmoud Abd Alziem","Team Leader && Full Stack"));
        team.add(new Doctor(R.drawable.user,"Mohamed Nasralla","Front End"));
        team.add(new Doctor(R.drawable.user,"Mohamed Osama","Ios Development"));
        team.add(new Doctor(R.drawable.user,"Mahmoud Whadan","Android Development"));
        team.add(new Doctor(R.drawable.user,"Mahmoud Ashraf","Android Development"));
        team.add(new Doctor(R.drawable.user,"Mohamed Elsayed","Analysis Implementation"));
        team.add(new Doctor(R.drawable.user,"Moamen Tarek","UI && UX Design"));
        recyclerView=getActivity().findViewById(R.id.teamrecycler);
        teamAdapter=new TeamAdapter(getContext(),team);
        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(teamAdapter);

    }

    public void fllibers(int image)
    {
        ImageView imageView=new ImageView(getContext());
        imageView.setImageResource(image);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.setAutoStart(true);
        viewFlipper.setInAnimation(getContext(),android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(getContext(),android.R.anim.slide_out_right);

    }
}