package com.example.belajaractivity.Modul.Login_Profile;

import android.os.Bundle;
import android.view.View;

import com.example.myintent.base.BaseFragmentHolderActivity;

public class ActivityBase extends BaseFragmentHolderActivity {

    Fragment fragment;

    @Override
    protected void initializeFragment() {
        Bundle bundle = getIntent().getExtras();
        String email = bundle.getString("Email");
        String password = bundle.getString("Password");
        initializeView();
        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
        ivIcon.setVisibility(View.VISIBLE);
        fragment = new Fragment(email, password);
        setCurrentFragment(fragment, false);
    }

}
