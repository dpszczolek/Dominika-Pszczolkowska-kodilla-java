package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Ingredients {
    public static final String LETTUCE = "LETTUCE";
    public static final String ONION = "ONION";
    public static final String BACON = "BACON";
    public static final String CUCUMBER = "CUCUMBER";
    public static final String CHILI_PEPPER = "CHILI PEPPER";
    public static final String MUSHROOMS = "MUSHROOMS";
    public static final String SHRIMPS = "SHRIMPS";
    public static final String CHEESE = "CHEESE";
    private String ingredient;
    private List<String> ingredients = new ArrayList<>();

    public void setIngredient (List<String> ingredients) {

        if (ingredient.equals(LETTUCE) || ingredient.equals(ONION) || ingredient.equals(BACON) || ingredient.equals(CUCUMBER) || ingredient.equals(CHILI_PEPPER) || ingredient.equals(MUSHROOMS) || ingredient.equals(SHRIMPS) || ingredient.equals(CHEESE)) {
            ingredients.add(ingredient);
        } else {
            throw new IllegalStateException("You have to choose at least one ingredient from the list: lettuce, onion, bacon, cucumber, chili pepper, mushrooms, shrimps or cheese.");
        }
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
