package underwood;

public class Computer {

    private Case pcCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public Computer(Case pcCase, Monitor monitor, Motherboard motherboard) {
        this.pcCase = pcCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        pcCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "Yellow");
    }
}

