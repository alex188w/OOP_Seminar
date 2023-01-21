package Task1;

public class Main {
    /*
     * Создайте базовый класс Оружие. У оружия есть название, повреждение,
     * скорострельность, количество зарядов в обойме, звук при выстреле — это
     * методы. Напишите метод, который делает один выстрел.
     * Напишите три класса-наследника Оружия. В них переопределите родительские
     * методы.
     * Проверьте, как работают все виды оружия.
     * Создайте тестовый стенд для оружия — метод, который испытывает одно оружие. У
     * мишени 100 единиц здоровья. Оружие стреляет в него, пока не убьёт.
     * Протестируйте все виды оружия на стенде.
     * 
     */
    public static void main(String[] args) {
        GunWeapon g = new GunWeapon();
        FireGunWeapon f = new FireGunWeapon();
        MachineGunWeapon m = new MachineGunWeapon();
        // g.fire();
        // f.fire();
        // m.fire();

        int target = 100;
        
        testWeapon(m, target);
        testWeapon(g, target);
        testWeapon(f, target);

    }

    private static void testWeapon (Weapon weapon, int target) {
        while (target > 0) {
            weapon.fire();
            target -= weapon.getDamage();

            System.out.printf("Осталось %d единиц из 100 \n" , target);
            try {
                Thread.sleep(30000/weapon.rateOfFire());
            }
            catch(InterruptedException exc) {
                System.out.println(exc);
            }
            
        }

    }
}
