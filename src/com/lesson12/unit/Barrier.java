package com.lesson12.unit;

import com.lesson12.Unit;

public class Barrier extends Unit {

    private boolean destroyed;

    public Barrier(int locationX, int locationY) {
        super(locationX ,locationY);
        unitMap.put("("+locationX + ";" + locationY+")", "Barrier");

    }

    public void Destroy() {
        destroyed = true;
    }
}
