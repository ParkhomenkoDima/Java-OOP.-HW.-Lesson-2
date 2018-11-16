package OopHomeWork2.TaskMenu;

public class MenuRunner {
    /*  Написать классы:
        Dish (блюдо).
        Свойства: название, описание, цена.
        Menu (меню).
        Свойства: название, список блюд.
        Методы: добавление блюда, нахождение самого дешевого блюда.
        Клиентский класс MenuRunner: создать 2 меню, каждое заполнить 3-я блюдами, протестировать функционал нахождения самого дешевого блюда.*/

    public static void main(String[] args) {
        Menu menu1 = new Menu("Студенческое");

        Dish dish1 = new Dish("Бутылка кефира", "500 гр.", 15);
        Dish dish2 = new Dish("Пол-батона", "250 гр.", 5);
        Dish dish3 = new Dish("Пиво", "500 мл", 25);
        Dish dish4 = new Dish("Чипсы", "150 гр.", 30);
        Dish dish5 = new Dish("Кола", "1000 мл", 40);
        menu1.addDish(dish1);
        menu1.addDish(dish2);
        menu1.addDish(dish3);

        System.out.println(menu1.getCheapestDish());
    }
}
