package com.example.footballdrawer.ui.news;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.footballdrawer.R;
import com.example.footballdrawer.databinding.FragmentHomeBinding;
import com.example.footballdrawer.databinding.FragmentNewsBinding;
import com.example.footballdrawer.model.Football;
import com.example.footballdrawer.model.News;
import com.example.footballdrawer.ui.home.FootballAdapter;

import java.util.ArrayList;

public class NewsFragment extends Fragment {

    private FragmentNewsBinding binding;

    private NewsAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNewsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new NewsAdapter(getData(),getContext());
        binding.rvNews.setAdapter(adapter);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }

    @NonNull
    private ArrayList<News> getData() {
        ArrayList<News> data = new ArrayList<>();
        data.add(
                new News("Gol Marco Asensio Bantu Real Madrid Bungkam Getafe",
                        "Real Madrid meraih tiga poin saat menjamu Getafe di Santiago Bernabeu pada jornada 34 La Liga 2022/2023, Minggu (14/5/2023) dini hari WIB. Los Blancos memenangi laga ini dengan skor 1-0.\n" +
                                "\n" +
                                "Gol semata wayang yang diciptakan Marco Asensio di pertengahan babak kedua sudah cukup untuk membawa Real Madrid meraup poin penuh dari laga ini."
                        ,R.drawable.realmadrid)
        );
        data.add(
                new News("Senin 15 Mei 2023, Barcelona Juara La Liga Musim Ini?",
                        "Barcelona punya peluang untuk meraih gelar juara La Liga 2022/2023 pada hari Senin (15/5/2023) dini hari WIB. Syarat yang harus dilakukan untuk bisa menang adalah mengalahkan sang rival sekota, Espanyol.\n" +
                                "\n" +
                                "Barcelona akan berhadapan dengan Espanyol pada pekan ke-34 La Liga 2022/2023 di RCDE Stadium. Laga antara Espanyol vs Barcelona akan dimainkan pada Senin 15 Mei 2023, mulai ham 02.00 WIB.",
                        R.drawable.barcelona)
        );
        data.add(
                new News("Pochettinho selangkah lagi melatih chelsea",
                        "Mauricio Pochettino dikabarkan tinggal selangkah lagi jadi pelatih Chelsea. Ia bakal menangani The Blues untuk musim depan.\n" +
                                "Dikutip dari detikSport, Pochettino jadi salah satu kandidat manajer Chelsea musim depan setelah memecat Graham Potter beberapa waktu lalu. Chelsea juga sempat mendekati Julian Nagelsmann dan Luis Enrique.",
                        R.drawable.chelsea)
        );
        return data;
    }
}