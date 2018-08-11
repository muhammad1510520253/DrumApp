package com.blogspot.ketikanmd.appdrum;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SoundPool sp;
    private int Sound1;
    private int Sound2;
    private int Sound3;
    private int Sound4;
    private int Sound5;
    private int Sound6;
    private int Sound7;
    private int Sound8;
    private int Sound9;
    private int Sound00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = new SoundPool(4, AudioManager.STREAM_MUSIC, 0);
        Sound1 = sp.load(getApplicationContext(), R.raw.sound1, 1);
        Sound2 = sp.load(getApplicationContext(), R.raw.sound2, 1);
        Sound3 = sp.load(getApplicationContext(), R.raw.sound3, 1);
        Sound4 = sp.load(getApplicationContext(), R.raw.sound4, 1);
        Sound5 = sp.load(getApplicationContext(), R.raw.sound5, 1);
        Sound6 = sp.load(getApplicationContext(), R.raw.sound6, 1);
        Sound7 = sp.load(getApplicationContext(), R.raw.sound7, 1);
        Sound8 = sp.load(getApplicationContext(), R.raw.sound81, 1);
        Sound9 = sp.load(getApplicationContext(), R.raw.sound9, 1);
        Sound00 = sp.load(getApplicationContext(), R.raw.sound00, 1);


    }

    public void playsound1(View v) {
        sp.play(Sound1, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void playsound2(View v) {
        sp.play(Sound2, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void playsound3(View v) {
        sp.play(Sound3, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void playsound4(View v) {
        sp.play(Sound4, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void playsound5(View v) {
        sp.play(Sound5, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void playsound6(View v) {
        sp.play(Sound6, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void playsound7(View v) {
        sp.play(Sound7, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void playsound8(View v) {
        sp.play(Sound8, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void playsound9(View v) {
        sp.play(Sound9, 1.0f, 1.0f, 0, 0, 1.0f);
    }
}
