package com.example.myapplication.ui.notifications;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

public class CustomBaseAdapter2 extends BaseAdapter {
    Context context;
    String[] atividades;
    int [] atividades_imagens;
    LayoutInflater inflater;
    public CustomBaseAdapter2(Context ctx, String[] x,int y[]){
        context=ctx;
        atividades = x;
        atividades_imagens = y;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return atividades.length;
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
        view = inflater.inflate(R.layout.activity_custom_list_view2,null);
        TextView txtView = (TextView) view.findViewById(R.id.textview2);
        ImageView med = (ImageView) view.findViewById(R.id.imageicon2);
        txtView.setText(atividades[i]);
        med.setImageResource(atividades_imagens[i]);
        return view;
    }
}