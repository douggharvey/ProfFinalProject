package com.douglasharvey.android.myphotolibrary.addcontact;

import com.douglasharvey.android.myphotolibrary.addcontact.events.AddContactEvent;


public interface AddContactPresenter {
    void onShow();
    void onDestroy();

    void addContact(String email);
    void onEventMainThread(AddContactEvent event);
}

