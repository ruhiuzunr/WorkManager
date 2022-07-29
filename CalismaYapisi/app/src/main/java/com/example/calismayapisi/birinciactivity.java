package com.example.calismayapisi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.calismayapisi.entities.Kisiler;

public class birinciactivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Debug", "onCreate: çalıştı... ");
        setContentView(R.layout.activity_birinciactivity);

        button = findViewById(R.id.buttongeridön);
        textView = findViewById(R.id.textViewisim);
        // String gelenVeri = getIntent().getStringExtra("first");
        Kisiler gelenKisiVeri = (Kisiler) getIntent().getSerializableExtra("ruhiobjesi");
        Log.e("debug", gelenKisiVeri.getTcNo() + " " + gelenKisiVeri.getIsim());

        textView.setText(gelenKisiVeri.getIsim());

        button.setOnClickListener(View -> {
            Intent intent = new Intent(this, MainActivity.class);

            startActivity(intent);
            finish();
        });



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Debug", "onStart: çalıştı.. ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Debug", "onResume: çalıştı.. ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Debug", "onPause: çalıştı... ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Debug", "onStop: çalıştı... ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Debug", "onDestroy: çalıştı... ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Debug", "onRestart: çalıştı... ");
    }

}