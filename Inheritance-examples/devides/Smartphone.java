public class Smartphone extends Android {
    String connectivity;

    // Constructor
    Smartphone(String brand, String model, int rom, int ram, int version, String connectivity) {
        super(brand, model, rom, ram, version);
        this.connectivity = connectivity;
    }

    void displayFullInfo() {
        displayInfo();
        System.out.println("Connectivity: " + connectivity);
    }

    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone("Samsung", "F34", 128, 6, 14, "5G");
        Smartphone phone2 = new Smartphone("Poco", "M2", 64, 6, 14, "4G");
        Smartphone phone3 = new Smartphone("Oppo", "Reno 2f", 128, 8, 11, "4G");
        Smartphone phone4 = new Smartphone("Samsung", "S duos2", 4, 1, 7, "3G");

        phone1.displayFullInfo();
        phone2.displayFullInfo();
        phone3.displayFullInfo();
        phone4.displayFullInfo();
    }
}
