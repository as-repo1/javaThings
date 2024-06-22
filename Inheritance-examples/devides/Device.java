public class Device {
    String brand;
    String model;
    int rom;
    int ram;
    int version;

    // Constructor
    Device(String brand, String model, int rom, int ram, int version) {
        this.brand = brand;
        this.model = model;
        this.rom = rom;
        this.ram = ram;
        this.version = version;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", ROM: " + rom + "GB, RAM: " + ram + "GB, Android Version: " + version);
    }
}
