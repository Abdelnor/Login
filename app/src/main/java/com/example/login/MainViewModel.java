package com.example.login;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private MutableLiveData<Boolean> mLogin = new MutableLiveData<>();
    public LiveData<Boolean> login = mLogin;


    public void dologin(String email){
            this.mLogin.setValue(!email.equals(""));
    }

}
