package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Questionario_Inicial extends AppCompatActivity {
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionario_inicial);
        submit = (Button)findViewById(R.id.login2);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Pag_Inicial();
            }
        });
    }
    public void open_Pag_Inicial(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}