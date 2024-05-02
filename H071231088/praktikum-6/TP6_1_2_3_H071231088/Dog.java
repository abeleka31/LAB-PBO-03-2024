package TP6_1_2_3_H071231088;

public abstract class Dog implements Move {
    protected int position;
    protected int averageLength;

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }
    public abstract void describe();
}

