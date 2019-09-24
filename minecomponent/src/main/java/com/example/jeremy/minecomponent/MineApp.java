package com.example.jeremy.minecomponent;

import android.app.Application;

import com.example.jeremy.componentlib.AppCompat;
import com.example.jeremy.componentlib.ServiceFactory;

public class MineApp extends Application implements AppCompat {

    private Application mApp;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void initialize(Application app) {
        mApp = app;
        ServiceFactory.getInstance().setMineService(new MineService());
    }

    public Application getApp() {
        return mApp;
    }
}
