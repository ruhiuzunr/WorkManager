package com.example.calismayapisi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.calismayapisi.Fragments.secondFragment;
import com.example.calismayapisi.Fragments.thirdFragment;

public class MainActivityFragments extends AppCompatActivity implements VeriGöndericiInterface  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragments);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.frameLayoutSecond,new secondFragment());
        fragmentTransaction.add(R.id.FrameLayoutThird, new thirdFragment());

        fragmentTransaction.commit();
    }

    @Override
    public void veriGonder(String veri) {
        thirdFragment fragment=(thirdFragment) getSupportFragmentManager().findFragmentById(R.id.FrameLayoutThird);
        fragment.FragmentVeriGoster(veri);
    }
}