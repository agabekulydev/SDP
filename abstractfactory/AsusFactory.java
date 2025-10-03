package abstractfactory;

public class AsusFactory implements AbstractComputerFactory {
    public ComputerAF createGamingComputer() { return new AsusGamingComputer(); }
    public ComputerAF createOfficeComputer() { return new AsusOfficeComputer(); }
}
