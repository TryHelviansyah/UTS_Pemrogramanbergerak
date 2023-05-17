package com.example.footballdrawer.ui.home;

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

import java.util.ArrayList;

public class FootballAdapter extends RecyclerView.Adapter<FootballAdapter.ViewHolder> {

    private ArrayList<Football> list;
    private Context context;

    public FootballAdapter(ArrayList<Football> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_data, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Football item = list.get(position);
        holder.tvNama.setText(item.getNameTeam());
        holder.tvJuara.setText(String.valueOf(item.getChampionTeam()));
        holder.ivLogo.setImageResource(item.getImageTeam());

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("logo",item.getImageTeam());
            intent.putExtra("nama",item.getNameTeam());
            intent.putExtra("detail",item.getDetailTeam());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNama,tvDetail,tvJuara;
        private ImageView ivLogo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvJuara = itemView.findViewById(R.id.tv_juara);
            ivLogo = itemView.findViewById(R.id.iv_club);
        }
    }
}
