package com.lesson12.Task1;

public class Tower extends Unit {
    public Tower(int locationX, int locationY) {
        super(locationX,locationY);
        unitMap.put("("+locationX + ";" + locationY+")", "Tower");
    }
}
