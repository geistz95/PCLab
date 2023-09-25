package Computer;

public class Monitor {
    Resolution resolution;
    String modelNumber;
    String manufacturerName;
    public Monitor(Resolution resolution, String modelNumber, String manufacturerName){
        this.resolution=resolution;
        this.modelNumber=modelNumber;
        this.manufacturerName=manufacturerName;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " " + " in color "+ color);
    }
    @Override
    public String toString(){
        return "Monitor"+resolution.toString()+", modelNumber="+modelNumber+", manufacturerName="+manufacturerName;
    }
}
