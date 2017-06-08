package com.douglasharvey.android.myphotolibrary.contactlist.ui;

import com.douglasharvey.android.myphotolibrary.contactlist.entities.User;


public interface OnItemClickListener {
    void onItemClick(User user);
    void onItemLongClick(User user);
}
