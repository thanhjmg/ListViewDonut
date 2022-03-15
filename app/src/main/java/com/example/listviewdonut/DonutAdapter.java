package com.example.listviewdonut;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.List;

public class DonutAdapter extends BaseAdapter {

     Context ctx;
     int idLayout;
     List<Donut> listDonut;

    private int positionSelect = -1;

    public DonutAdapter(Context ctx, int idLayout, List<Donut> listDonut) {
        this.ctx = ctx;
        this.idLayout = idLayout;
        this.listDonut = listDonut;
    }

    @Override
    public int getCount() {
        if (listDonut.size() != 0 && !listDonut.isEmpty()) {
            return listDonut.size();
        }
        return 0;

    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(ctx).inflate(idLayout, viewGroup, false);
        }
        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvCT = view.findViewById(R.id.tvCT);
        TextView tvprice = view.findViewById(R.id.tvprice);
        ImageView imgDonut = view.findViewById(R.id.imgDonut);

        final ConstraintLayout layoutDonutItem =  view.findViewById(R.id.layoutDonutItem);

        final Donut donut = listDonut.get(i);
        if (listDonut != null && !listDonut.isEmpty()) {
            tvName.setText(donut.getName());
            tvCT.setText(donut.getChuthich());
            tvprice.setText(donut.getPrice());
            int idDonut = donut.getImageDonut();
            switch (idDonut) {
                case 1:
                    imgDonut.setImageResource(R.drawable.donut_a);
                    break;
                case 2:
                    imgDonut.setImageResource(R.drawable.donut_b);
                    break;
                case 3:
                    imgDonut.setImageResource(R.drawable.donut_c);
                    break;
                case 4:
                    imgDonut.setImageResource(R.drawable.donut_d);
                default:
                    break;
            }
        }
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ctx, donut.getName(), Toast.LENGTH_LONG).show();
                positionSelect = i;
                notifyDataSetChanged();
            }
        });
        if(positionSelect ==i){
            layoutDonutItem.setBackgroundColor(Color.BLUE);
        }else {
            layoutDonutItem.setBackgroundColor(Color.WHITE);
        }
        return view;
    }


}
