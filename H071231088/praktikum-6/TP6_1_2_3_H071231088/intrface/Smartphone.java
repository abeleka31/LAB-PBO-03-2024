package TP6_1_2_3_H071231088.intrface;

import TP6_1_2_3_H071231088.Move;

public class Smartphone implements Move{
    private int price;
    private String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }
    @Override
    public void move() {
        System.out.println("Smartphon berpindah");
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }
    
}
