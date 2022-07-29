package com.example.calismayapisi.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.calismayapisi.R;
import com.example.calismayapisi.databinding.FragmentThirdBinding;


public class thirdFragment extends Fragment {
    private FragmentThirdBinding tasarim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        tasarim = FragmentThirdBinding.inflate(inflater, container, false);
        return tasarim.getRoot();
    }
    public void FragmentVeriGoster(String gelenVeri){
        tasarim.textViewAlinanVeri.setText(gelenVeri);

    }
}