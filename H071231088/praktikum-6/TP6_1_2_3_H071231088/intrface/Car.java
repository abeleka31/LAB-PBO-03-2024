package TP6_1_2_3_H071231088.intrface;

import TP6_1_2_3_H071231088.Move;

public class Car implements Move{
    private int totalForwardGear;
    private String color;
    private int maxSped;
    
    public Car(int totalForwardGear, String color, int maxSped) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSped = maxSped;
    }

    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi. ");
    }


    public int getTotalForwardGear() {
        return totalForwardGear;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSped() {
        return maxSped;
    }

}
