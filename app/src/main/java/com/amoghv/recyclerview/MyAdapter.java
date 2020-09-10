package com.amoghv.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context ctx;
    String titles[];
    int images[];

    public MyAdapter(Context ctx, String[] titles, int[] images) {
        this.ctx = ctx;
        this.titles = titles;
        this.images = images;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(ctx).inflate(R.layout.every_row_design,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imag.setImageResource(images[position]);
        holder.txt.setText(titles[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imag;
        TextView txt;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imag = itemView.findViewById(R.id.img_view);
            txt = itemView.findViewById(R.id.text_view);
        }
    }
}
