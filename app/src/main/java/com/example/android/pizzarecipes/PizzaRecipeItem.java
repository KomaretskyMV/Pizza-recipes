package com.example.android.pizzarecipes;

public class PizzaRecipeItem {
    private int ImageResource;
    private String heading;
    private String description;
    private String recipe;

    public PizzaRecipeItem(int imageResource, String heading, String description, String recipe) {
        this.ImageResource = imageResource;
        this.heading = heading;
        this.description = description;
        this.recipe = recipe;
    }

    public int getImageResource() {
        return ImageResource;
    }

    public String getHeading() {
        return heading;
    }

    public String getDescription() {
        return description;
    }

    public String getRecipe() {
        return recipe;
    }
}
