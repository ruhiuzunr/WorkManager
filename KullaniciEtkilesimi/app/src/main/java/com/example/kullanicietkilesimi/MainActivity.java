package com.example.kullanicietkilesimi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.example.kullanicietkilesimi.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonToast.setOnClickListener(view ->{
            Toast.makeText(this,"Merhaba bu bir Toast Message",Toast.LENGTH_SHORT)

                    .show();
        });

        binding.buttonSnackBar.setOnClickListener(view -> {
            Snackbar.make(view,"Bu sayfayı geçmek istiyor musun ?",Snackbar.LENGTH_SHORT)
                    .setAction("evet",view1 -> {
                        Snackbar.make(view1,"Sayfayı geçtiniz !!!",Snackbar.LENGTH_LONG)
                                .setActionTextColor(Color.RED)
                                .setTextColor(Color.BLUE)
                                .setBackgroundTint(Color.BLACK)
                                .show();

                    })
                    .setActionTextColor(Color.RED)
                    .setTextColor(Color.BLUE)
                    .setBackgroundTint(Color.BLACK)
                    .show();
        });

        binding.buttonAlert.setOnClickListener(view ->{
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            alertDialog.setTitle("Alert Başlık");
            alertDialog.setMessage("Alert Message!!!");


            alertDialog.setPositiveButton("Onay",(d,i)->{
                Toast.makeText(this, "Onay seçildi", Toast.LENGTH_SHORT).show();
            });

            alertDialog.setNegativeButton("Onay değil",(d,i)->{
                Toast.makeText(this, "Onaylanmadı !", Toast.LENGTH_SHORT).show();
            });
            alertDialog.create().show();



        });


    }
}