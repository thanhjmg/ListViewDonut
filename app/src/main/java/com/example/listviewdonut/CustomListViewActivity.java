package com.example.listviewdonut;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;



public class CustomListViewActivity extends AppCompatActivity {
    private List<Donut> listDonuts;
    private ListView lstView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_listview_donut_activity);

        lstView = findViewById(R.id.idListViewDonut);
        listDonuts = new ArrayList<>();

        listDonuts.add(new Donut(1, "Tasty Donut", "Spicy tasty donut family", 10, R.drawable.donut_a));
        listDonuts.add(new Donut(2, "Pink Donut", "Spicy tasty donut family", 20, R.drawable.donut_b));
        listDonuts.add(new Donut(3, "Floating Donut", "Spicy tasty donut family", 30, R.drawable.donut_c));
        listDonuts.add(new Donut(4, "Red Donut", "Spicy tasty donut family", 40, R.drawable.donut_d));

        DonutAdapter adapter = new DonutAdapter(this, R.layout.item_donut_activity, listDonuts);
        lstView.setAdapter(adapter);
    }
}
