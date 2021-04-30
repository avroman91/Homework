package com.lesson10;

/*1) Завершить пример с фруктуами: напечатать стоимость чека по 4 позициям с окрулением до копеек.

Данные вес/стоимость за Кг:

Зеленое яблоко 346 / 21.95
Красное яблоко 230 / 19.95
Банан 220 / 32.85
Лимон 88 / 34.95*/

public class HW10Task1 {

    public static void main(String[] args) {
        Fruit greenApple = new Fruit();
        greenApple.setColor(Fruit.Color.GREEN);
        greenApple.setType(Fruit.Type.APPLE);
        greenApple.setWeight(346);
        greenApple.setPricePerKg(21.95);
        double greenAppleCost = greenApple.getPricePerKg() * greenApple.getWeight() / 1000.0;

        Fruit redApple = new Fruit();
        redApple.setColor(Fruit.Color.RED);
        redApple.setType(Fruit.Type.APPLE);
        redApple.setWeight(230);
        redApple.setPricePerKg(19.95);
        double redAppleCost = redApple.getPricePerKg() * redApple.getWeight() / 1000.0;

        Fruit banana = new Fruit();
        banana.setColor(Fruit.Color.YELLOW);
        banana.setType(Fruit.Type.BANANA);
        banana.setWeight(220);
        banana.setPricePerKg(32.85);
        double bananaCost = banana.getPricePerKg() * banana.getWeight() / 1000.0;

        Fruit lemon = new Fruit();
        lemon.setColor(Fruit.Color.YELLOW);
        lemon.setType(Fruit.Type.LEMON);
        lemon.setWeight(88);
        lemon.setPricePerKg(34.95);
        double lemonCost = lemon.getPricePerKg() * lemon.getWeight() / 1000.0;

        double totalBill = lemonCost + bananaCost + greenAppleCost + redAppleCost;
        System.out.printf("Total cost of your bill is : %.2f", totalBill);

    }
}
