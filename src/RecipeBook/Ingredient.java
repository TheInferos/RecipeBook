package RecipeBook;

public class Ingredient {
    private String name;

    // Constructors
    public Ingredient(String name) {
        this.name = name;
    }

    // Getter methods
    public String getName() {
        return name;
    }


    // Setter methods (if needed)
    public void setName(String name) {
        this.name = name;
    }

    // toString method for easy debugging
    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name +
                '}';
    }
}