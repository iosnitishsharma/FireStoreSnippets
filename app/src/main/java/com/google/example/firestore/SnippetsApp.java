package com.google.example.firestore;

import android.support.multidex.MultiDexApplication;

import com.google.firebase.FirebaseApp;

public class SnippetsApp extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(getApplicationContext());

    }
}
