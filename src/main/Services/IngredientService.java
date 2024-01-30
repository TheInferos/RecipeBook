package main.Services;

import main.Modules.Ingredient;
import main.Repositories.IngredientRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class IngredientService {

    private final IngredientRepository ingredientRepository;

    @Autowired
    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.getAllIngredients();
    }

    public Ingredient getIngredientById(Long id) {
        return ingredientRepository.getIngredientByID(id).get(0);
    }

    public Ingredient createIngredient(Ingredient ingredient) {
        ingredientRepository.save(ingredient);
        return ingredient;
    }

    public Ingredient updateIngredient(Ingredient updatedIngredient) {
        ingredientRepository.updateIngredientRow(updatedIngredient.getId(), updatedIngredient.getName());
        return updatedIngredient;
    }

    public void deleteIngredient(Long id) {
    }
}