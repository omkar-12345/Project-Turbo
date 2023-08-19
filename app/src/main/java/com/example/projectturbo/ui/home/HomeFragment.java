package com.example.projectturbo.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.example.projectturbo.MainActivity;
import com.example.projectturbo.R;
import com.example.projectturbo.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    Button historybtn,culturebtn,lifestylebtn;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        historybtn = root.findViewById(R.id.history1);
        culturebtn = root.findViewById(R.id.culture);
        lifestylebtn = root.findViewById(R.id.lifestyle);

        historybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to history list
                NavHostFragment.findNavController(HomeFragment.this).navigate(R.id.home_historybtn_to_history_list);
            }
        });

        culturebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to culture list
                NavHostFragment.findNavController(HomeFragment.this).navigate(R.id.culture_to_culture_fragment);
            }
        });

        lifestylebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Comming Soon!!!", Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}