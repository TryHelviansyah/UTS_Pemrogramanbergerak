package com.example.footballdrawer.ui.gallery;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.footballdrawer.DetailActivity;
import com.example.footballdrawer.R;
import com.example.footballdrawer.model.Football;
import com.example.footballdrawer.model.Player;

import java.util.ArrayList;

public class GaleryAdapter extends ArrayAdapter<Player> {

    public GaleryAdapter(@NonNull Context context, ArrayList<Player> courseModelArrayList) {
        super(context, 0, courseModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.item_galeri, parent, false);
        }

        Player courseModel = getItem(position);
        TextView courseTV = listitemView.findViewById(R.id.tv_name);
        ImageView courseIV = listitemView.findViewById(R.id.iv_player);

        courseTV.setText(courseModel.getNamePlayer());
        courseIV.setImageResource(courseModel.getImgPlayer());
        return listitemView;
    }
}