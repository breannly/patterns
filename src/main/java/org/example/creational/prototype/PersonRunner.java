package org.example.creational.prototype;

public class PersonRunner {
    public static void main(String[] args) {

        Person person = new Person("Breannly");
        Person copiedPerson = (Person) person.copy();

        System.out.println(person);
        System.out.println(person.hashCode());
        System.out.println(copiedPerson);
        System.out.println(copiedPerson.hashCode());
    }
}
