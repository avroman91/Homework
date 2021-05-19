package com.lesson12.unit;

import com.lesson12.Unit;

public class Tower extends Unit {
    public Tower(int locationX, int locationY) {
        super(locationX, locationY);
        unitMap.put("(" + locationX + ";" + locationY + ")", "Tower");
    }
}
