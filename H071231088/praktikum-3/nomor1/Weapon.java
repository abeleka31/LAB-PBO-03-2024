public class Weapon {
    String jenis;
    int damage; //damage awal semua senjata
    double range;


    public Weapon(){
    }

    public Weapon(String jenis, int damage, double range){
        this.jenis = jenis;
        this.damage = damage;
        this.range = range;
    }

    public String getJenis(){
        return jenis;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    public int getDamage(){
        return damage;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }
    public double getRange(){
        return range;
    }
    public void setRange(double range){
        this.range = range;
    }
}