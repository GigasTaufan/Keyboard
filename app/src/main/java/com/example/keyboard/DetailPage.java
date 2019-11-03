package com.example.keyboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailPage extends AppCompatActivity {

    ImageView imgdetailimage;
    TextView tvdetailname;
    TextView tvdetailprice;
    TextView tvdetaildetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_page);

        imgdetailimage = findViewById(R.id.img_detail_image);
        tvdetailname = findViewById(R.id.tv_detail_name);
        tvdetailprice = findViewById(R.id.tv_detail_price);
        tvdetaildetails = findViewById(R.id.tv_detail_details);

        Intent intent = getIntent();
        Keyboard keyboard = intent.getParcelableExtra("data");

        Glide.with(this).load(keyboard.getPhoto()).into(imgdetailimage);
        tvdetailname.setText(keyboard.getName());
        tvdetailprice.setText(keyboard.getPrice());
        tvdetaildetails.setText(keyboard.getDetail());
    }
}
