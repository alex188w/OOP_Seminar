package lsp;

public abstract class Shape {
    protected float width;
    protected float height;

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public abstract void setHeight(float width);
    
    public abstract void setWidth(float height);

    public float getArea() { return width * height; }
    
}
