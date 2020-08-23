package com.example.thejob;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CoursesAdapter extends RecyclerView.Adapter<CoursesAdapter.V_holder> {
    Context context;
    ArrayList<CourseModel> list;

    public CoursesAdapter(Context context, ArrayList<CourseModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public V_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.courserow,null,false);
       V_holder holder=new V_holder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull V_holder holder, int position) {
      holder.name.setText(list.get(position).getName());
        holder.summary.setText(list.get(position).getSummary());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class V_holder extends RecyclerView.ViewHolder {
      //  ImageView imageView=itemView.findViewById(R.id.courseimage);
        TextView name=itemView.findViewById(R.id.coursename);
        TextView summary=itemView.findViewById(R.id.coursesummary);
        public V_holder(@NonNull View itemView) {
            super(itemView);

        }

    }
}

