package RecipeBook;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String expectedName = "Sugar Cube";
        String[] expectedMethod = {"Form Cube Sugar"};
        Ingredient expectedIngredient = new Ingredient("Sugar");
        HashMap<Ingredient, String> ingredients = new HashMap<>();
        ingredients.put(expectedIngredient, "1tsp");
        Recipe recipe = new Recipe(expectedName, expectedMethod, ingredients);

        System.out.println(recipe.toString());
    }
}