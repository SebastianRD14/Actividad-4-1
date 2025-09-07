package com.srd14.actividad41;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;


import com.bumptech.glide.Glide;
import com.srd14.actividad41.databinding.FragmentBlastoiseBinding;
import com.srd14.actividad41.databinding.FragmentHomeBinding;

public class BlastoiseFragment extends Fragment{
    private FragmentBlastoiseBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BlastoiseViewModel blastoiseViewModel =
                new ViewModelProvider(this).get(BlastoiseViewModel.class);

        binding = FragmentBlastoiseBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textBlastoise;
        blastoiseViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        String url = "https://pokeapi.co/api/v2/pokemon/9/";;


        if (url != null) {
            String id = extractIdFromUrl(url);


            String pokemonImageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/"
                    + id + ".png";


            Glide.with(this)
                    .load(pokemonImageUrl)
                    .into(binding.imageBlastoise);
        }
        return root;
    }

    private String extractIdFromUrl(String url) {
        String[] parts = url.split("/");
        for (int i = parts.length - 1; i >= 0; i--) {
            if (!parts[i].isEmpty()) return parts[i];
        }
        return "";
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

