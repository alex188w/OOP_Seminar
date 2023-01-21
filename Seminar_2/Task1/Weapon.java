package Task1;

public abstract class Weapon {
    
    public abstract String getName();

    public abstract int getDamage();

    public abstract int rateOfFire();

    public abstract int bulletsAmount();

    public abstract String getFireSound();

    public void fire () {
        System.out.println(getFireSound());
    }
}
