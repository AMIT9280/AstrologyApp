package com.astrologyapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class myBaseAdaptr extends BaseAdapter {
    Context context;
    ArrayList<RashiModel> rashiModelArrayList;
    public myBaseAdaptr(Context context, ArrayList<RashiModel> rashiModelArrayList) {
        this.context = context;
        this.rashiModelArrayList = rashiModelArrayList;
    }

    @Override
    public int getCount() {
        return rashiModelArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return rashiModelArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater)  context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.raw_custm_list,null);
        ImageView imgData = view.findViewById(R.id.img_data);

        TextView tvData = view.findViewById(R.id.tv_data);

        RashiModel rashiModel = rashiModelArrayList.get(i);

        imgData.setImageResource(rashiModelArrayList.get(i).getImgList());
        tvData.setText(rashiModel.getRashi());
        return view;
    }
}
