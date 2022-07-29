package com.example.calismayapisi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.calismayapisi.entities.Kisiler;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.buttonbirinci);

        Kisiler gidecekKisi = new Kisiler(11111111,"Ruhi UZUNER" );
        button.setOnClickListener(view -> {
            Intent intent = new Intent(this,birinciactivity.class);
            intent.putExtra("ruhiobjesi", gidecekKisi);
            startActivity(intent);
        });
    }
}