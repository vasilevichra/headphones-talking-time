package com.github.vasilevichra;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Bundle;

public class Main extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

//        AudioManager.isWiredHeadsetOn();
    }

}
