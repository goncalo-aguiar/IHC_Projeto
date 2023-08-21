package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class GroupCreated22 extends AppCompatActivity {
    private ListView listView2;
    String medalList[] = {"Fred232                                                              ",
            "Ricky9                                                              ",
            "Jeffkd                                                              ",
            "Miraid22                                                              ",
            "jaquimms3                                                              "
            ,"fato22as                                                              ",
            "margarida33                                                              ",
            "matildekj3                                                              "};
    int imagens[] = {R.drawable.lol111,R.drawable.lol111,R.drawable.lol111,R.drawable.lol111,R.drawable.lol111,R.drawable.lol111,R.drawable.lol111,R.drawable.lol111};
    Button botao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_created22);
        listView2 = (ListView)findViewById(R.id.lista_grupo);
        GroupCreatedAdaptor adapter2 = new GroupCreatedAdaptor(getBaseContext(),medalList,imagens);
        listView2.setAdapter(adapter2);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt,
                                    long paramLong) {
                openProfile();
            }
        });

        Button back = (Button)findViewById(R.id.back6666);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_back();
            }
        });

        Button request = (Button)findViewById(R.id.request);
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_request();
            }
        });
    }

    public void openProfile(){
        Intent intent = new Intent(this,ProfileOther.class);
        startActivity(intent);
    }

    public void open_back(){
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("carregar","ir_para_grupos");
        startActivity(intent);
    }
    public void open_request(){
        Intent intent = new Intent(this,GroupCreated22.class);
        startActivity(intent);
    }
}