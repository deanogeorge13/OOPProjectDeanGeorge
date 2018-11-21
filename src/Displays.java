public class Displays {
    private String Size;
    private String Resolution;
    private String refreshRate;
    private String responseTime;
    private String videoInputs;
    private String displayType;
    private String USB;
    private String Thickness;
    private String aspectRatio;

    public Displays(String size, String resolution, String refreshRate, String responseTime, String videoInputs, String displayType, String USB, String thickness, String aspectRatio) {
        Size = size;
        Resolution = resolution;
        this.refreshRate = refreshRate;
        this.responseTime = responseTime;
        this.videoInputs = videoInputs;
        this.displayType = displayType;
        this.USB = USB;
        this.Thickness = thickness;
        this.aspectRatio = aspectRatio;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        this.Size = size;
    }

    public String getResolution() {
        return Resolution;
    }

    public void setResolution(String resolution) {
        this.Resolution = resolution;
    }

    public String getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(String refreshRate) {
        this.refreshRate = refreshRate;
    }

    public String getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }

    public String getVideoInputs() {
        return videoInputs;
    }

    public void setVideoInputs(String videoInputs) {
        this.videoInputs = videoInputs;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public String getUSB() {
        return USB;
    }

    public void setUSB(String USB) {
        this.USB = USB;
    }

    public String getThickness() {
        return Thickness;
    }

    public void setThickness(String thickness) {
        this.Thickness = thickness;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    @Override
    public String toString() {
        return "Displays{" +
                "Size='" + Size + '\'' +
                ", Resolution='" + Resolution + '\'' +
                ", refreshRate='" + refreshRate + '\'' +
                ", responseTime='" + responseTime + '\'' +
                ", videoInputs='" + videoInputs + '\'' +
                ", displayType='" + displayType + '\'' +
                ", USB='" + USB + '\'' +
                ", Thickness='" + Thickness + '\'' +
                ", aspectRatio='" + aspectRatio + '\'' +
                '}';
    }

    public static void createDisplays()
    {
        Displays BENQPD3200U = new Displays("32'", "3840x2160", "60Hz", "4ms", "HDMI, DisplayPort x2",
                "LED", "USB 3.0 x4", "2.6'", "16.9");

        Displays ASUSVG278Q = new Displays("27'", "1920x1080", "144Hz", "1ms", "HDMI, DisplayPort",
                "LCD", "None", "2'", "16:9");

        Displays SamsungQ9FN = new Displays("65'", "3840x2160", "240Hz", "N/A", "HDMI x4",
                "QLED", "USB x3", "1.5'", "16:9");

        Displays TCL6Series = new Displays("55'", "3840x2160", "240Hz", "6.5ms", "HDMI x3",
                "LCD", "USB", "3'", "16:9");

        System.out.println(BENQPD3200U);
    }

    public static void main(String args[])
    {
        createDisplays();
    }
}
