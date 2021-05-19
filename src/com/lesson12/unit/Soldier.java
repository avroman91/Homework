package com.lesson12.unit;

public class Soldier extends MovableUnit {
    public Soldier(int locationX, int locationY) {
        super(locationX, locationY);
        unitMap.put("(" + locationX + ";" + locationY + ")", "Soldier");
    }

    public void fire() {
    }
}
