package factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Computer gaming = ComputerFactory.createComputer(ComputerType.GAMING);
        Computer office = ComputerFactory.createComputer(ComputerType.OFFICE);

        System.out.println(gaming);
        System.out.println(office);
    }
}