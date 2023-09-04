package org.example.behavioral.memento;

public class TextEditorCaretaker {

    private TextEditorMemento memento;

    public void saveMemento(TextEditorMemento memento) {
        this.memento = memento;
    }

    public TextEditorMemento getMemento() {
        return memento;
    }
}
