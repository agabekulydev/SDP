package Builder;

public class ComputerBuilderDemo {
    public static void main(String[] args) {
        Computer computer1 = new Computer.Builder()
                .cpu("Intel i7")
                .ram(16)
                .storage(512)
                .graphicsCard(true)
                .os(Computer.OS.WINDOWS)
                .build();

        Computer computer2 = new Computer.Builder()
                .cpu("AMD Ryzen 5")
                .ram(8)
                .storage(256)
                .os(Computer.OS.LINUX)
                .build();

        System.out.println(computer1);
        System.out.println(computer2);
    }
}
