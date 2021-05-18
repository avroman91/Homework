package com.lesson12.Task1;

public class Barrier extends HW12Task1 {

    private boolean destroyed;

    public Barrier(int location) {
        super(location);
        objectMap.put(location, "Barrier");

    }

    public void Destroy() {
        destroyed = true;
    }
}
