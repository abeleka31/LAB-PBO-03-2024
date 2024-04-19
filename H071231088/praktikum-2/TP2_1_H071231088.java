import java.util.Scanner;

public class TP2_1_H071231088 {

    private String name;
    private int age;
    private boolean isMale;
    Scanner x = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    public static void main(String[] args) {
        TP2_1_H071231088 person = new TP2_1_H071231088();
        
        System.out.print("Enter name: ");
        person.setName(person.x.nextLine());
        
        System.out.print("Enter age: ");
        while (true) {
            String tahun = person.x.nextLine();
            if (tahun.matches("\\d+")) { 
                int age = Integer.parseInt(tahun);
                if (age >= 0) {
                    person.setAge(age);
                    break;
                } else {
                    System.out.print("inputan invalid,masukan angkapositif ");
                }
            } else {
                System.out.print("Invalid imput, harus berupa angka: ");
            }
        }
        
        System.out.print("Is male? (y/n): ");
        while (true) {
            String genderInput = person.x.nextLine();
            if (genderInput.equalsIgnoreCase("y")) {
                person.setGender(true);
                break;
            } else if (genderInput.equalsIgnoreCase("n")) {
                person.setGender(false);
                break;
            } else {
                System.out.print("Invalid input. Please enter 'y' or 'n': ");
            }
        }

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Is Male: " + person.isMale());
    }
}
