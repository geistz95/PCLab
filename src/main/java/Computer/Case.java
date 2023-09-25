package Computer;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimension dimensions;
    public Case(String model, String manufacturer, String powerSupply, Dimension dimensions){
        this.model=model;
        this.manufacturer=manufacturer;
        this.powerSupply=powerSupply;
        this.dimensions=dimensions;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Dimension getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimension dimensions) {
        this.dimensions = dimensions;
    }
    public void pressPowerButton(){
        System.out.println("Power button pressed!");
    }
    @Override
    public String toString(){
        return "Case{model="+model+", manufacturer"+manufacturer+", powerSupply"+powerSupply+", "+dimensions;
    }
}
