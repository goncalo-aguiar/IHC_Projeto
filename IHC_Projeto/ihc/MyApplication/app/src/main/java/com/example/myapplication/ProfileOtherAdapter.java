package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileOtherAdapter extends BaseAdapter {
    Context context;
    String[] Grupos;
    int [] imagens;
    LayoutInflater inflater;
    public ProfileOtherAdapter(Context ctx, String[] x,int y[]){
        context=ctx;
        Grupos = x;
        imagens = y;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return Grupos.length;
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
        view = inflater.inflate(R.layout.activity_custom_list_grupo2,null);
        TextView txtView = (TextView) view.findViewById(R.id.textview);
        ImageView med = (ImageView) view.findViewById(R.id.imageicon);
        txtView.setText(Grupos[i]);
        med.setImageResource(imagens[i]);
        return view;
    }
}
