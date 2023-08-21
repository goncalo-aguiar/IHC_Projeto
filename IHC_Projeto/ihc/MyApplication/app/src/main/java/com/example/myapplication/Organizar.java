package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Organizar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizar);
        String data = getIntent().getStringExtra("data");
        String place = getIntent().getStringExtra("place");
        TextView tx = findViewById(R.id.aqui);
        tx.setText(data);
        TextView tx1 = findViewById(R.id.aqui2);
        tx1.setText(place);

        Button back = (Button)findViewById(R.id.back66);
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