package by.tc.task02.entity.breakfast;

import java.io.Serializable;
import java.util.Objects;

public class Food implements Serializable {
    private String name;
    private String price;

    public Food() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) { return true; }
        if (obj == null || getClass() != obj.getClass()) { return false; }

        Food food = (Food) obj;
        if (!name.equals(food.name)) { return false; }
        if (!name.equals(food.name)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        double hash = Objects.hashCode(name);
        hash = 31 * hash + Objects.hashCode(price);
        return (int) hash;
    }

    @Override
    public String toString() {
        return getClass().getName() + '@' + "name: " + name + ", price: " + price;
    }
}
