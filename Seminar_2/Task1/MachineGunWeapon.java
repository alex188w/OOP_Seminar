package Task1;

public class MachineGunWeapon extends Weapon {

    @Override
    public String getName() {
        return "AK47";
    }

    @Override
    public int getDamage() {
        return 50;
    }

    @Override
    public int rateOfFire() {
        return 50;
    }

    @Override
    public int bulletsAmount() {
        return 50;
    }

    @Override
    public String getFireSound() {
        return "bang-bang";
    }
    
    
}
