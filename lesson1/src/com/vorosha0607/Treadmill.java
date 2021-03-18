package com.vorosha0607;

public class Treadmill implements Obstracles{
    private int width;

    public Treadmill(int width) {
        this.width = width;
    }

    @Override
    public boolean overcome(Movable m){
        if (m.getMaxWidth() >= this.width) {
            m.run();
            return true;
        }
        else {
            System.out.println("Не смог пробежать");
            return false;
        }
    }

}
