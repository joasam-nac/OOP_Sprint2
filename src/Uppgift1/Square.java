package Uppgift1;

public class Square implements Figure{
    private int length, width;

    public Square(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void setLength(int newLength){
        length = newLength;
    }

    public void setWidth(int newWidth){
        width = newWidth;
    }

    @Override
    public int getArea() {
        return length * width;
    }

    @Override
    public int getCircumference() {
        return 2 * length + 2 * width;
    }
}
