package main.Services;

import main.Modules.Recipe;
import main.Repositories.IngredientRepository;
import main.Repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Recipe createRecipe(Recipe recipe) {
        recipeRepository.save(recipe);
        return recipe;
    }
    public Recipe updateRecipe(Long id, Recipe recipe)
    {
        return recipe;
    }
}
