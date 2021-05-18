package com.lesson12.Task1;

import java.util.HashMap;

/*1) Есть игра в которой клетчастое поле (например размером 10x10 клеток) и юниты, в одной клетке один юнит.
Есть 4 типа юнитов: Башня, забор, содат и танк.
Забор ничего не делает и может быть разрушен
Башня ничего не делает и безсмертна
Солдат стреляет и двигается - у него можно вызвать методы move() и fire()
Танк умеет то же что и солдат, плюс еще у него есть метод reload()
*/

public class HW12Task1 {

    public static void main(String[] args) {
        Tank tank1 = new Tank(1);
        Soldier Petka = new Soldier(2);
        Barrier cube = new Barrier(3);
        Barrier cube2 = new Barrier(5);
        Tower tower1 = new Tower(4);
        System.out.println(objectMap);
    }

    protected int location;
    protected static HashMap<Integer, String> objectMap = new HashMap<Integer, String>();

    public HW12Task1(int location) {
    }
}