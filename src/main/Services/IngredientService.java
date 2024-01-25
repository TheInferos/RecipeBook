package main.Services;

import main.Modules.Ingredient;
import main.Repositories.IngredientRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class IngredientService {

    private final List<Ingredient> ingredients = new ArrayList<>();
    private final IngredientRepository ingredientRepository;
    @Autowired
    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public List<Ingredient> getAllIngredients() {
        return ingredients;
    }

    public Ingredient getIngredientById(String id) {
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getId().equals(id)) {
                return ingredient;
            }
        }
        return null; // Return null if not found (maybe throw an exception instead)
    }

    public Ingredient createIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
        ingredientRepository.save(ingredient);
        return ingredient;
    }

    public Ingredient updateIngredient(Long id, Ingredient updatedIngredient) {
        for (int i = 0; i < ingredients.size(); i++) {
            Ingredient existingIngredient = ingredients.get(i);
            if (existingIngredient.getId().equals(id)) {
                updatedIngredient.setId(existingIngredient.getId());
                ingredients.set(i, updatedIngredient);
                return updatedIngredient;
            }
        }
        return null; // Return null if not found (maybe throw an exception instead)
    }

    public void deleteIngredient(Long id) {
        ingredients.removeIf(ingredient -> ingredient.getId().equals(id));
    }
}