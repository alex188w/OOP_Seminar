public class SquareShape implements Shape {
    private float side;

    public SquareShape(float side) {
        this.side = side;
    }

    @Override
    public float getArea () {
        return side * side;
    }

    @Override
    public float getPerimetr  () {
        return 4 * side;
    } 

    public String toString() {
        return "SquareShape [side = " + side + " ]";
    }
    
}
