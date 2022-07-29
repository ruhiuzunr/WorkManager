package com.example.widgetkullanimi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.SeekBar;

import com.example.widgetkullanimi.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());
        /**
         * Button and Set image view
         */

        tasarim.buttonKey.setOnClickListener(view ->{
            tasarim.imageView.setImageResource(R.drawable.resim_2);
        });
        tasarim.buttonProfile.setOnClickListener(view ->{
            tasarim.imageView.setImageResource(getResources().getIdentifier("resim_1","drawable",getPackageName()));
        });
        /**
         * Switch
         */

        tasarim.switch1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                Log.e("debug","Switch ON !!");
            }else{
                Log.e("debug", "Switch OFF !! ");
            }

        });

        /**
         * Checkbox
         */

        tasarim.checkBoxJava.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                Log.e("debug","Java Dilini Seçtiniz.");

            }
        });
        tasarim.checkBoxKotlin.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            if(isChecked){
                Log.e("debug","Kotlin Dilini Seçtiniz.");
            }
        }));

        /**
         * Radio Grup And buttons
         */

        tasarim.radioButtonFener.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            if(isChecked){
                Log.e("debug","Fenerbahçeyi seçtiniz.");
            }
        }));
        tasarim.radioButtonGalatasaray.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            if(isChecked){
                Log.e("debug","Galatasarayı seçtiniz.");
            }
        }));

        /**
         * ProgressBar
         */

        tasarim.buttonBasla.setOnClickListener(view -> {
            tasarim.progressBar.setVisibility(View.VISIBLE);
        });

        tasarim.buttonDur.setOnClickListener(view->{
            tasarim.progressBar.setVisibility(View.INVISIBLE);
        });

        /**
         * Seek Bar
         */
        tasarim.textView.setText(String.valueOf(tasarim.seekBar.getProgress()));

        tasarim.seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tasarim.textView.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        /**
         * Time Picker
         */

        tasarim.buttonTarih.setOnClickListener(view->{
            Calendar calendar = Calendar.getInstance();

            int yil = calendar.get(Calendar.YEAR);
            int ay = calendar.get(Calendar.MONTH);
            int gün = calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog dp = new DatePickerDialog(this,(d,y,a,g)->{
                tasarim.editTextTextTarih.setText(g+"/"+(a+1)+"/"+y);
            },yil,ay,gün);

            dp.setButton(DialogInterface.BUTTON_POSITIVE,"Seç",dp);
            dp.setButton(DialogInterface.BUTTON_NEGATIVE,"İptal",dp);
            dp.show();
        });

        /**
         * Spinner
         */
        ArrayList<String> yemekler = new ArrayList<>();
        yemekler.add("Köfte");
        yemekler.add("Pilav");
        yemekler.add("Mantı");

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,android.R.id.text1,yemekler);

        tasarim.spinner.setAdapter(adapter);

        tasarim.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i , long l) {
                    Log.e("debug",yemekler.get(i)+" Bu seçildi");
                }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}