package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class ProfileOther extends AppCompatActivity {
    ListView listView2;
    ListView listView1;

    String medalList[] = {"I've walked 20 Km","I've walked 3 days in a row","I've runned 30 Km"};
    int imagens[] = {R.drawable.daa,R.drawable.daa,R.drawable.daa};

    String atividades[] = {"Running Activity","Walking Activity","Running Activity"};
    int atividades_imagens[] = {R.drawable.correr,R.drawable.andar,R.drawable.correr};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_other);

        listView2 = (ListView)findViewById(R.id.lista);
        ProfileOtherAdapter adapter2 = new ProfileOtherAdapter(getBaseContext(),medalList,imagens);
        listView2.setAdapter(adapter2);

        listView1 = (ListView)findViewById(R.id.lista2);
        ProfileOtherAdapter adapter3 = new ProfileOtherAdapter(getBaseContext(),atividades,atividades_imagens);
        listView1.setAdapter(adapter3);

        Button back = (Button)findViewById(R.id.backkk);
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