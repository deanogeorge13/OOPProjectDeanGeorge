public class Displays {
    private String Size;
    private String Resolution;
    private String refreshRate;
    private String responseTime;
    private String videoInputs;
    private String displayType;
    private String USB;
    private String Thickness;

    public Displays(String size, String resolution, String refreshRate, String responseTime, String videoInputs, String displayType, String USB, String thickness) {
        this.Size = size;
        this.Resolution = resolution;
        this.refreshRate = refreshRate;
        this.responseTime = responseTime;
        this.videoInputs = videoInputs;
        this.displayType = displayType;
        this.USB = USB;
        this.Thickness = thickness;
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
                '}';
    }
}
