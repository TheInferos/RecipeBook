
package main.Repositories;

import main.Modules.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  IngredientRepository extends JpaRepository<Ingredient, Long> {
}