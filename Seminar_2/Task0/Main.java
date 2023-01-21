import java.util.Arrays;
import java.util.List;

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