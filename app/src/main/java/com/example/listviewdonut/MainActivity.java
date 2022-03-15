package com.example.listviewdonut;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ListView lvDonut;
    ArrayList<Donut> donutArr;

    private Button[] btn = new Button[3];
    private Button btn_unfocus;
    private int[] btn_id = {R.id.btnDonut,R.id.btnPinkDonut,R.id.btnFloadting};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvDonut = findViewById(R.id.layoutDonutItem);
        donutArr = new ArrayList<>();
        donutArr.add(
                new Donut(1,"Tasty Donut","Spicy tasty donut family","$10.00")
        );
        donutArr.add(
                new Donut(2,"Pink Donut","Spicy tasty donut family","$20.00")
        );
        btn[0] =(Button) findViewById(btn_id[0]);
        btn[0].setBackgroundColor(Color.rgb(3,106,150));
        btn[0].setOnClickListener(this);

        btn[1] =(Button) findViewById(btn_id[1]);
        btn[1].setBackgroundColor(Color.rgb(207,207,207));
        btn[1].setOnClickListener(this);

        btn[2] =(Button) findViewById(btn_id[2]);
        btn[2].setBackgroundColor(Color.rgb(207,207,207));
        btn[2].setOnClickListener(this);

        btn_unfocus = btn[0];

        DonutAdapter donutAdapter = new DonutAdapter(this,R.layout.item_donut,donutArr);
        lvDonut.setAdapter(donutAdapter);

    }

    @Override
    public void onClick(View view) {
        
    }
}