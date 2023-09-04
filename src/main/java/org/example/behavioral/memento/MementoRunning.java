package org.example.behavioral.memento;

public class MementoRunning {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        TextEditorCaretaker caretaker = new TextEditorCaretaker();

        textEditor.setText("First version of text");
        System.out.println("Text before saving: " + textEditor.getText());

        caretaker.saveMemento(textEditor.save());

        textEditor.setText("new text");
        System.out.println("Updated text: " + textEditor.getText());

        textEditor.restore(caretaker.getMemento());
        System.out.println("Text before restoring: " + textEditor.getText());
    }

}
