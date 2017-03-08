package bdx.iut.info.persistence.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by rgiot on 06/02/17.
 * TODO Add the Entities annotations
 */
@Entity
@Table(name="ingredient")
public class Ingredient implements Serializable{
    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private java.lang.String name;

    private UnitType unitType;

    public Ingredient() {
        name = "";
        unitType = UnitType.weight;
    }

    public Ingredient(String name) {
        this.name = name;
        unitType = UnitType.weight;
    }

    public Ingredient(String name, UnitType unitType) {
        this.name = name;
        this.unitType = unitType;
    }
    // Automatically generated code


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public void setUnitType(UnitType unitType) {
        this.unitType = unitType;
    }


}
