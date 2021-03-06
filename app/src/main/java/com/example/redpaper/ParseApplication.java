package com.example.redpaper;

import com.parse.Parse;
import com.parse.ParseObject;

import android.app.Application;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ZbSS0n2YJJLUDNDGKoJYd71529Yd9Sy6mOuGaivn")
                .clientKey("OzHvumHWIWQBSYHQpx00F8yPYCIRufJ7sXrZ643m")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}