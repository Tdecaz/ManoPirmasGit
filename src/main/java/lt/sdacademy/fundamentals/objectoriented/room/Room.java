package lt.sdacademy.fundamentals.objectoriented.room;

public class Room {

    private int width;
    private int length;
    static int count = 0;

    public Room(int width, int height) {

        this.width = width;
        this.length = height;
        this.count++;

    }

    public int getLength() {
        return length;
    }

    public int getwidth() {
        return width;

    }
}
