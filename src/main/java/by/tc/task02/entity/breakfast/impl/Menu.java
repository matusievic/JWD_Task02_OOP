package by.tc.task02.entity.breakfast.impl;

import by.tc.task02.entity.breakfast.BreakfastEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Menu implements BreakfastEntity {
    private List<Food> foods = new ArrayList<>();

    public Menu() {
    }

    public void addFood(Food food) {
        foods.add(food);
    }

    public Food[] getFoods() {
        return foods.toArray(new Food[foods.size()]);
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
