import sun.awt.image.ShortInterleavedRaster;

import java.awt.image.CropImageFilter;
import java.security.PublicKey;
import java.sql.SQLOutput;

public class Game {

    public GameObject[] gameObjects;
    private SniperRifle sniperRifle;
    private int shotsFired = 0;
    private boolean isDead = false;

    public static final int CREATED_OBJECTS = 1;

    // ao criar um tipo de referencia criar um new.
    public Game(int size) {
        this.gameObjects = new GameObject[CREATED_OBJECTS];
        this.sniperRifle = new SniperRifle();
    }

    public void start() {

        createObjects();

        for (GameObject objs : gameObjects) {
            System.out.println(objs);
        }

        shoot();
    }


    public void createObjects() {
        int count;

        for (int i = 0; i < gameObjects.length; i++) {
            count = (int) (Math.random() * 10);
            //System.out.println(count);
            if (count > 8) {
                gameObjects[i] = new Tree("Tree");
                continue;
            }
            if (count > 4) {
                gameObjects[i] = new SoldierEnemy();;
                continue;
            }
            if (count >= 0) {
                gameObjects[i] = new ArmouredEnemy();
            }

        }
    }

    public void shoot() {
        for (int i = 0; i < gameObjects.length; i++) {
            System.out.println("Lets the game begin");
            if (!(gameObjects[i] instanceof Tree)){

                while(!((Enemy)gameObjects[i]).isDead()){
                    shotsFired++;
                    System.out.println("Starting with " + ((Enemy) gameObjects[i]).getHealth() + " hp, Sniper took the shot number " + shotsFired + "\n" );
                    System.out.println("Enemy HP is now ");
                    sniperRifle.shoot((Enemy) gameObjects[i]);
                    System.out.println("your sniper shooted " + shotsFired + " times");

                }


            }
            else{
                System.out.println("I m a tree, don t shoot me idiot");
            }
        }
    }
}
