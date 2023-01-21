package srp_afterCorrect;

class RectangleCalc {
    private int width, height;

    public RectangleCalc(int width, int height) {
        this.width = width;
        this.height = height;
       
    }

    public int getWidth() {
        return width;
    }


    public int getHeight() {
        return height;
    }

    // вычислительная задача
    public int getArea () { return width * height; }

    
}
