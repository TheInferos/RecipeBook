package RecipeBook;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    public void testRecipeCreation() {
        // Arrange
        String expectedName = "Sugar Cube";
        String[] expectedMethod = {"Form Cube Sugar"};
        Ingredient expectedIngredient = new Ingredient("Sugar");
        HashMap<Ingredient, String> expectedIngredients = new HashMap<>();
        expectedIngredients.put(expectedIngredient, "1tsp");

        // Act
        Recipe recipe = new Recipe(expectedName, expectedMethod, expectedIngredients);

        // Assert
        assertEquals(expectedName, recipe.getName());
        assertEquals(expectedMethod, recipe.getMethod());
        assertEquals(expectedIngredients, recipe.getIngredients());
    }

    @Test
    void setName() {
        // Arrange
        String initialName = "Salt";
        String expectedName = "Salt";
        String[] expectedMethod = {"Form Sugar Cube"};
        Ingredient expectedIngredient = new Ingredient("Sugar");
        HashMap<Ingredient, String> expectedIngredients = new HashMap<>();
        expectedIngredients.put(expectedIngredient, "1tsp");
        Recipe recipe = new Recipe(initialName, expectedMethod, expectedIngredients);

        // Act
        recipe.setName(expectedName);

        // Assert
        assertEquals(expectedName, recipe.getName());
    }

    @Test
    void setMethod() {
        // Arrange
        String expectedName = "Sugar";
        String[] expectedMethod = {"Form Sugar Cube"};
        String[] initialMethod = {"Form Salt Cube"};
        Ingredient expectedIngredient = new Ingredient("Sugar");
        HashMap<Ingredient, String> expectedIngredients = new HashMap<>();
        expectedIngredients.put(expectedIngredient, "1tsp");
        Recipe recipe = new Recipe(expectedName, initialMethod, expectedIngredients);

        // Act
        recipe.setMethod(expectedMethod);

        // Assert
        assertEquals(expectedMethod, recipe.getMethod());
    }

    @Test
    void setIngredients() {
        // Arrange
        String expectedName = "Sugar";
        String[] expectedMethod = {"Form Sugar Cube"};
        Ingredient initialIngredient = new Ingredient("Salt");
        Ingredient expectedIngredient = new Ingredient("Sugar");
        HashMap<Ingredient, String> initialIngredients = new HashMap<>();
        HashMap<Ingredient, String> expectedIngredients = new HashMap<>();
        initialIngredients.put(initialIngredient, "1tsp");
        expectedIngredients.put(expectedIngredient, "1tsp");
        Recipe recipe = new Recipe(expectedName, expectedMethod, initialIngredients);

        // Act
        recipe.setIngredients(expectedIngredients);

        // Assert
        assertEquals(expectedIngredients, recipe.getIngredients());
    }
}