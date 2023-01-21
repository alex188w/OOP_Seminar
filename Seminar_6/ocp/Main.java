package ocp;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Iterable<Shape> shapes = Arrays.asList(
            new SquareShape (),
            new CircleShape (),
            new CircleShape (),
            new SquareShape (),
            new TriangleShape (),
            new SquareShapeNewColor ('$')
        );

        for (Shape shape : shapes)
            shape.draw ();
    }
}
