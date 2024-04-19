
public class Hotwheels {
    
    String name;
    double speed, cash;
    int winningAmount;


    public Hotwheels(String name, double speed, double cash, int winningAmount){
        this.name = name;
        this.speed = speed;
        this.cash = cash;
        this.winningAmount = winningAmount;
    }
    // todo1: Crete a constructor to your needs in Main.java
    public void showSpec(){
        System.out.println("========== Specification ==========");
        System.out.println("Name            : " + this.getName());
        System.out.println("Speed           : " + this.getSpeed());
        System.out.println("Winning Amount  : " + this.getWinningAmount());
        System.out.println("Cash            : Rp." + getCash() + "\n" );

    }
    public void upgraded(int budget){
        if ( budget > this.getCash()){
            System.out.printf("%s cannot be upgrade, not enouht money \n", this.getName());
        }else{
            int increaseSpeed = budget / 50000;
            this.setSpeed(this.getSpeed() + increaseSpeed);
            this.setCash(this.getCash() - budget + (budget % 50000));
            System.out.printf("Increase the speed of%s by %d...\n", this.getName(), increaseSpeed);
        }
    }

    public void raceTo(Hotwheels enemy){
        if(this.getSpeed() > enemy.getSpeed()){
            this.setWinningAmount(1);
            this.setCash(getCash() + 40000);
            System.out.printf("%s Wins! The number od Wins from %s reaches %d wins...\n", this.getName(), this.getName(), this.getWinningAmount());
        }else if(this.getSpeed() == enemy.getSpeed()){
            System.out.printf("%s with %s are equally strong! The match ended in a draw...\n", this.getName(), enemy.getName());
        }else{
            enemy.setWinningAmount(1 + enemy.getWinningAmount());
            enemy.setCash(enemy.getCash() + 40000);
            System.out.printf("%s Wins! The number od Wins from %s reaches %d wins...\n", enemy.getName(), enemy.getName(), enemy.getWinningAmount());
        }
    }



    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getSpeed(){
        return speed;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }
    public double getCash(){
        return cash;
    }
    public void setCash(double cash){
        this.cash = cash;
    }
    public int getWinningAmount(){
        return winningAmount;
    }
    public void setWinningAmount(int winningAmount){
        this.winningAmount = winningAmount;
    }



}


