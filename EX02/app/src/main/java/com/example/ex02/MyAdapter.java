package com.example.ex02;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<Country> countries;

    public MyAdapter(List<Country> countries) {
        this.countries = countries;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.country_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Country country = countries.get(position);
        holder.flatImage.setImageResource(country.getFlag());
        holder.country_name.setText(country.getCountryName());
        holder.country_capital.setText(country.getCountryCapital());
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView flatImage;
        private TextView country_name;
        private TextView country_capital;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            flatImage = itemView.findViewById(R.id.flag_image);
            country_name = itemView.findViewById(R.id.country_name);
            country_capital = itemView.findViewById(R.id.country_capital);
        }
    }
}
