package com.douglasharvey.android.myphotolibrary.contactlist;

import com.douglasharvey.android.myphotolibrary.contactlist.events.ContactListEvent;


public interface ContactListPresenter {
    void onPause();
    void onResume();
    void onCreate();
    void onDestroy();

    void signOff();
    String getCurrentUserEmail();
    void removeContact(String email);
    void onEventMainThread(ContactListEvent event);
}
