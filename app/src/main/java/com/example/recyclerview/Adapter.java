package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ItemsViewHolder> {
    private Context mcontext;
    List<Items_Model> itemsModels;

    public Adapter(List<Items_Model> itemsModels, Context mcontext) {
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public ItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mview = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_design, parent, false);

        return ItemsViewHolder(mview);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return itemsModels.size();
    }

    class ItemsViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView mTitle, mDescription, mPrice;
        CardView cardView;

        public ItemsViewHolder(View itemView) {

            super(itemView);
            imageView=itemView.findViewById(R.id.itemimage);
            mTitle=itemView.findViewById(R.id.txtTitle);
            mDescription=itemView.findViewById(R.id.txtDescription);
            mPrice=itemView.findViewById(R.id.txtPrice);
            cardView=itemView.findViewById(R.id.card);

        }
    }
}

