package com.example.projectturbo;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class culture extends Fragment {

    CardView history_and_heri,festival;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_culture, container, false);



        history_and_heri = root.findViewById(R.id.his_and_hes);
        history_and_heri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the history and heritage fragment
                NavHostFragment.findNavController(culture.this).navigate(R.id.hist_and_heri_to_fragment);

            }
        });

        festival = root.findViewById(R.id.festival);
        festival.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(culture.this).navigate(R.id.hist_and_festival_and_culture);

            }
        });

        return root;
    }
}