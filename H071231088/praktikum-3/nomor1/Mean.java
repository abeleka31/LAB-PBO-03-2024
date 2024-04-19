public class Mean {
    public static void main(String[] args) {
        Weapon weapon1 = new Weapon("AK47",61, 72);
        TP3_1_H071231088 player1 = new TP3_1_H071231088("Hayato", weapon1.getJenis(), 200, weapon1.getDamage() ,3.4, weapon1.getRange());
        Weapon weapon2 = new Weapon("M1187", 100, 21);
        TP3_1_H071231088 player2 = new TP3_1_H071231088("Keny",weapon2.getJenis(), 200, weapon2.getDamage(),60,weapon2.getRange() );

        String garis = "|===============================|";
        System.out.println(garis);
        player1.checkStatus();
        System.out.println(garis);
        player2.checkStatus();

        System.out.println(garis);
        System.out.println("[  Keduanya saling menyerang  ]" );
        System.out.println(garis);
        player1.Serang(player2);
        player2.Serang(player1);

        player1.checkStatus();
        player2.checkStatus();
        System.out.println(garis);



    }
}
