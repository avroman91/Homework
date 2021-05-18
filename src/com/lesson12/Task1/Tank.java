package com.lesson12.Task1;

public class Tank extends Soldier {
    public Tank(int location) {
        super(location);
        objectMap.put(location, "Tank");
    }

    public void reload() {
    }
}
