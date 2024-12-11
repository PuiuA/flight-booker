import java.util.Random;
public class PlaneInfo {
    String denumire;
    String numeCompanie;
    int numarPasageri;

    static String[] avioane = {"Boeing 747", "Airbus A320", "Boeing 777", "Airbus A380", "McDonnell Douglas MD-80",
            "Concorde", "Boeing 787 Dreamliner", "Airbus A350", "Lockheed Martin F-22 Raptor", "Cessna 172", "Embraer E190",
            "Bombardier CRJ900", "Sukhoi Superjet 100", "Antonov An-225 Mriya"};
    static String[] companii = {
            "American Airlines", "Delta Air Lines", "United Airlines", "Lufthansa", "Air France",
            "Emirates", "British Airways", "Qatar Airways"};
    public PlaneInfo(){
        Random random = new Random();
        this.denumire = avioane[random.nextInt(0, avioane.length)];
        this.numeCompanie = companii[random.nextInt(0, companii.length)];
        this.numarPasageri = random.nextInt(41)+40;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getNumarPasageri() {
        return numarPasageri;
    }

    public void setNumarPasageri(int numarPasageri) {
        this.numarPasageri = numarPasageri;
    }

    public String getNumeCompanie() {
        return numeCompanie;
    }

    public void setNumeCompanie(String numeCompanie) {
        this.numeCompanie = numeCompanie;
    }
}
