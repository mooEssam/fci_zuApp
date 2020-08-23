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

public class DoctorAdapter extends RecyclerView.Adapter<DoctorAdapter.V_holder> {
    Context context;
    ArrayList<Doctor> list;

    public DoctorAdapter(Context context, ArrayList<Doctor> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public V_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.docrow,null,false);
       V_holder v_holder=new V_holder(v);
        return v_holder;
    }

    @Override
    public void onBindViewHolder(@NonNull V_holder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.obj.setText(list.get(position).getObjective());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class V_holder extends RecyclerView.ViewHolder {
       ImageView imageView=itemView.findViewById(R.id.doctimage);
        TextView name=itemView.findViewById(R.id.doctname);
       TextView obj=itemView.findViewById(R.id.doctobject);
        public V_holder(@NonNull View itemView) {
            super(itemView);

        }

    }
}
