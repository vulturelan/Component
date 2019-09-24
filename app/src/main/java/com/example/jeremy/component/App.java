package com.example.jeremy.component;

import android.app.Application;

import com.example.jeremy.componentlib.AppCompat;
import com.example.jeremy.componentlib.AppConfig;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initComponent();
    }

    private void initComponent() {
        for (String component : AppConfig.COMPONENTS) {
            try {
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if (object instanceof AppCompat) {
                    ((AppCompat) object).initialize(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
