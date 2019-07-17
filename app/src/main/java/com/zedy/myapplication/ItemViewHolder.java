package com.zedy.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    ImageView ConImg;
    TextView  Name;
    TextView  Phonenumber;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        ConImg = itemView.findViewById(R.id.img);
        Name = itemView.findViewById(R.id.Name);
        Phonenumber = itemView.findViewById(R.id.PhoneNumber);
    }
}
