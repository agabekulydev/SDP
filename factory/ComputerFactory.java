package factory;

public class ComputerFactory {
    public static Computer createComputer(ComputerType type) {
        return switch (type) {
            case GAMING -> new Computer("Gaming Computer");
            case OFFICE -> new Computer("Office Computer");
            case SERVER -> new Computer("Server Computer");
        };
    }
}