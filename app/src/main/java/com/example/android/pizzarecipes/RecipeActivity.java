package com.example.android.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        TextView heading = findViewById(R.id.titleTextView);
        TextView recipe = findViewById(R.id.recipeTextView);

        Intent intent = getIntent();
        if (intent != null) {
            heading.setText(intent.getStringExtra("heading"));
            recipe.setText(intent.getStringExtra("recipe"));
        }
    }
}