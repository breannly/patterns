package org.example.creational.builder;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer1 = new ComputerBuilder()
                .setCPU("Intel i7")
                .setRAM(32)
                .setStorage(1000)
                .build();

        Computer computer2 = new ComputerBuilder()
                .setCPU("AMD Ryzen 9")
                .setGPU("AMD Radeon RX 6800 XT")
                .setRAM(64)
                .build();

        System.out.println(computer1);
        System.out.println(computer2);
    }
}
