package Uppgift1;

public class Triangle implements Figure {
    private int height, width;

    public Triangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    @Override
    public int getArea() {
        return height * width / 2;
    }

    @Override
    public int getCircumference() {
        return 3 * width;
    }
}
