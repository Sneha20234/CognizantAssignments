 class Computer {
    // Required parameters
    private String CPU;
    private String RAM;
    private String storage;

    // Optional parameters
    private boolean hasGraphicsCard;
    private boolean hasBluetooth;

    // Private constructor to accept Builder instance
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasBluetooth = builder.hasBluetooth;
    }

    // Static nested Builder class
    public static class Builder {
        // Required parameters
        private String CPU;
        private String RAM;
        private String storage;

        // Optional parameters with default values
        private boolean hasGraphicsCard = false;
        private boolean hasBluetooth = false;

        // Constructor for required parameters
        public Builder(String CPU, String RAM, String storage) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.storage = storage;
        }

        // Setter methods for optional parameters
        public Builder setGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Builder setBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        // Build method to return instance of Computer
        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage 
               + ", hasGraphicsCard=" + hasGraphicsCard + ", hasBluetooth=" + hasBluetooth + "]";
    }
}

public class Builder_Pattern {
    public static void main(String[] args) {
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB", "1TB SSD")
                                .setGraphicsCard(true)
                                .setBluetooth(true)
                                .build();

        Computer officeComputer = new Computer.Builder("Intel i5", "16GB", "512GB SSD")
                                .setBluetooth(true)
                                .build();

        System.out.println(gamingComputer);
        System.out.println(officeComputer);
    }
}
