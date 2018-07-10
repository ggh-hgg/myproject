package com.ggh;

public class car {
    private int foot;
    private String name;
    private double price;

    public int getFoot() {
        return foot;
    }

    public void setFoot(int foot) {
        this.foot = foot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "car{" +
                "foot=" + foot +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
