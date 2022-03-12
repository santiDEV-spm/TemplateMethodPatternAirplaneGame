package com.santidev;

public class EnemyPlane extends Sprite{
    @Override
    public void draw() {
        System.out.println("My plane from the top of screen:"
                + " x = " + this.getX() + ", y = " + this.getY());
    }
}
