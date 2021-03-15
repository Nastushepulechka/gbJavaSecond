package com.vorosha0607;

public class Robot extends Mechnism implements Movable{
    private String type;
    private double maxHeight;
    private double maxWidth;

    public Robot(String type, double maxHeight, double maxWidth) {
        this.type = type;
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
    }

    @Override
    public void run(){
        System.out.println("Робот типа " + type + " смог пробежать!");
    }

    @Override
    public void jump(){
        System.out.println("Робот типа " + type + " смог перепрыгнуть!");
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
