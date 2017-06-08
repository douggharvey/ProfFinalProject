package com.douglasharvey.android.myphotolibrary.contactlist;


public interface ContactListSessionInteractor {
    void signOff();
    String getCurrentUserEmail();
    void changeConnectionStatus(boolean online);
}
