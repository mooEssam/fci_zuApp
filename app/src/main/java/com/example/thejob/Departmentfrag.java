package com.example.thejob;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Departmentfrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Departmentfrag extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    public Departmentfrag() {
        // Required empty public constructor
    }


    public static Departmentfrag newInstance(String param1, String param2) {
        Departmentfrag fragment = new Departmentfrag();
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_departmentfrag, container, false);
    }
}