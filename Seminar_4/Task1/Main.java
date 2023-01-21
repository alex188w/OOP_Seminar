package Task1;
import java.util.Random;

public class Main {
    /**
     * Пара хранит в себе два значения произвольных типов, например,
     * Pair<Integer, String> или Pair<Float, Double>. Напишите самодельный класс
     * Pair, используя обобщения. У него должны быть конструкторы, геттеры и
     * toString ().
     * Тройка хранит в себе три значения произвольных типов, например,
     * Triple<Integer, Integer, Integer>. Напишите самодельный класс Triple.
     * Напишите функцию, которая возвращает тройку случайных целых чисел в диапазоне
     * от 0 до 255 (то есть случайный цвет).
     */
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(10, " qwert");
        System.out.println(p1);

        Triple<Integer, Integer, Integer> tr1 = new Triple<>(15, 25, 33);
        System.out.println(tr1);

        System.out.println(getRndTriple());
    }

    public static Triple<Integer, Integer, Integer> getRndTriple() {
        Random rnd = new Random();
        Triple<Integer, Integer, Integer> tr2 = new Triple<>(rnd.nextInt(-255, 255), rnd.nextInt(-255, 255),
                rnd.nextInt(-255, 255));
        return tr2;
    }

}