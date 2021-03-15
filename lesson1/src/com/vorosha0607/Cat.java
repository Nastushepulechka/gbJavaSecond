package com.vorosha0607;

public class Cat extends Animal implements Movable{
    private String name;
    private double maxHeight;
    private double maxWidth;

    public Cat(String name, double maxHeight, double maxWidth) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
    }

    @Override
    public void run(){
        System.out.println("Кошка_кот " + name + " смог пробежать!");
    }

    @Override
    public void jump(){
        System.out.println("Кошка_кот " + name + " смог перепрыгнуть!");
    }

    @Override
    public double getMaxHeight() {
        return maxHeight;
    }

    @Override
    public double getMaxWidth() {
        return maxWidth;
    }
}
