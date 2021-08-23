package com.loopfolio.recycler_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class myadapter extends RecyclerView.Adapter<myadapter.viewholder> {

    String[] data;
    int[] images;



    public myadapter(String[] data, int[] images) {
        this.data = data;
        this.images = images;
    }



    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.single_view_one, parent, false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        String title = data[position];
        int img = images[position];
        holder.textView.setText(title);
        Glide.with(holder.imageView.getContext()).load(img).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.text);
            imageView = (ImageView) itemView.findViewById(R.id.img);
        }
    }
}
