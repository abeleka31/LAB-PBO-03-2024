package TP7_123_H071231088;


public class Project {
    String project;
    int inputProjek;
    String[] daftar = { "4", "8", "12", "Lebih dari 15" };

    public void prosesProjek(String proj) {
        int input = Integer.parseInt(proj);

        switch (input) {
            case 1:
            case 2:
            case 3:
            case 4:
                project = daftar[input - 1];
                inputProjek = input;
                break;
            default:
                System.out.println("Invalid input");
                prosesProjek(proj);
                break;
        }

    }
    
    public String getProject() {
        return project;
    }

    public int getInputProject() {
        return inputProjek;
    }
    
}
