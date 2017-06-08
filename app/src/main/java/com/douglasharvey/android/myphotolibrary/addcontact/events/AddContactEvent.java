package com.douglasharvey.android.myphotolibrary.addcontact.events;


public class AddContactEvent {
    boolean error = false;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
