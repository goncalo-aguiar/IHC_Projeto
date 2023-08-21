package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CriarGrupo extends AppCompatActivity {
    Button back;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_grupo);

        back = (Button)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Back();
            }
        });

        submit = (Button)findViewById(R.id.create);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Create();
            }
        });
    }

    public void open_Back() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void open_Create(){
        Intent intent = new Intent(this,GroupCreated2.class);
        startActivity(intent);
    }
}