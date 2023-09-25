package Computer;

public class PC {
    private Case pcCase;
    private MotherBoard motherboard;
    private Monitor monitor;
    public PC (Case pcCase, MotherBoard motherboard, Monitor monitor){
        this.pcCase=pcCase;
        this.motherboard=motherboard;
        this.monitor=monitor;
    }
    private void drawLogo(){
        monitor.drawPixel(10,10,"Purple");
    }
    public void description(){
        String string="Welcome to worst buy below is the description of the pc on sale today\n"+monitor.toString()+"\n"+pcCase.toString()+"\n"+motherboard.toString();
        System.out.println(string);
    }
    public void powerUp(){
        pcCase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("Photoshop");
    }

    public Case getPcCase() {
        return pcCase;
    }

    public void setPcCase(Case pcCase) {
        this.pcCase = pcCase;
    }

    public MotherBoard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(MotherBoard motherboard) {
        this.motherboard = motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
