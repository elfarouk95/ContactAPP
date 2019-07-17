package com.zedy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<Contact> contacts = new ArrayList<>();

    RecyclerView recyclerView;

    ContactAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prepareData();

        adapter = new ContactAdapter(contacts);

        recyclerView = findViewById(R.id.List);

        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new GridLayoutManager(this,1));

    }

    private void prepareData() {
        for (int i = 0; i < 20; i++) {
            Contact contact = new Contact("ah " + i, "011" + i,
                    "assuit" + i, "https://media.linkonlineworld.com/img/large/2019/7/15/2019_7_15_21_57_14_480.jpg"
                    , R.drawable.test);
            contacts.add(contact);
        }

    }
}
