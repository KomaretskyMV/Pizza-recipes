package com.example.android.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<PizzaRecipeItem> pizzaRecipeItems = new ArrayList<>();
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.marghuerita, Utils.MARGHUERITA_HEADER, Utils.MARGHUERITA_DESCRIPTION, Utils.MARGHUERITA_RECIPE ));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.superhealthy, Utils.SUPERHEALTHY_HEADER, Utils.SUPERHEALTHY_DESCRIPTION, Utils.SUPERHEALTHY_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.frying_pan, Utils.FRYING_PAN_HEADER, Utils.FRYING_PAN_DESCRIPTION, Utils.FRYING_PAN_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.sourdough, Utils.SOURDOUGH_HEADER, Utils.SOURDOUGH_DESCRIPTION, Utils.SOURDOUGH_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.chicken_tikka_masala, Utils.CHICKEN_TIKKA_MASALA_HEADER, Utils.CHICKEN_TIKKA_MASALA__DESCRIPTION, Utils.CHICKEN_TIKKA_MASALA__RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.rainbow, Utils.RAINBOW_HEADER, Utils.RAINBOW_DESCRIPTION, Utils.RAINBOW_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pitta, Utils.PITTA_HEADER, Utils.PITTA_DESCRIPTION, Utils.PITTA_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.gluten_free, Utils.GLUTEN_FREE_HEADER, Utils.GLUTEN_FREE_DESCRIPTION, Utils.GLUTEN_FREE_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.cauliflower_crust, Utils.CAULIFLOWER_CRUST_HEADER, Utils.CAULIFLOWER_CRUST_DESCRIPTION, Utils.CAULIFLOWER_CRUST_RECIPE));

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        adapter = new PizzaRecipeAdapter(pizzaRecipeItems, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}