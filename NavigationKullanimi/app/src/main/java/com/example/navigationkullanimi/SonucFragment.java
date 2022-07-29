package com.example.navigationkullanimi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationkullanimi.databinding.FragmentBirinciBinding;
import com.example.navigationkullanimi.databinding.FragmentSonucBinding;

public class SonucFragment extends Fragment {
    private FragmentSonucBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSonucBinding.inflate(inflater,container,false);


        return binding.getRoot();
    }
}