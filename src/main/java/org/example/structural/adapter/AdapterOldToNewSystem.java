package org.example.structural.adapter;

public class AdapterOldToNewSystem implements NewSystem {

    private final OldSystem oldSystem;

    public AdapterOldToNewSystem(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public void doNewWork() {
        oldSystem.doOldWork();
    }
}
