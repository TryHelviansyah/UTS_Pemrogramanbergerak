package com.example.footballdrawer.ui.news;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.footballdrawer.DetailActivity;
import com.example.footballdrawer.R;
import com.example.footballdrawer.model.Football;
import com.example.footballdrawer.model.News;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private ArrayList<News> list;
    private Context context;

    public NewsAdapter(ArrayList<News> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_news, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        News item = list.get(position);
        holder.tvJudul.setText(item.getTvJudul());
        holder.ivLogo.setImageResource(item.getImgNews());

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("logo",item.getImgNews());
            intent.putExtra("nama",item.getTvJudul());
            intent.putExtra("detail",item.getTvDeskripsi());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvJudul,tvDetail;
        private ImageView ivLogo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvJudul = itemView.findViewById(R.id.tv_news);
            ivLogo = itemView.findViewById(R.id.iv_news);
        }
    }
}
