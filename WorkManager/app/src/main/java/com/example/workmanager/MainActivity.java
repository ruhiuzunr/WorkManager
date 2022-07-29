package com.example.workmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;

import android.os.Bundle;
import android.util.Log;

import com.example.workmanager.databinding.ActivityMainBinding;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());

        tasarim.buttonYap.setOnClickListener(view -> {/*

            //Şartımız hazır
            Constraints calismaKosulu = new Constraints.Builder()
                    .setRequiredNetworkType(NetworkType.CONNECTED)
                    .build();
            //İsteğimiz
            WorkRequest istek = new OneTimeWorkRequest.Builder(MyWorker.class)
                    .setInitialDelay(10, TimeUnit.SECONDS)
                    .setConstraints(calismaKosulu)
                    .build();

            WorkManager.getInstance(this).enqueue(istek);

            WorkManager.getInstance(this).getWorkInfoByIdLiveData(istek.getId())
                    .observe(this,workInfo -> {
                        String Durum = workInfo.getState().name();
                        Log.e("Arkaplan işlem",Durum);
                    });
                    */

            WorkRequest istek = new PeriodicWorkRequest
                    .Builder(MyWorkerBildirim.class,1,TimeUnit.MINUTES)
                    .setInitialDelay(5,TimeUnit.SECONDS)
                    .build();
            WorkManager.getInstance(this).enqueue(istek);
        });

    }
}