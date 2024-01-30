package main.Modules;

import main.Modules.DTO.Recipe_DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.HashMap;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String[] method;
    private HashMap<Ingredient, String> ingredients;

    public Recipe(String name, String[] method, HashMap<Ingredient, String> ingredients)
    {
        this.name = name;
        this.method = method;
        this.ingredients = ingredients;

    }

    public Recipe(Recipe_DTO recipe){
        this.name = recipe.name;
    }

    // Defualt Constructor for Get
    public Recipe(){}

    public String getName(){
            return name;
    }
    public Long getId() {
        return id;
    }
    public String[] getMethod(){
        return method;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setMethod(String[] method){
        this.method = method;
    }
    public HashMap<Ingredient, String> getIngredients(){
            return ingredients;
    }
    public void setIngredients(HashMap<Ingredient, String> ingredients){
            this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient, String quantity)
    {
        String existing = ingredients.get(ingredient);
        ingredients.put(ingredient, existing == null ? quantity : existing + quantity);
    }
}
