package factory;

public class Computer {
    private final String type;

    public Computer(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Computer type: " + type;
    }
}
