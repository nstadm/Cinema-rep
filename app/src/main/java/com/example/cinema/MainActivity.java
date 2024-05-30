package com.example.cinema;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout buttonComedy = findViewById(R.id.button_comedy);
        RelativeLayout buttonHorror = findViewById(R.id.button_horror);
        RelativeLayout buttonDrama = findViewById(R.id.button_drama);

        buttonComedy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ComedyActivity.class);
                startActivity(intent);
            }
        });

        buttonHorror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HorrorActivity.class);
                startActivity(intent);
            }
        });

        buttonDrama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DramaActivity.class);
                startActivity(intent);
            }
        });
    }
}
