package com.lesson12.Task1;

public class Tank extends MovableUnit {

    public Tank(int locationX, int locationY) {
        super(locationX ,locationY);
        unitMap.put("("+locationX + ";" + locationY+")", "Tank");
    }

    public void reload() {
    }
}
