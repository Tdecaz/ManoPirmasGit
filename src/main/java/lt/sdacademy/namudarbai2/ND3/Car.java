package lt.sdacademy.namudarbai2.ND3;

public class Car {


    private String model;
    private double engine;
    private int year;
    private int price;
    private String type;

    public Car(String model, double engine, int year, int price, String type) {
        this.model = model;
        this.engine = engine;
        this.year = year;
        this.price = price;
        this.type = type;
    }

    public int getyear() { return year; }
    public int getprice() {
        return price;
    }
    public String getmodel() { return model; }
}

