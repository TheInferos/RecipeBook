package main.Services;

import main.Modules.Ingredient;
import main.Modules.Recipe;
import main.Modules.DTO.Recipe_DTO;
import main.Repositories.IngredientRepository;
import main.Repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class RecipeService {
    private final IngredientRepository ingredientRepository;
    private final RecipeRepository recipeRepository;
    @Autowired
    public RecipeService (IngredientRepository ingredientRepository, RecipeRepository recipeRepository) {
        this.ingredientRepository = ingredientRepository;
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> getAllRecipes() {
        return recipeRepository.getAllRecipes();
    }

    public Recipe getRecipeById(Long id) {
        return recipeRepository.getRecipeById(id).get(0);
    }

    public Recipe createRecipe(Recipe_DTO recipe) {

//        TODO Look at adding a chcek for existing here
        HashMap<Ingredient, String> ingredients = new HashMap<>();
        for (String ingredientName : recipe.ingredients.keySet()){
            List<Ingredient> ingredientsList = ingredientRepository.getIngredientByName(ingredientName);
            Ingredient ingredient = null;
            if (ingredientsList != null && !ingredientsList.isEmpty()) {
                ingredient = ingredientsList.get(0);
                if (ingredient != null) {
                    ingredients.put(ingredient, recipe.ingredients.get(ingredientName));
                }
            }
            else {
                    ingredient = new Ingredient(ingredientName);
                    ingredientRepository.save(ingredient);
                    ingredients.put(ingredient, recipe.ingredients.get(ingredientName));
                }
        }
        Recipe newRecipe = new Recipe(recipe.name, recipe.method, ingredients);
        recipeRepository.save(newRecipe);
        return newRecipe;
    }

    public Recipe updateRecipe(Long id, Recipe recipe)
    {
        return recipe;
    }
}
