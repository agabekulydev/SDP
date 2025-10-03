package Builder;

public class Computer {
    public enum OS { WINDOWS, LINUX, MAC }

    private final String cpu;
    private final int ram;
    private final int storage;
    private final boolean graphicsCard;
    private final OS os;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.os = builder.os;
    }

    @Override
    public String toString() {
        return "Builder.Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", graphicsCard=" + graphicsCard +
                ", os=" + os +
                '}';
    }

    public static class Builder {
        private String cpu;
        private int ram;
        private int storage;
        private boolean graphicsCard;
        private OS os;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder ram(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder graphicsCard(boolean graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder os(OS os) {
            this.os = os;
            return this;
        }

        public Computer build() {
            if (cpu == null || ram <= 0 || storage <= 0 || os == null) {
                throw new IllegalStateException("Invalid computer configuration");
            }
            return new Computer(this);
        }
    }
}