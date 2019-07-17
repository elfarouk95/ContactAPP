package com.zedy.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView Name;
    TextView Address;
    TextView PhoneNubmer;
    ImageView BgImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        Name = findViewById(R.id.DName);
        Address = findViewById(R.id.DAddress);
        PhoneNubmer = findViewById(R.id.PhoneNumber);
        BgImg = findViewById(R.id.BgImg);


        Intent n = getIntent();

        String name = n.getStringExtra("Name");
        String address = n.getStringExtra("Address");
        String number = n.getStringExtra("Number");
        int ImgLink = n.getIntExtra("ImgLink", 0);


        Name.setText(name);
        Address.setText(address);
        PhoneNubmer.setText(number);
        BgImg.setImageResource(ImgLink);

    }
}
