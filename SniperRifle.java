import sun.text.normalizer.Trie;

public class SniperRifle {


    private Enemy enemy;
    private int bulletDamage = 50;
    private int ShotsFired = 0;

    public void ShotsFired(){
        this.ShotsFired ++;}


    public int getShotsFired() {
        return ShotsFired;}

    public void BulletDamage(){
        this.bulletDamage = bulletDamage;}

    public int getBulletDamage(){
        return bulletDamage;}

// shoot recebe um endereço de memoria e dispara
    public void shoot(Enemy enemy){
        enemy.hit(bulletDamage);

    }
}
