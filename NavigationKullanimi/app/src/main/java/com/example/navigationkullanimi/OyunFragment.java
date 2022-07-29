package com.example.navigationkullanimi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationkullanimi.databinding.FragmentBirinciBinding;
import com.example.navigationkullanimi.databinding.FragmentOyunBinding;

public class OyunFragment extends Fragment {
    private FragmentOyunBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOyunBinding.inflate(inflater,container,false);

        binding.buttonSonuc.setOnClickListener(view->{
            Navigation.findNavController(view).navigate(R.id.SonucFragmentGecis);

        });

        return binding.getRoot();
    }
}