package Animals;

import Foods.Food;

import java.util.Objects;

public abstract class Animal {

    String animalName;
    String animalType;

    Animal() {

    }

    public String getName() {
        return this.animalName;
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

    public void eating(Food food) {
        if (food.equals("Meat") && this.animalType.equals("Cornivorous") || food.equals("Grass") && this.animalType.equals("Herbivore")) {
            System.out.println("Мм вкусно");
        } else {
            System.out.println("я тебя сейчас сожру");
        }
    }
}