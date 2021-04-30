package com.lesson10;

public class Fruit {

    public enum Type {
        APPLE, BANANA, LEMON
    }

    public enum Color {
        GREEN, RED, YELLOW
    }

    private Type type;
    private Color color;
    private int weight; // gram
    private double pricePerKg;

    public Type getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "type=" + type +
                ", color=" + color +
                ", weight=" + weight +
                ", pricePerKg=" + pricePerKg +
                '}';
    }

}