package Task1;

public class GunWeapon extends Weapon{

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Makarov";
    }

    @Override
    public int getDamage() {
        return 10;
    }

    @Override
    public int rateOfFire() {
        return 60;
    }

    @Override
    public int bulletsAmount() {
        return 0;
    }

    @Override
    public String getFireSound() {
        return "paf";
    }    
}
