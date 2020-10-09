package com.example.belajaractivity.Modul.Login_Modul;

import android.view.View;

import com.example.belajaractivity.Base.*;

public class LoginActivityBase extends BaseFragmentHolderActivity {

    LoginFragment loginFragment;

    @Override
    protected void initializeFragment() {
        initializeView();
        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
        ivIcon.setVisibility(View.VISIBLE);
        loginFragment = new LoginFragment();
        setCurrentFragment(loginFragment, false);
    }

}
