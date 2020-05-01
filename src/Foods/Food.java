package Foods;

import java.util.Objects;

public abstract class Food {

    String foodName;
    String foodType;

    Food() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != foodType.getClass()) return false;
        String food = (String) o;
        return Objects.equals(foodType, food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodType);
    }
}