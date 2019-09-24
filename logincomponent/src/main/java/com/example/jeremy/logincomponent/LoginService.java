package com.example.jeremy.logincomponent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.jeremy.componentlib.ILoginService;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class LoginService implements ILoginService {

    @Override
    public void launch(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }

    @Override
    public Fragment getFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        UserInfoFragment userInfoFragment = new UserInfoFragment();
        userInfoFragment.setArguments(bundle);
        fragmentManager.beginTransaction().add(viewId, userInfoFragment).commit();
        return userInfoFragment;
    }
}
