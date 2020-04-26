package Animals;

import Foods.Food;
import Foods.VegatarianFood;

import java.util.Objects;

public abstract class Animal {

    String animalName;
    String animalType;

    Animal(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != animalType.getClass()) return false;
        String animal = (String) o;
        return Objects.equals(animalType, animal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalType);
    }
}