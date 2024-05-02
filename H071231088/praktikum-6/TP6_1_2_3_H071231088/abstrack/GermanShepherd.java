package TP6_1_2_3_H071231088.abstrack;

import TP6_1_2_3_H071231088.Dog;

public class GermanShepherd extends Dog {
    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 2;
        System.out.println("German anjing berpindah sejauh " + position + " titik");
    }
    @Override 
    public void describe() {
        System.out.println("Apakah anjing german gey?");
    }
    
}

