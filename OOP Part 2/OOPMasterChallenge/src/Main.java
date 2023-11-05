public class Main {

    public static void main(String[] args) {

//        Item coke = new Item("drink", "coke", 1.5);
//        coke.printItem();
//        coke.setSize("large");
//        coke.printItem();

//        Burger burger = new Burger("regular",4.00);
//        burger.addToppings("BACON","CHEESE","MAYO");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON","CHEESE","MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

//        MealOrder secondMeal = new MealOrder("turkey", "7-up", "chilli");
//        secondMeal.addBurgerToppings("LETTUCE","CHEESE","MAYO");
//        secondMeal.setDrinkSize("small");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "chilli");
        deluxeMeal.addBurgerToppings("AVOCADO","BACON","LETTUCE","CHEESE","MAYO");
        deluxeMeal.setDrinkSize("SMALL");

        deluxeMeal.printItemizedList();
    }
}
