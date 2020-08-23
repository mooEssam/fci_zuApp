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

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.V_holder> {
    Context context;
    ArrayList<Doctor> list;
    public TeamAdapter(Context context, ArrayList<Doctor> list)
    {
        this.context=context;
        this.list=list;
    }
    @NonNull
    @Override
    public V_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.team_member,null,false);
        V_holder v_holder=new V_holder(v);
        return v_holder;
    }

    @Override
    public void onBindViewHolder(@NonNull V_holder holder, int position) {
       // holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.obj.setText(list.get(position).getObjective());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class V_holder extends RecyclerView.ViewHolder {
        ImageView imageView=itemView.findViewById(R.id.memberimage);
        TextView name=itemView.findViewById(R.id.membername);
        TextView obj=itemView.findViewById(R.id.memberdetail);
        public V_holder(@NonNull View itemView) {
            super(itemView);

        }

    }
}
