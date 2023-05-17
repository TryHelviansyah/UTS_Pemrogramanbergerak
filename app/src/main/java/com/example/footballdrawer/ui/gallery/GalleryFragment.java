package com.example.footballdrawer.ui.gallery;

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
import com.example.footballdrawer.databinding.FragmentGalleryBinding;
import com.example.footballdrawer.model.Football;
import com.example.footballdrawer.model.Player;
import com.example.footballdrawer.ui.home.FootballAdapter;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    private GaleryAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new GaleryAdapter(getContext(), getData());
        binding.gvGaleri.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @NonNull
    private ArrayList<Player> getData() {
        ArrayList<Player> data = new ArrayList<>();
        data.add(new Player("C. Ronaldo",R.drawable.ronaldo));
        data.add(new Player("Messi",R.drawable.messi));
        data.add(new Player("Vinicius",R.drawable.vinicius));
        data.add(new Player("Mbappe",R.drawable.mbapper));
        return data;
    }
}