package lt.sdacademy.fundamentalsCoding.practicalExecizes.triangle;

public class Triangle {

    private int a;
    private int b;
    private int c;
    private TriangleType triangleType;
    private int perimeter;

    Triangle(int a, int b, int c, TriangleType triangleType) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.triangleType = triangleType;
    }

    public int getA () {
        return a;
    }
    public int getB () {
        return b;
    }
    public int getC () {
        return c;
    }
    public TriangleType getTriangleType() {
        return triangleType;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

}
