package com.lesson12;

import com.lesson12.unit.Barrier;
import com.lesson12.unit.Soldier;
import com.lesson12.unit.Tank;
import com.lesson12.unit.Tower;

import java.util.HashMap;

/*1) Есть игра в которой клетчастое поле (например размером 10x10 клеток) и юниты, в одной клетке один юнит.
Есть 4 типа юнитов: Башня, забор, содат и танк.
Забор ничего не делает и может быть разрушен
Башня ничего не делает и безсмертна
Солдат стреляет и двигается - у него можно вызвать методы move() и fire()
Танк умеет то же что и солдат, плюс еще у него есть метод reload()
*/

public class Unit {

    public static void main(String[] args) {
        Tank tank1 = new Tank(1, 5);
        Soldier Petka = new Soldier(2, 3);
        Barrier cube = new Barrier(3, 4);
        Barrier cube2 = new Barrier(1, 2);
        Tower tower1 = new Tower(1, 4);
        System.out.println(unitMap);
    }

    protected int locationX;
    protected int locationY;
    protected static HashMap<String, String> unitMap = new HashMap<String, String>();

    public Unit(int locationX, int locationY) {
        this.locationX = locationX;
        this.locationY = locationY;
    }
}