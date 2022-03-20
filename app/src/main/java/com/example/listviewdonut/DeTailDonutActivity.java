package com.example.listviewdonut;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DeTailDonutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_donut2);

        ImageView imgView = findViewById(R.id.imgDonut);
        TextView tvName = findViewById(R.id.txtName);
        TextView tvPrice = findViewById(R.id.txtgia);

        Intent in = getIntent();
        int idImage = in.getIntExtra("imageDonut",0);
        String nameDonut = in.getStringExtra("name");
        String priceDonut = in.getStringExtra("price");

        imgView.setImageResource(idImage);
        tvName.setText(nameDonut);
        tvPrice.setText(priceDonut);
    }
}