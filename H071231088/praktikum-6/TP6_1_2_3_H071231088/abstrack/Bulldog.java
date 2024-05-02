package TP6_1_2_3_H071231088.abstrack;

import TP6_1_2_3_H071231088.Dog;

public class Bulldog extends Dog {
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);

    }
    @Override
    public void move() {
        position += 1;
        System.out.println("bulldog berpindah ke kanan sejauh " + position + " titik");
    }
    @Override
    public void describe() {
        System.out.println("buldog jelek, gemuk, dekil, hidup lagi");
    }
}