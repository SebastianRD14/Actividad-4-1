package com.srd14.actividad41;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.srd14.actividad41.databinding.FragmentEmailBinding;

public class EmailFragment extends Fragment {

    private FragmentEmailBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        EmailViewModel galleryViewModel =
                new ViewModelProvider(this).get(EmailViewModel.class);

        binding = FragmentEmailBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textEmail;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}