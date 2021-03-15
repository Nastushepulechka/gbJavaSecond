package com.vorosha0607;

public class Main {

    public static void main(String[] args) {
        Movable[] movables = {
                new Human("Настя", 1.5, 1000),
                new Cat("Дуся", 2, 500),
                new Robot("Пылесос", 0.2, 5000)
        };

        Obstracles[] obstracles = {
                new Treadmill(1000),
                new Wall(2)
        };

        for (int i = 0; i < movables.length; i++) {
            for (int j = 0; j < obstracles.length; j++) {
                if(!obstracles[j].overcome(movables[i]))
                    break;
            }
        }
    }
}
