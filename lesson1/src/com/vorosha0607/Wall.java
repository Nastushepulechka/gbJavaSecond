package com.vorosha0607;

public class Wall implements Obstracles{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean overcome(Movable m){
        if (m.getMaxHeight() >= this.height) {
            m.jump();
            return true;
        }
        else {
            System.out.println("Не смог перепрыгнуть");
            return false;
        }
    }
}
