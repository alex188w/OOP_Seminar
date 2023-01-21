package Task2;

/**
 * Напишите самодельный обобщённый класс MyCollection, внутри которого спрятан
 * массив. Используйте обобщения, чтобы класс мог хранить данные произвольного
 * типа, например, MyCollection<Integer> или MyCollection<String>. Обязательные
 * операции, которые надо прописать:
 * get: достаёт элемент по указанному индексу
 * set: перезаписывает элемент по указанному индексу
 * size: сколько элементов в массиве?
 * toString
 * (Необязательная часть, если есть время). Пропишите операцию add, которая
 * делает динамическое перевыделение массива и добавляет новый элемент в конец.
 */

public class Main {
    public static void main(String[] args) {
        Integer[] n = { 4, 6, 2, 9, 5 };
        MyCollection<Integer> col1 = new MyCollection<>(n);
        System.out.println(col1);
        System.out.println(col1.get(3));
        col1.set(100, 0);
        System.out.println(col1);
        System.out.printf("size = %d\n", col1.size());
        col1.add(25);
        System.out.println(col1);

    }

}
