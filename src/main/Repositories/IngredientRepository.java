
package main.Repositories;

import main.Modules.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface  IngredientRepository extends JpaRepository<Ingredient, Long> {

    @Query(value = "SELECT * FROM ingredient", nativeQuery = true)
    List<Ingredient> getAllIngredients();

    @Query(value = "SELECT * FROM ingredient WHERE name = :value", nativeQuery = true)
    List<Ingredient> findIngredientByName(@Param("value") String value);

    @Query(value = "SELECT * FROM ingredient WHERE id = :id", nativeQuery = true)
    List<Ingredient> getIngredientByID(@Param("id") Long id);

    @Modifying
    @Transactional
    @Query(value = "UPDATE ingredient SET name =:name WHERE id = :id", nativeQuery = true)
    void updateIngredientRow(@Param("id") Long id, @Param("name") String name);
}