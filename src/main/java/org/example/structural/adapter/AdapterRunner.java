package org.example.structural.adapter;

public class AdapterRunner {
    public static void main(String[] args) {
        OldSystem oldSystem = new OldSystem();
        AdapterOldToNewSystem adapter = new AdapterOldToNewSystem(oldSystem);

        adapter.doNewWork();
    }
}
