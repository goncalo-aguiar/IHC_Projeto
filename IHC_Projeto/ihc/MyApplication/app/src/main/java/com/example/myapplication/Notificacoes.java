package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class Notificacoes extends AppCompatActivity {
    private ListView listView2;
    String medalList[] = {"You were invited to the group Aveiro Runners     ",
                          "Ricky9 just asked to join your group              ",
                          "You were invited to the group Aveiro Runners      "};
    int imagens[] = {R.drawable.nott,R.drawable.nott,R.drawable.nott};
    String botao[] = {"aa","a","fsfd"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificacoes);

       /* listView2 = (ListView)findViewById(R.id.lista_not);
        NotAdapter adapter2 = new NotAdapter(getBaseContext(),medalList,imagens,botao);
        listView2.setAdapter(adapter2);*/

        /*listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt,
                                    long paramLong) {
                openProfile();
            }
        });*/

        Button botao = (Button) findViewById(R.id.backl);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_back();
            }
        });

        Button botao1 = (Button) findViewById(R.id.bottao1);
        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_back();
            }
        });
        Button botao2 = (Button) findViewById(R.id.bottao);
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_back();
            }
        });
        Button botao3 = (Button) findViewById(R.id.bottao12);
        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_back();
            }
        });

        Button botao3w = (Button) findViewById(R.id.bottao23);
        botao3w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_back();
            }
        });

        Button botao3q = (Button) findViewById(R.id.bottao12);
        botao3q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_back();
            }
        });

        Button botao3f = (Button) findViewById(R.id.bottao122);
        botao3f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_back();
            }
        });

        Button botao3g = (Button) findViewById(R.id.bottao232);
        botao3g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_back();
            }
        });

        Button botao3l = (Button) findViewById(R.id.bottao2321);
        botao3l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_back();
            }
        });
    }
    public void open_back(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}



