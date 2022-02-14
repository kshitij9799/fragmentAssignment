package com.example.fragmentassignment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFragment extends Fragment {

    private TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_time, container, false);
        text = view.findViewById(R.id.text);
        Date date = new Date();
        SimpleDateFormat ft =
                new SimpleDateFormat("hh:mm:ss");
        text.setText(ft.format(date));
        return view;
    }
}