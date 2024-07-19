package com.example.constraintlayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button buttonTrabalho2 = findViewById(R.id.button2Id);
        Button buttonTrabalho3 = findViewById(R.id.button3Id);
        Button buttonTrabalho4 = findViewById(R.id.button4Id);

        buttonTrabalho3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TrabalhoActivity3.class);
                startActivity(intent);
            }
        });

        buttonTrabalho2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TrabalhoActivity2.class);
                startActivity(intent);
            }
        });

        buttonTrabalho4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TrabalhoActivity4.class);
                startActivity(intent);
            }
        });

    }
}