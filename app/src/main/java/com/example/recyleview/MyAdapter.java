package com.example.recyleview;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String Data1[], Data2[];
    int Images[];
    Context context;

    public MyAdapter(Context ct,String Image[], String Deskripsi[], int Img[]){
        context = ct;
        Data1 = Image;
        Data2 = Deskripsi;
        Images = Img;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.MyText1.setText(Data1[position]);
        holder.MyText2.setText(Data2[position]);
        holder.MyImage.setImageResource(Images[position]);
    }

    @Override
    public int getItemCount() {
        return Images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView MyText1, MyText2;
        ImageView MyImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            MyText1 = itemView.findViewById(R.id.MyText1);
            MyText2 = itemView.findViewById(R.id.MyText2);
            MyImage = itemView.findViewById(R.id.MyImageView);
        }
    }
}
