package com.example.navigationkullanimi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationkullanimi.databinding.FragmentBirinciBinding;

public class BirinciFragment extends Fragment {
    private FragmentBirinciBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentBirinciBinding.inflate(inflater,container,false);

        binding.buttonBasla.setOnClickListener(view ->{
            Navigation.findNavController(view).navigate(R.id.OyunFragmentGecis);

        });
        return binding.getRoot();
    }
}