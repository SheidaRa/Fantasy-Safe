package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;


import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {

    private static final String FRAGMENT_COUNTER = "fragment_counter";
    private static final String FRAGMENT_CONTROLS = "fragment_controls";

    private int counter = 0;
    private DatabaseHelper databaseHelper;

    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        databaseHelper = new DatabaseHelper(this);
        counter = databaseHelper.getCounter();



        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container_counter, new CounterFragment(), FRAGMENT_COUNTER)
                    .add(R.id.container_controls, new ControlsFragment(), FRAGMENT_CONTROLS)
                    .commit();
        }

        setContentView(R.layout.activity_main);

        // Create and start MediaPlayer
        mediaPlayer = MediaPlayer.create(this, R.raw.music_c);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();


    }


    public void incrementCounter() {
        counter++;
        updateCounter();
    }

    public void decrementCounter() {
        counter--;
        updateCounter();
    }

    public void addToCounter(int value) {
        counter += value;
        updateCounter();
    }

    public void saveCounter() {
        databaseHelper.saveCounter(counter);
    }

    private void updateCounter() {
        CounterFragment counterFragment = (CounterFragment) getSupportFragmentManager().findFragmentByTag(FRAGMENT_COUNTER);
        if (counterFragment != null) {
            counterFragment.updateCounter(counter);
        }
    }
}







