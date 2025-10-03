package abstractfactory;

public class DellFactory implements AbstractComputerFactory {
    public ComputerAF createGamingComputer() { return new DellGamingComputer(); }
    public ComputerAF createOfficeComputer() { return new DellOfficeComputer(); }
}
