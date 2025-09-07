package com.srd14.actividad41;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BlastoiseViewModel extends ViewModel{
    private final MutableLiveData<String> mText;

    public BlastoiseViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("It's Blastoise!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
