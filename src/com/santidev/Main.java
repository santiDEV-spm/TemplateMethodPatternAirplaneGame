package com.santidev;

/*Diferentes aviones tienen las mismas caracteristicas, pero se comportan de
* manera diferente*/

public class Main {

    public static void main(String[] args) {
	    Sprite myplane = new MyPlane();
        myplane.setX(100);
        myplane.setY(300);
        myplane.draw();

        Sprite enemyPlane = new EnemyPlane();
        enemyPlane.setX(0);
        enemyPlane.setY(300);
        enemyPlane.draw();
    }
}
