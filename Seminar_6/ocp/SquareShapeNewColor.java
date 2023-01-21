package ocp;

public class SquareShapeNewColor implements Shape {
    private char color;

    

    public SquareShapeNewColor(char color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.printf("%c%c%c%c%c%c\n", color, color, color, color, color, color);
        System.out.printf("%c%c%c%c%c%c\n", color, color, color, color, color, color);
        System.out.printf("%c%c%c%c%c%c\n", color, color, color, color, color, color);
        System.out.println();
        
    }    
}
