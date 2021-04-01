package com.example.android.pizzarecipes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PizzaRecipeAdapter extends RecyclerView.Adapter<PizzaRecipeAdapter.PizzaRecipeViewHolder> {

    private ArrayList<PizzaRecipeItem> pizzaRecipeItems;
    Context context;

    public PizzaRecipeAdapter(ArrayList<PizzaRecipeItem> pizzaRecipeItems, Context context) {
        this.pizzaRecipeItems = pizzaRecipeItems;
        this.context = context;
    }

    class PizzaRecipeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView pizzaImage;
        public TextView header;
        public TextView description;

        public PizzaRecipeViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            pizzaImage = itemView.findViewById(R.id.pizzaImage);
            header = itemView.findViewById(R.id.heading);
            description = itemView.findViewById(R.id.description);
        }

        @Override
        public void onClick(View v) {

            int position = getAdapterPosition();
            PizzaRecipeItem pizzaRecipeItem = pizzaRecipeItems.get(position);

            Intent intent = new Intent(context, RecipeActivity.class);
            intent.putExtra("imageResource", pizzaRecipeItem.getImageResource());
            intent.putExtra("heading", pizzaRecipeItem.getHeading());
            intent.putExtra("description", pizzaRecipeItem.getDescription());
            intent.putExtra("recipe", pizzaRecipeItem.getRecipe());
            context.startActivity(intent);
        }
    }

    @NonNull
    @Override
    public PizzaRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view_item,
                parent, false);
        PizzaRecipeViewHolder pizzaRecipeViewHolder = new PizzaRecipeViewHolder(view);
        return pizzaRecipeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PizzaRecipeViewHolder holder, int position) {
        PizzaRecipeItem pizzaRecipeItem = pizzaRecipeItems.get(position);

        holder.pizzaImage.setImageResource(pizzaRecipeItem.getImageResource());
        holder.header.setText(pizzaRecipeItem.getHeading());
        holder.description.setText(pizzaRecipeItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return pizzaRecipeItems.size();
    }

}
