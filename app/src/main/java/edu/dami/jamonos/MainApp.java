package edu.dami.jamonos;

import android.app.Application;

import androidx.appcompat.app.AppCompatDelegate;

public class MainApp extends Application {
    public void onCreate() {
        super.onCreate();
        //forzamos a activar el modo oscuro para que la app se vea mas cool
        AppCompatDelegate.setDefaultNightMode(
                AppCompatDelegate.MODE_NIGHT_YES);
    }
}
