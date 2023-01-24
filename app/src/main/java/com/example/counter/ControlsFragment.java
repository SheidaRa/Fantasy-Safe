package com.example.counter;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class ControlsFragment extends Fragment {

    private EditText editValue;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_controls, container, false);

        Button buttonIncrement = view.findViewById(R.id.button_increment);
        buttonIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).incrementCounter();
            }
        });
        Button buttonDecrement = view.findViewById(R.id.button_decrement);
        buttonDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).decrementCounter();
            }
        });

            editValue = view.findViewById(R.id.edit_value);
        Button buttonAdd = view.findViewById(R.id.button_add);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = editValue.getText().toString();
                if (!value.isEmpty()) {
                    ((MainActivity) getActivity()).addToCounter(Integer.parseInt(value));
                }
            }
        });
        Button buttonSave = view.findViewById(R.id.button_save);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).saveCounter();
            }
        });
        return view;
    }
}


