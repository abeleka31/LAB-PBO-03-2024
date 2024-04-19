public class TP3_1_H071231088 {
    String name;
    Weapon weapon = new Weapon();
    int health;
    double coordinate;

    public TP3_1_H071231088(){
    }
    public TP3_1_H071231088(String weaponJenis, int weaponDamage, double weaponRange){
        this.weapon.jenis = weaponJenis;
        this.weapon.damage = weaponDamage;
        this.weapon.range = weaponRange;
    }
    public TP3_1_H071231088(String nama, String weaponJenis ,int health, int weaponDamage, double coordinate, double weaponRange){
        this.name = nama;
        this.weapon.jenis = weaponJenis;
        this.health = health;
        this.weapon.damage = weaponDamage;
        this.weapon.range = weaponRange;
        this.coordinate =coordinate;
    }
    
    public void checkStatus(){
        System.out.println("|=======[ Status Player ]=======|");
        System.out.println("Nama              : " + getName());
        System.out.println("Health            : " + getHealth());
        System.out.println("Senjata           : " + getWeapon().getJenis());
        System.out.println("Damage Senjata    : " + getWeapon().getDamage());
        System.out.println("Jangkauan Senjata : " + getWeapon().getRange() + " meter");
        System.out.println("Coordinate        : " + getCoordinate());

    }

    public void gantiWeapon(TP3_1_H071231088 musuh){
        String player = this.getName();
        double x1 = this.getCoordinate();
        double x2 = musuh.getCoordinate();
        double JarakKeduaPlayer = (x2 > x1) ? (x2 - x1) : (x1 - x2);
            if (this.weapon.getRange() <= JarakKeduaPlayer){
                this.weapon.jenis = "AWM";
                this.weapon.damage = 250;
                this.weapon.range = 300;

                System.out.println("| " + player + " Mengganti senjata menjadi: " + this.weapon.getJenis());
                Serang(musuh);

            }

    }

    public void Serang(TP3_1_H071231088 musuh){
        String garis = "|===============================|";
        System.out.println("}======[ Status Serangan ]====={");
        System.out.println(garis);
        double x1 = this.getCoordinate();
        double x2 = musuh.getCoordinate();
        String player = this.getName();
        String lawan = musuh.getName();
        double JarakKeduaPlayer = (x2 > x1) ? (x2 - x1) : (x1 - x2);
        System.out.println("| Jangkauan senjata " + player + " : " + this.weapon.getRange());
        System.out.println("| Jarak Antara Player : " + JarakKeduaPlayer + " meter");
        if (this.weapon.getRange() >= JarakKeduaPlayer){
            System.out.println("| Range Senjata " + player + " mencapai " + lawan);
            musuh.health -= this.weapon.getDamage();
            System.out.println("| " + player + " Menyerang " + lawan);
        }else{
            System.out.println("| Range senjata terlalu pendek");
            System.out.println("| " + player + " Tidak bisa menyerang " + lawan);
            System.out.println(garis);
            gantiWeapon(musuh);
            System.out.println(garis);
        }
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Weapon getWeapon(){
        return weapon;
    }
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    public String getHealth(){
        if( health < 1){
            return "[ " + String.valueOf(health) + " ] Player Telah Mati";
        }else{
            return String.valueOf(health);
        }

        
        
    }
    public void setHealth(int health){
        this.health = health;
    }
    public double getCoordinate(){
        return coordinate;
    }
    public void setCoordinate(double coordinate){
        this.coordinate = coordinate;
    }


    
}