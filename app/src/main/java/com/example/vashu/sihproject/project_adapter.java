package com.example.vashu.sihproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class project_adapter extends RecyclerView.Adapter<project_adapter.ViewHolder> {
    Context context;
    ArrayList<project_modals> arrayList;
     public project_adapter(Context context, ArrayList<project_modals> arrayList){
        this.context=context;
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View V=  LayoutInflater.from(context).inflate(R.layout.project_lists, parent, false);
        ViewHolder viewHolder=new ViewHolder(V);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,  int position) {
        holder.project_name.setText(arrayList.get(position).project_name);
        holder.project_Description.setText(arrayList.get(position).project_Description);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView project_name, project_Description;
        public ViewHolder( View itemView){
            super(itemView);
            imageView = itemView.findViewById(R.id.project_img);
            project_name = itemView.findViewById(R.id.project_name);
            project_Description = itemView.findViewById(R.id.project_description);


        }
    }

}
