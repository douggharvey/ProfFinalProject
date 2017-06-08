package com.douglasharvey.android.myphotolibrary.contactlist.ui;

import com.douglasharvey.android.myphotolibrary.contactlist.entities.User;


public interface ContactListView {
    void onContactAdded(User user);
    void onContactChanged(User user);
    void onContactRemoved(User user);
}
