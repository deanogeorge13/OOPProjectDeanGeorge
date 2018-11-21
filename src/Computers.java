import java.io.Serializable;

public class Computers extends Product implements Serializable {
    private String RAM;
    private String CPU;
    private String GPU;
    private String Storage;
    private String USB;
    private String operatingSystem;
    private String opticalDrive;

    public Computers(String RAM, String CPU, String GPU, String storage, String USB, String operatingSystem, String opticalDrive) {
        this.RAM = RAM;
        this.CPU = CPU;
        this.GPU = GPU;
        this.Storage = storage;
        this.USB = USB;
        this.operatingSystem = operatingSystem;
        this.opticalDrive = opticalDrive;
    }

    @Override
    public String toString() {
        return "Computers{" +
                "RAM='" + RAM + '\'' +
                ", CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", Storage='" + Storage + '\'' +
                ", USB='" + USB + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", opticalDrive='" + opticalDrive + '\'' +
                '}';
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String storage) {
        Storage = storage;
    }

    public String getUSB() {
        return USB;
    }

    public void setUSB(String USB) {
        this.USB = USB;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOpticalDrive() {
        return opticalDrive;
    }

    public void setOpticalDrive(String opticalDrive) {
        this.opticalDrive = opticalDrive;
    }
}
