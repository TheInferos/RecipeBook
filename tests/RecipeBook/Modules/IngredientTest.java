package RecipeBook.Modules;
import main.Modules.Ingredient;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class IngredientTest {
    @Test
    public void testIngredientCreation() {
        // Arrange
        String expectedName = "Sugar";

        // Act
        Ingredient ingredient = new Ingredient(expectedName);

        // Assert
        assertEquals(expectedName, ingredient.getName());
    }

    @Test
    void setName() {
        // Arrange
        Ingredient ingredient = new Ingredient("Salt");
        String expectedName = "Sugar";
        // Act
        ingredient.setName(expectedName);

        // Assert
        assertEquals(expectedName, ingredient.getName());
    }
}