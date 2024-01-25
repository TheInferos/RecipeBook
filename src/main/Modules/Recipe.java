package main.Modules;

import java.util.HashMap;

public class Recipe {
    private String name;
    private String[] method;
    private HashMap<Ingredient, String> ingredients;

    public Recipe(String name, String[] method, HashMap<Ingredient, String> ingredients)
    {
        this.name = name;
        this.method = method;
        this.ingredients = ingredients;
    }
    public String getName(){
            return name;
    }
    public void setName(String name){
            this.name = name;
    }

    public String[] getMethod(){
        return method;
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
}
