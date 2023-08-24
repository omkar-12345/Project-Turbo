package com.example.projectturbo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class culture extends Fragment {

    private CardView historyAndHeritageCard, festivalCard, langLiteratureCard, educationHubCard,
            performingArtsCard, cuisineCard, socialEnvCard;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_culture, container, false);

        historyAndHeritageCard = root.findViewById(R.id.his_and_hes);
        festivalCard = root.findViewById(R.id.festival);
        langLiteratureCard = root.findViewById(R.id.lang_literature);
        educationHubCard = root.findViewById(R.id.education);
        performingArtsCard = root.findViewById(R.id.arts);
        cuisineCard = root.findViewById(R.id.cuisine);
        socialEnvCard = root.findViewById(R.id.social_env);

        setupClickListeners();

        return root;
    }

    private void setupClickListeners() {
        historyAndHeritageCard.setOnClickListener(createNavigationClickListener(R.id.hist_and_heri_to_fragment));
        festivalCard.setOnClickListener(createNavigationClickListener(R.id.hist_and_festival_and_culture));
        langLiteratureCard.setOnClickListener(createNavigationClickListener(R.id.action_culture_to_lang_literature));
        educationHubCard.setOnClickListener(createNavigationClickListener(R.id.action_culture2_to_education_hub));
        performingArtsCard.setOnClickListener(createNavigationClickListener(R.id.action_culture2_to_performing_arts));
        cuisineCard.setOnClickListener(createNavigationClickListener(R.id.action_culture2_to_cuisine));
        socialEnvCard.setOnClickListener(createNavigationClickListener(R.id.action_culture2_to_social_env));
    }

    private View.OnClickListener createNavigationClickListener(final int destinationId) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(culture.this).navigate(destinationId);
            }
        };
    }
}
