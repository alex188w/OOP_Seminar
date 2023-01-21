import java.util.Arrays;
import java.util.List;

/*
 * Создайте базовый класс — Геометрическая фигура. Геометрическая фигура предоставляет две функции:
Узнать площадь
Узнать периметр
Создайте два унаследованных класса: Квадрат и Круг. Переопределите родительские методы.
Создайте коллекцию геометрических фигур. Распечатайте информацию о них.
 */

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
            new SquareShape(5f),
            new SquareShape(3f),
            new CircleShape(5f),
            new CircleShape(3f)
        );

        for (Shape shape : shapes) {
            System.out.printf("%s area=%f perimetr=%f\n", shape, shape.getArea(), shape.getPerimetr());
        }
    }    
}