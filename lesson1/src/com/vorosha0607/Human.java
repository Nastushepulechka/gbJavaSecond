package com.vorosha0607;

public class Human extends SentientBeings implements Movable{
    private String name;
    private double maxHeight;
    private double maxWidth;

    public Human(String name, double maxHeight, double maxWidth) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
    }

    @Override
    public void run(){
        System.out.println("Человек " + name + " смог пробежать!");
    }

    @Override
    public void jump(){
        System.out.println("Человек " + name + " смог перепрыгнуть!");
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
