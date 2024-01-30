package main.Modules.DTO;

import java.util.HashMap;

public class Recipe_DTO {
    public String name;
    public String[] method;
    public HashMap<String, String> ingredients;

    public Recipe_DTO(String name, String[] method, HashMap<String, String> ingredients)
    {
        this.name = name;
        this.method = method;
        this.ingredients = ingredients;

    }
}
