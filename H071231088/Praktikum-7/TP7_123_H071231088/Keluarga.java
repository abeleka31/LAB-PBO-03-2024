package TP7_123_H071231088;

public class Keluarga {
    private String statusPernikahan;

    
    public void SetNikah(String nikah) {
        switch (nikah) {
            case "y":
                statusPernikahan = "Sudah menikah";
                break;
            case "t":
                statusPernikahan = "Belum menikah";
                break;
        }
    }

   

    
    

    public String statusNikah() {
        return statusPernikahan;
    }
}
