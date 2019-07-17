package com.zedy.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    ArrayList<Contact> contacts = new ArrayList<>();

    public ContactAdapter(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row, viewGroup, false);

        ItemViewHolder itemViewHolder = new ItemViewHolder(v);

        // انشاء وربط الديزين بالادباتر
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ItemViewHolder itemViewHolder, final int i) {
        // ربط العناصر اللي ف الlist بالداتا اللي معاك
        itemViewHolder.Name.setText(contacts.get(i).getName());
        itemViewHolder.Phonenumber.setText(contacts.get(i).getPhonenumber());

        itemViewHolder.ConImg.setImageResource(contacts.get(i).getImgLink());

        itemViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), DetailsActivity.class);

                intent.putExtra("Name", contacts.get(i).getName());
                intent.putExtra("Address", contacts.get(i).getAddress());
                intent.putExtra("ImgLink", contacts.get(i).getImgLink());
                intent.putExtra("Number", contacts.get(i).getPhonenumber());

                itemViewHolder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return contacts.size();// عدد عناصر ال listview
    }
}
