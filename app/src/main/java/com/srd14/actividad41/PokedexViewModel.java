package com.srd14.actividad41;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PokedexViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PokedexViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Bienvenido a la Pokedex");
    }

    public LiveData<String> getText() {
        return mText;
    }
}