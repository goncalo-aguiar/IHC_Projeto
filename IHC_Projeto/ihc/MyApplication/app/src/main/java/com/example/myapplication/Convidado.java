package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Convidado extends AppCompatActivity {

    private ListView listView2;

    ArrayList<String> medalList = new ArrayList<String>();

    int imagens[] = {R.drawable.lol111,R.drawable.lol111,R.drawable.lol111,R.drawable.lol111,R.drawable.lol111,R.drawable.lol111,R.drawable.lol111,R.drawable.lol111,R.drawable.lol111};
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convidado);
        String user = getIntent().getStringExtra("nome");
        medalList.add("Fred232                                                               ");
        medalList.add("Ricky9                                                               ");
        medalList.add("Jeffkd                                                               ");
        medalList.add("Miraid22                                                               ");
        medalList.add("jaquimms3                                                               ");
        medalList.add("fato22as                                                               ");
        medalList.add("margarida33                                                               ");
        medalList.add("matildekj3                                                               ");
        medalList.add(user);
        String[] medalList1= new String[medalList.size()];
        medalList.toArray(medalList1);
        listView2 = (ListView) findViewById(R.id.lista_grupo);
        GroupCreatedAdaptor adapter2 = new GroupCreatedAdaptor(getBaseContext(), medalList.toArray(medalList1), imagens);
        listView2.setAdapter(adapter2);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt,
                                    long paramLong) {
                /*openProfile()*/
            }
        });

        botao = (Button) findViewById(R.id.invite);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*convidar();*/
            }
        });

        Button back = (Button)findViewById(R.id.back666);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_back();
            }
        });


    }

    public void open_back(){
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("carregar","ir_para_grupos");
        startActivity(intent);
    }


}