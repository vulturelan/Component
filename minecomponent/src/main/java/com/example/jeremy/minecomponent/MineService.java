package com.example.jeremy.minecomponent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.jeremy.componentlib.ILoginService;
import com.example.jeremy.componentlib.IMineService;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MineService implements IMineService {

    @Override
    public void launch(Context context) {
        Intent intent = new Intent(context, MineActivity.class);
        context.startActivity(intent);
    }

    @Override
    public Fragment getFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        return null;
    }
}
