package bdx.iut.info.persistence.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by rgiot on 06/02/17.
 */
@Entity
public class IngredientQuantity  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @ManyToOne
    private Ingredient ingredient;

    @NotNull
    private String unit;


    @NotNull
    private double quantity;

    // Automatically generated code


    public long getId() {
        return id;
    }

    public void setId(long id)
     {
        this.id = id;
    }


    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public IngredientQuantity(Ingredient ingredient, String unit, double quantity) {
        this.ingredient = ingredient;
        this.unit = unit;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return ingredient.getName() + ": " + quantity +  " " + unit;

    }
}
