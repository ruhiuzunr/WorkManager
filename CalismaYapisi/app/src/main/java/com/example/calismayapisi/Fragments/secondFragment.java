package com.example.calismayapisi.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.calismayapisi.R;
import com.example.calismayapisi.VeriGöndericiInterface;
import com.example.calismayapisi.databinding.FragmentSecondBinding;


public class secondFragment extends Fragment{
    private FragmentSecondBinding tasarim;
    private VeriGöndericiInterface veriGöndericiInterface;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        tasarim = FragmentSecondBinding.inflate(inflater, container, false);



        tasarim.buttonVeriGonder.setOnClickListener(view -> {
            String veri = tasarim.editTextName.getText().toString();
            veriGöndericiInterface = (VeriGöndericiInterface) getActivity();
            veriGöndericiInterface.veriGonder(veri);
        });

        return tasarim.getRoot();
    }

}