package srp_afterCorrect;

public class RectangleGraph {
    private RectangleCalc rectangleCalc;

    public RectangleGraph(RectangleCalc rectangleCalc) {
        this.rectangleCalc = rectangleCalc;        
    }

    public void draw() {
        GraphicsLibrary.drawRectangle(0, 0, rectangleCalc.getWidth(), rectangleCalc.getHeight(), '#');
    }
}
