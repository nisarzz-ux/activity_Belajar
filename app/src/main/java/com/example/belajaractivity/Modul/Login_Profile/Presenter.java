package com.example.belajaractivity.Modul.Login_Profile;

/**
 * Created by fahrul on 13/03/19.
 */

public class Presenter implements Contract.Presenter{

    private final Contract.View view;

    public Presenter(Contract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

    @Override
    public void performLogin(final String email, final String password){
        view.redirectToProfile();
    }

}
