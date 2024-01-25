package main.Modules;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Ingredient {
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Constructors
    public Ingredient(String name) {
        this.name = name;
    }

    // Default constructor
    public Ingredient() {
    }

    // Getter methods
    public String getName() {
        return name;
    }
    public Long getId() {
        return id;
    }

    // Setter methods (if needed)
    public void setName(String name) {
        this.name = name;
    }
    public void setId(Long id) {
        this.id = id;
    }

    // toString method for easy debugging
    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name +
                '}';
    }
}