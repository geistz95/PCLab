package Computer;

public class Main {
    public static void main(String[] args) {
        Resolution resolution= new Resolution(50,50);
        Monitor monitor = new Monitor(resolution, "HP24m","HP");
        Dimension dimensions = new Dimension(200, 200, 100);
        Case pcCase= new Case("Windows xp","Microsoft","220 volts",dimensions);
        MotherBoard motherBoard = new MotherBoard("sony23","sony", 2,4,"sony-bios");
        PC pc = new PC(pcCase,motherBoard,monitor);
        pc.description();
        pc.powerUp();
    }
}
