package com.hackingbuzz.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Avi Hacker on 10/6/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    String[] country_names,country_capitals;
     public static Context ct;

    public RecyclerAdapter(String[] counry_names ,String[] country_capitals,Context ct) {

        this.country_names =  counry_names;
        this.country_capitals = country_capitals;
        this.ct=ct;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.tx_country_capitals.setText(country_capitals[position]);
        holder.tx_country_names.setText(country_names[position]);

    }

    @Override
    public int getItemCount() {
        return country_names.length;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener {
        TextView tx_country_names, tx_country_capitals;


        public RecyclerViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            tx_country_capitals = (TextView) itemView.findViewById(R.id.capital_name);
            tx_country_names = (TextView) itemView.findViewById(R.id.country_name);
        }

        @Override
        public void onClick(View v) {
            int position=getAdapterPosition();
            if(position==1)
            {
                Toast.makeText(ct, "first", Toast.LENGTH_SHORT).show();
            }
            if(position==2)
            {
                Toast.makeText(ct, "second", Toast.LENGTH_SHORT).show();
            }

        }
    }
}
