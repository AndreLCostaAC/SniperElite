public abstract class Enemy extends GameObject {

    private int health;
    private int armour;
    private boolean dead = false;

    public Enemy(int health, int armour, String objectType, boolean dead) {
        super(objectType);
        this.health = 100;
        this.armour = 100;
    }

    @Override
    public boolean isDead() {
        return this.dead;
    }


    public void hasDied() {
        this.dead = true;
    }

    public int getHealth() {
        return health;
    }

    public void ArmourDamageTaken(int armourDamage) {
        if (armourDamage < armour) {
            this.armour = 0;
        }
        this.armour = -armourDamage;
    }

    public void hit(int bulletDamage) {
        //System.out.println(health);
        health -= bulletDamage;

            if (health <= 0) {
                dead = true;
                System.out.println("your are dead");
            }


    }

    public String getMessage() {
        return "";
    }


}
