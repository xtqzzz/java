package Lesson4_classesAndObjects;

public class Person {
    public static void main(String[] args) {
        PersonClass person1 = new PersonClass();
        PersonClass person2 = new PersonClass();

        person1.name = "Никита";
        person1.height = 188;
        person1.weight = 84.5;

        person2.name = "Саша";
        person2.height = 160;
        person2.weight = 63.4;

        System.out.println("Имя - " + person1.name + ", рост - " + person1.height + "см, вес - " + person1.weight + "кг");
        System.out.println("Имя - " + person2.name + ", рост - " + person2.height + "см, вес - " + person2.weight + "кг");
    }

}
class PersonClass {
    String name;
    int height;
    double weight;
}