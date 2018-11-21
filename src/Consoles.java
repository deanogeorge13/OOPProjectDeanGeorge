import java.util.ArrayList;

public class Consoles {
    private String RAM;
    private String CPU;
    private String GPU;
    private String Storage;
    private String USB;
    private String backCompat;
    private String res4K;
    private String HDR;
    private String DOLBY;

    private static ArrayList<Consoles> allConsoles;

    @Override
    public String toString() {
        return "Consoles{" +
                "RAM='" + RAM + '\'' +
                ", CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", Storage='" + Storage + '\'' +
                ", USB='" + USB + '\'' +
                ", backCompat='" + backCompat + '\'' +
                ", res4K='" + res4K + '\'' +
                ", HDR='" + HDR + '\'' +
                ", DOLBY='" + DOLBY + '\'' +
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
        this.Storage = storage;
    }

    public String getUSB() {
        return USB;
    }

    public void setUSB(String USB) {
        this.USB = USB;
    }

    public String getBackCompat() {
        return backCompat;
    }

    public void setBackCompat(String backCompat) {
        this.backCompat = backCompat;
    }

    public String getRes4K() {
        return res4K;
    }

    public void setRes4K(String res4K) {
        this.res4K = res4K;
    }

    public String getHDR() {
        return HDR;
    }

    public void setHDR(String HDR) {
        this.HDR = HDR;
    }

    public String getDOLBY() {
        return DOLBY;
    }

    public void setDOLBY(String DOLBY) {
        this.DOLBY = DOLBY;
    }

    public Consoles(String RAM, String CPU, String GPU, String storage, String USB, String backCompat, String res4K, String HDR, String DOLBY) {
        this.RAM = RAM;
        this.CPU = CPU;
        this.GPU = GPU;
        this.Storage = storage;
        this.USB = USB;
        this.backCompat = backCompat;
        this.res4K = res4K;
        this.HDR = HDR;
        this.DOLBY = DOLBY;
    }

    public static void createConsoles()
    {
        Consoles XboxOne = new Consoles("8GB", "8 Core AMD custom CPU; 1.75 GHz", "Clock Speed: 853 MHz; AMD based",
                "500GB", "USB 3.0 x3", "Yes", "No", "No", "Yes");

        Consoles XboxOneX = new Consoles("12GB", "8 custom x86 cores; 2.3 GHz", "Integrated AMD graphics with 6 teraflops of performance",
                "1TB", "USB 3.0 x3", "Yes", "Yes", "Yes", "Yes");

        Consoles Playstation4 = new Consoles("8GB", "x86-64 AMD “Jaguar”, 8 cores", "1.84 TFLOPS, AMD Radeon™ based graphics engine; 8 cores",
                "500GB", "USB 3.0 x2", "No", "No", "Yes", "No");

        Consoles Playstation4Pro = new Consoles("8GB", "x86-64 AMD “Jaguar”, 8 cores", "4.20 TFLOPS, AMD Radeon™ based graphics engine",
                "1TB", "USB 3.1 Gen.1 x3", "No", "Yes", "Yes", "No");

        System.out.println(XboxOne);
        allConsoles = new ArrayList<Consoles>();
        allConsoles.add(XboxOne);
        allConsoles.add(XboxOneX);
        allConsoles.add(Playstation4);
        allConsoles.add(Playstation4Pro);
    }

    public static void main(String args[])
    {
        createConsoles();
    }

    public static ArrayList<Consoles> getAllConsoles()
    {
        return allConsoles;
    }
}
