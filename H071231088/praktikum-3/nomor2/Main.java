
public class Main {
    
    public static void main(String[] args) {
        Hotwheels marcebesDenz = new Hotwheels("Mercebes-denz", 4, 20000, 0);
        
        Hotwheels ferharri = new Hotwheels(null, 0, 0, 0);
        ferharri.setName("Ferhari");
        ferharri.setSpeed(4);
        ferharri.setCash(90000);

        System.out.println();
        marcebesDenz.showSpec();
        ferharri.showSpec();

        printBarriers();
        marcebesDenz.upgraded(50000);
        printBarriers();
        ferharri.upgraded(50000);
        printBarriers();

        System.out.println();
        ferharri.showSpec();
        marcebesDenz.showSpec();

        printBarriers();
        ferharri.raceTo(marcebesDenz);
        printBarriers();
        marcebesDenz.raceTo(ferharri);
        printBarriers();

        System.out.println();
        marcebesDenz.showSpec();
        ferharri.showSpec();



    }
    public static void printBarriers(){
        System.out.println("====================================");
    }
}
