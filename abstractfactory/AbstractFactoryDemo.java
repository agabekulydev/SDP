package abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractComputerFactory dell = new DellFactory();
        AbstractComputerFactory asus = new AsusFactory();

        System.out.println(dell.createGamingComputer().getDescription());
        System.out.println(asus.createOfficeComputer().getDescription());
    }
}

