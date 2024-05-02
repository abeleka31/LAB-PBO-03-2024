package TP6_1_2_3_H071231088;

import TP6_1_2_3_H071231088.abstrack.Bulldog;
import TP6_1_2_3_H071231088.abstrack.GermanShepherd;
import TP6_1_2_3_H071231088.abstrack.Pitbull;
import TP6_1_2_3_H071231088.abstrack.SiberianHusky;
import TP6_1_2_3_H071231088.intrface.Car;
import TP6_1_2_3_H071231088.intrface.Smartphone;
public class Main {

    public static void main(String[] args) {

        Pitbull pitbull = new Pitbull(0, 3);
        SiberianHusky siberianHusky = new SiberianHusky(0, 5);
        Bulldog bulldog = new Bulldog(0, 6);
        GermanShepherd germanShepherd = new GermanShepherd(0, 1);

        Smartphone smartphone = new Smartphone(1000, "Samsung");
        Car car = new Car(6, "Merah", 200);

        garis();
        moveAllDogs(pitbull, siberianHusky, bulldog, germanShepherd);
        garis();
        smartphone.move();
        garis();
        car.move();
        garis();

        describeAllDogs(pitbull, siberianHusky, bulldog, germanShepherd);
        garis();

        System.out.println("Informasi Smartphone:");
        garis();
        System.out.println("Harga: " + smartphone.getPrice());
        System.out.println("Merek: " + smartphone.getBrand());
        garis();

        System.out.println("Informasi Mobil:");
        garis();
        System.out.println("Jumlah Gigi Maju: " + car.getTotalForwardGear());
        System.out.println("Warna: " + car.getColor());
        System.out.println("Kecepatan Maksimum: " + car.getMaxSped());
        garis();


    }

    private static void moveAllDogs(Dog... dogs) {
        for (Dog dog : dogs) {
            dog.move();
        }
    }

    private static void describeAllDogs(Dog... dogs) {
        for (Dog dog : dogs) {
            dog.describe();
        }
    }

    private static void garis() {
        System.out.println("==================================");
    }
}
