package TP6_1_2_3_H071231088.abstrack;

import TP6_1_2_3_H071231088.Dog;

public class SiberianHusky extends Dog {
    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 2;
        System.out.println("Siberian Husky berpindah sejauh " + position + " titik");
    }
    @Override 
    public void describe() {
        System.out.println("Dog yang tidak terurus, jadinya Kurus");
    }
    
}
