package com.example.projectturbo;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projectturbo.ui.home.HomeFragment;


public class history_list extends Fragment {

    CardView peths,forts,museum,hills,historical_places;


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_history_list, container, false);
        peths = root.findViewById(R.id.pethsCardView);

        peths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the peths fragment
                NavHostFragment.findNavController(history_list.this).navigate(R.id.peths_cardView_to_peths_fragment);

            }
        });

        forts = root.findViewById(R.id.fortsCardView);
        forts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the Forts fragment
                NavHostFragment.findNavController(history_list.this).navigate(R.id.forts_cardView_to_forts_fragment);

            }
        });

        museum = root.findViewById(R.id.museumCardView);
        museum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the Museum fragment
                NavHostFragment.findNavController(history_list.this).navigate(R.id.museumCardView_to_museum_fragment);

            }
        });

        hills = root.findViewById(R.id.hillsCardView);
        hills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the Hills fragment
                NavHostFragment.findNavController(history_list.this).navigate(R.id.hills_to_hills_fragment);

            }
        });

        historical_places = root.findViewById(R.id.historical_places_cradView);
        historical_places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the Historical Places fragment
                NavHostFragment.findNavController(history_list.this).navigate(R.id.historical_places_to_historical_fragment);
            }
        });


        return root;
    }
}