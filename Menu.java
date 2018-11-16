package OopHomeWork2.TaskMenu;

import java.util.ArrayList;

public class Menu {
    private final String name;
    private final ArrayList<Dish> dishes = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public Dish getCheapestDish() {
        long price = Long.MAX_VALUE;
        int counter = -1;

        for (Dish dish : dishes) {
            if (dish.getPrice()<price){
                price = dish.getPrice();
                counter++;
                System.out.println(counter);
            }
        }
        return dishes.get(counter);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", dishes=" + dishes +
                '}';
    }
}
