public class ArmouredEnemy extends Enemy {
    private int armour = 100;

    public ArmouredEnemy() {
        super(100,100,"Armoured Enemy",false);}

    @Override
    public void hit(int bulletDamage) {
        //System.out.println(armour);
        if (armour > 0) {
            armour -= bulletDamage;
            System.out.println(armour);
        } else {
            super.hit(bulletDamage);
        }
    }

    @Override
    public String getMessage() {
        return "Keep Shooting Bitch";
    }

    @Override
    public String toString() {
        return "ArmouredEnemy";
    }
}