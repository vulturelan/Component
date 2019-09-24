package com.example.jeremy.logincomponent;

import android.app.Application;

import com.example.jeremy.componentlib.AppCompat;
import com.example.jeremy.componentlib.ServiceFactory;

public class LoginApp extends Application implements AppCompat {

    private Application mApp;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void initialize(Application app) {
        mApp = app;
        ServiceFactory.getInstance().setLoginService(new LoginService());
    }

    public Application getApp() {
        return mApp;
    }
}
