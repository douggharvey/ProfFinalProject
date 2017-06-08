package com.douglasharvey.android.myphotolibrary.login;

import com.douglasharvey.android.myphotolibrary.login.events.LoginEvent;


public interface LoginPresenter {
    void onCreate();
    void onDestroy();
    void checkForAuthenticatedUser();
    void onEventMainThread(LoginEvent event);
    void validateLogin(String email, String password);
    void registerNewUser(String email, String password);
}
