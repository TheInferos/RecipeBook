
package main.Repositories;

import main.Modules.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    @Query(value = "SELECT * FROM recipe", nativeQuery = true)
    List<Recipe> getAllRecipes();

    @Query(value = "SELECT * FROM recipe WHERE name = :value", nativeQuery = true)
    List<Recipe> getRecipeByName(@Param("value") String value);

    @Query(value = "SELECT * FROM recipe WHERE id = :id", nativeQuery = true)
    List<Recipe> getRecipeById(@Param("id") Long id);

    @Modifying
    @Transactional
    @Query(value = "UPDATE recipe SET name =:name WHERE id = :id", nativeQuery = true)
    void updateRecipeRow(@Param("id") Long id, @Param("name") String name);
}