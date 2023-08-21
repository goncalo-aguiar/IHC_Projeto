package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.myapplication.ui.dashboard.CustomBaseAreaGroups;

public class GroupCreated extends AppCompatActivity {
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
        setContentView(R.layout.activity_group_created);

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

        botao = (Button)findViewById(R.id.invite);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convidar();
            }
        });

        Button back = (Button)findViewById(R.id.back6666);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_back();
            }
        });

    }
    public void openProfile(){
        Intent intent = new Intent(this,ProfileOther.class);
        startActivity(intent);
    }
    public void convidar(){
        Intent intent = new Intent(this,Convidado.class);
        EditText nome = (EditText)findViewById(R.id.nome);
        String username= nome.getText().toString();
        intent.putExtra("nome",username);
        startActivity(intent);
    }
    public void open_back(){
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("carregar","ir_para_grupos");
        startActivity(intent);
    }
}