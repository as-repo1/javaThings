public class Tablet extends Device {
    boolean stylusSupport;

    // Constructor
    Tablet(String brand, String model, int rom, int ram, int version, boolean stylusSupport) {
        super(brand, model, rom, ram, version);
        this.stylusSupport = stylusSupport;
    }

    void displayTabletInfo() {
        displayInfo();
        System.out.println("Stylus Support: " + (stylusSupport ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Tablet tablet1 = new Tablet("Apple", "iPad 6th", 32, 2, 17, true);
        Tablet tablet2 = new Tablet("Swipe", "Slate Pro", 32, 2, 6, false);

        tablet1.displayTabletInfo();
        tablet2.displayTabletInfo();
    }
}
