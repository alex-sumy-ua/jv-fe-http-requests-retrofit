package com.northcoders.jv_fe_http_requests_retrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.northcoders.jv_fe_http_requests_retrofit.model.Fruit;
import java.util.List;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.FruitViewHolder> {

    private List<Fruit> fruits;
    private Context context;

    public FruitAdapter(List<Fruit> fruits, Context context) {
        this.fruits = fruits;
        this.context = context;
    }

    @NonNull
    @Override
    public FruitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the layout directly
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_layout, parent, false);
        return new FruitViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FruitViewHolder holder, int position) {
        // Get the fruit object and set the data to views
        Fruit fruit = fruits.get(position);
        holder.nameTextView.setText(fruit.getName());
        holder.descriptionTextView.setText(fruit.getFamily());
        holder.priceTextView.setText(fruit.getOrder());
        // Optionally, set image resource here if you have one
    }

    @Override
    public int getItemCount() {
        return fruits.size();
    }

    public static class FruitViewHolder extends RecyclerView.ViewHolder {
        private final TextView nameTextView;
        private final TextView descriptionTextView;
        private final TextView priceTextView;

        public FruitViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.name_textView);
            descriptionTextView = itemView.findViewById(R.id.description_textView);
            priceTextView = itemView.findViewById(R.id.price_textView);
        }
    }
}