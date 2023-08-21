package com.example.myapplication;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class NotAdapter extends BaseAdapter {
    Context context;
    String[] Grupos;
    int [] imagens;
    String[] botao1;
    LayoutInflater inflater;
    public  NotAdapter(Context ctx, String[] x,int y[],String[] botao){
        context=ctx;
        Grupos = x;
        imagens = y;
        botao1 = botao;
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
        view = inflater.inflate(R.layout.activity_custom_not_view22,null);
        TextView txtView = (TextView) view.findViewById(R.id.textview2222);
        ImageView med = (ImageView) view.findViewById(R.id.imageicon2222);
        txtView.setText(Grupos[i]);
        med.setImageResource(imagens[i]);
        return view;
    }
}
