package com.srd14.actividad41;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CharizardViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public CharizardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("It's Charizard!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
