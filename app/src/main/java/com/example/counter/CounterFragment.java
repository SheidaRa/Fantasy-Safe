package com.example.counter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class CounterFragment extends Fragment {

    private TextView textCounter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_counter, container, false);
        textCounter = view.findViewById(R.id.text_counter);
        return view;
    }

    public void updateCounter(int value) {
        textCounter.setText(String.valueOf(value));
    }

}

