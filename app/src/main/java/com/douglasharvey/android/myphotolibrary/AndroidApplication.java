package com.douglasharvey.android.myphotolibrary;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

import com.douglasharvey.android.myphotolibrary.lib.GlideImageLoader;
import com.douglasharvey.android.myphotolibrary.lib.ImageLoader;


public class AndroidApplication extends Application {
    private ImageLoader imageLoader;

    @Override
    public void onCreate() {
        super.onCreate();
        setupFirebase();
        setupImageLoader();
    }

    private void setupImageLoader() {
        imageLoader = new GlideImageLoader(this);
    }

    public ImageLoader getImageLoader() {
        return imageLoader;
    }

    private void setupFirebase(){
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
