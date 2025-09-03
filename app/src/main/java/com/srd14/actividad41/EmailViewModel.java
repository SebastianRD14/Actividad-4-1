package com.srd14.actividad41;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EmailViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public EmailViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Este es el email fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}