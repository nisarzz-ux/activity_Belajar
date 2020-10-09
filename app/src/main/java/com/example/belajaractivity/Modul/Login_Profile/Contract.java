package com.example.belajaractivity.Modul.Login_Profile;

import com.example.myintent.base.BasePresenter;
import com.example.myintent.base.BaseView;

/**
 * Created by fahrul on 13/03/19.
 */

public interface Contract {
    interface View extends BaseView<Presenter> {
        void redirectToProfile();
    }

    interface Presenter extends BasePresenter {
        void performLogin(String email, String password);
    }
}
