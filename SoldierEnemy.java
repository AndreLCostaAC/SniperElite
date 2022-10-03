public class SoldierEnemy extends Enemy{


    public SoldierEnemy() {
        super(100, 0, "SoldierEnemy", false);
    }

    @Override
    public void hit(int bulletDamage) {
        super.hit(bulletDamage);
    }

    @Override
    public String getMessage() {
        return "damn son";
    }
    public String toString(){
        return "SoldierEnemy";
    }
}
