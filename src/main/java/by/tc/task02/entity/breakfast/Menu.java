package by.tc.task02.entity.breakfast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Menu implements Serializable {
    private List<Food> foods = new ArrayList<>();

    public Menu() {
    }

    public void addFood(Food food) {
        foods.add(food);
    }

    public Food[] getFoods() {
        return (Food[]) foods.toArray();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) { return true; }
        if (obj == null || getClass() != obj.getClass()) { return false; }

        Menu menu = (Menu) obj;
        if (!foods.equals(menu.foods)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        double hash = Objects.hashCode(foods);
        return (int) hash;
    }

    @Override
    public String toString() {
        return getClass().getName() + '@' + "foods: " + foods;
    }
}
