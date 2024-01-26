package main.Services;

import main.Modules.Ingredient;
import main.Modules.Recipe;
import main.Repositories.IngredientRepository;
import main.Repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeService {
    private final List<Recipe> recipes = new ArrayList<>();
    private final IngredientRepository ingredientRepository;
    private final RecipeRepository recipeRepository;
    @Autowired
    public RecipeService (IngredientRepository ingredientRepository, RecipeRepository recipeRepository) {
        this.ingredientRepository = ingredientRepository;
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> getAllRecipes() {
        return recipes;
    }

    public Recipe getRecipeById(String id) {
        for (Recipe recipe : recipes) {
            if (recipe.getId().equals(id)) {
                return recipe;
            }
        }
        return null; // Return null if not found (maybe throw an exception instead)
    }

    public Recipe createRecipe(Recipe recipe) {
        recipes.add(recipe);
        recipeRepository.save(recipe);
        return recipe;
    }
    public Recipe updateRecipe(Long id, Recipe recipe)
    {
        return recipe;
    }
}
