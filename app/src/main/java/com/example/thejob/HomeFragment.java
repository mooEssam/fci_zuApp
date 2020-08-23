package com.example.thejob;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
ViewFlipper viewFlipper;
DoctorAdapter adapter;
ArrayList<Doctor> list;
RecyclerView recyclerView;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyclerView=getActivity().findViewById(R.id.doctorrecycler);
        list=new ArrayList<>();
        list.add(new Doctor(R.drawable.splach,"Ehab Roshdy","We are one of the largest online car buyers and so can buy cars "));
        list.add(new Doctor(R.drawable.l,"Ehab Roshdy","We are one of the largest online car buyers and so can buy cars "));
        list.add(new Doctor(R.drawable.splach,"Ehab Roshdy","We are one of the largest online car buyers and so can buy cars "));
        list.add(new Doctor(R.drawable.l,"Ehab Roshdy","We are one of the largest online car buyers and so can buy cars "));
        list.add(new Doctor(R.drawable.splach,"Ehab Roshdy","We are one of the largest online car buyers and so can buy cars "));
        list.add(new Doctor(R.drawable.l,"Ehab Roshdy","We are one of the largest online car buyers and so can buy cars "));
        adapter=new DoctorAdapter(getContext(),list);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        int images[]={R.drawable.vone,R.drawable.vtow,R.drawable.vthree,R.drawable.vtow};
        viewFlipper=getActivity().findViewById(R.id.v_flib);
        for (int image:images)
        {
            fllibers(image);

        }

    }
    public void fllibers(int image)
    {
        ImageView imageView=new ImageView(getContext());
        imageView.setImageResource(image);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(2500);
        viewFlipper.setAutoStart(true);
        viewFlipper.setInAnimation(getContext(),android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(getContext(),android.R.anim.slide_out_right);

    }
}
