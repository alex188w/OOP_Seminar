package Task1;

public class FireGunWeapon extends Weapon {

    @Override
    public String getName() {
        return "Fire Gun";
    }

    @Override
    public int getDamage() {
        return 25;
    }

    @Override
    public int rateOfFire() {
        return 500;
    }

    @Override
    public int bulletsAmount() {
        return 500;
    }

    @Override
    public String getFireSound() {
        return "fire sound";
    }
    
}
