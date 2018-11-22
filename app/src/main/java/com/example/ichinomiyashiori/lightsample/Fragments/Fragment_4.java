package com.example.ichinomiyashiori.lightsample.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.ichinomiyashiori.lightsample.R;

public class Fragment_4 extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_item_4,container,false);
        final TextView textView = v.findViewById(R.id.textView);
        textView.setText("4");
        Button btn = new Button(container.getContext());
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("這是第4個view");
            }
        });
        ConstraintLayout c_layout = v.findViewById(R.id.c_layout_4);
        c_layout.addView(btn);
        return v;
    }
}
