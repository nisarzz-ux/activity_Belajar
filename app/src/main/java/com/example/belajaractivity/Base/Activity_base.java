package com.example.belajaractivity.Base;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.belajaractivity.R;



public abstract  class Activity_base extends FragmentActivity implements listener_fragmen_base {

    protected fragment_basic currentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeView();
        initializeFragment();
    }

    protected abstract void initializeFragment();

    protected abstract void initializeView();

    protected void setCurrentFragment(fragment_basic fragment, boolean addToBackStack) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (currentFragment != null && addToBackStack) {
            fragmentTransaction.addToBackStack(currentFragment.getTitle());
        }

            fragmentTransaction.replace(R.id.flFragmentContainer, fragment, fragment.getTitle());
            fragmentTransaction.commit();
        this.currentFragment = fragment;
    }

}