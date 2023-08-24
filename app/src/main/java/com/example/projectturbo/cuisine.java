package com.example.projectturbo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projectturbo.databinding.FragmentCuisineBinding;
import com.example.projectturbo.databinding.FragmentEducationHubBinding;

public class cuisine extends Fragment {
    private FragmentCuisineBinding binding;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentCuisineBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Set up the ViewPager and SectionsPagerAdapter
        SectionsPagerAdapterCuisine sectionsPagerAdapter = new SectionsPagerAdapterCuisine(requireContext(), getChildFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);

        // Set up the TabLayout (optional)
        binding.tabs.setupWithViewPager(viewPager);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}