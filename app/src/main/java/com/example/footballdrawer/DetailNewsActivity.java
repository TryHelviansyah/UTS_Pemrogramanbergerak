package com.example.footballdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.footballdrawer.databinding.ActivityDetailNewsBinding;

public class DetailNewsActivity extends AppCompatActivity {

    private ActivityDetailNewsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailNewsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tvName.setText(getIntent().getStringExtra("nama"));
        binding.tvDetail.setText(getIntent().getStringExtra("detail"));
        binding.ivLogo.setImageResource(getIntent().getIntExtra("logo",R.drawable.chelsea));
    }
}