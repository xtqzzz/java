package Lesson4_classesAndObjects;

public class Car {
    String color = "red"; // instance variables
    String engine = "v6"; // instance variables

    public static void main(String[] args) {
        Car fiat = new Car(); // ссылочный объект с конструктором
        fiat.color = "green";
        System.out.println("Цвет фиата: " + fiat.color);
    }
}
