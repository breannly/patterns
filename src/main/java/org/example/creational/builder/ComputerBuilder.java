package org.example.creational.builder;

public class ComputerBuilder {

    private String CPU;
    private String GPU;
    private int RAM;
    private int storage;

    public ComputerBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    public ComputerBuilder setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }

    public ComputerBuilder setRAM(int RAM) {
        this.RAM = RAM;
        return this;
    }

    public ComputerBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public Computer build() {
        return new Computer(CPU, GPU, RAM, storage);
    }

}
