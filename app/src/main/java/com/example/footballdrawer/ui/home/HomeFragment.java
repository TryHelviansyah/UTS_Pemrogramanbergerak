package com.example.footballdrawer.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.footballdrawer.R;
import com.example.footballdrawer.databinding.FragmentHomeBinding;
import com.example.footballdrawer.model.Football;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private FootballAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new FootballAdapter(getData(),getContext());
        binding.rvFootball.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


    @NonNull
    private ArrayList<Football> getData() {
        ArrayList<Football> data = new ArrayList<>();
        data.add(
                new Football("Chelsea",
                        "Chelsea merupakan team liga inggris dengan 2 kali champions",
                        R.drawable.chelsea,2)
        );
        data.add(
                new Football("Real Madrid",
                        "Real Madrid merupakan team liga spanyol dengan 13 kali champions",
                        R.drawable.realmadrid,13)
        );
        data.add(
                new Football("Barcelona",
                        "Barcelona merupakan team liga spanyol dengan 5 kali champions",
                        R.drawable.barcelona,6)
        );
        data.add(
                new Football("Manchester United",
                        "Manchester United merupakan team liga spanyol dengan 3 kali champions",
                        R.drawable.manchesterunited,3)
        );
        data.add(
                new Football("Ac Milan ",
                        "Ac Milan merupakan team liga spanyol dengan 6 kali champions",
                        R.drawable.acmilan,3)
        );
        return data;
    }
}