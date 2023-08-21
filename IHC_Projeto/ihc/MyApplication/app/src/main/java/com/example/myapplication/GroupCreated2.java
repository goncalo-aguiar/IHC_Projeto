package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GroupCreated2 extends AppCompatActivity {
    Button org;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_created2);

        org = (Button)findViewById(R.id.activity);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open();
            }
        });
        Button back = (Button)findViewById(R.id.back66666);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_back();
            }
        });
    }

    public void open(){
        Intent intent = new Intent(this,Organizar.class);
        EditText nome = (EditText)findViewById(R.id.data);
        String data= nome.getText().toString();
        EditText nome1 = (EditText)findViewById(R.id.place);
        String place= nome1.getText().toString();
        intent.putExtra("data",data);
        intent.putExtra("place",place);
        startActivity(intent);
    }

    public void open_back(){
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("carregar","ir_para_grupos");
        startActivity(intent);
    }
}