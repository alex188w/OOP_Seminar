import java.util.ArrayList;

import javax.swing.text.Position;

// Выявите и реализуйте классы для следующей задачи. 
// Пропишите необходимый минимум полей и методов. Пока что оставьте методы пустыми.
// Торговый автомат содержит в себе набор товаров. Покупатель вводит номер товара. 
// Автомат высвечивает стоимость товара. Покупатель его оплачивает. 
// Из лотка выпадает заказанный товар.
/**
 * les1
 */
public class les1 {
    public static void main(String[] args) {
        Product cola = new Product("Cola", 5, 100, 3);
        Product fanta = new Product("fanta", 3, 122, 2);
        Product snickers = new Product("snickers", 2, 50, 1);
        Product coffee = new Product("coffee", 6, 10, 4);
        Product bubllegum = new Product("bubllegum", 3, 1000, 5);
        Product lays = new ChipsProduct("lays", 9, 77, 15);
        ArrayList<Product> venMach = new ArrayList<>();
        venMach.add(cola);
        venMach.add(bubllegum);
        venMach.add(fanta);
        venMach.add(snickers);
        venMach.add(coffee);
        venMach.add(lays);
        VendingMachine machine = new VendingMachine(venMach);
        System.out.println(machine);
        machine.extradition();
        machine.fullPrice();
        machine.getMoney();
        machine.getNumber(0);
    }

}