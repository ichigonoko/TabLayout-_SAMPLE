package com.example.ichinomiyashiori.lightsample.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ichinomiyashiori.lightsample.R;

public class Fragment_3 extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_item,container,false);
        TextView textView = v.findViewById(R.id.textView);
        textView.setText("3");
        return v;
    }
}
