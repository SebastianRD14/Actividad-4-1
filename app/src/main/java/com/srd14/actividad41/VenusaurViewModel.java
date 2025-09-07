package com.srd14.actividad41;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;



public class VenusaurViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public VenusaurViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("It's Venusaur");
    }

    public LiveData<String> getText() {
        return mText;
    }
}