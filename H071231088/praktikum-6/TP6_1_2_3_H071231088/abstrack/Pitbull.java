package TP6_1_2_3_H071231088.abstrack;

import TP6_1_2_3_H071231088.Dog;

public class Pitbull extends Dog {
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);

    }
    @Override
    public void move() {
        position += 3;
        System.out.println("Pitbull berpindah ke kanan sejauh " + position + " titik");
    }
    @Override
    public void describe() {
        System.out.println("Pitbul gemuk");
    }
}