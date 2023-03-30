package Lesson5_Methods;

public class Car2 {
    String color;
    String engine;
    int speed;

    int gaz(int skorost){
        speed = speed + skorost;
        return speed;
    }

    int tormoz(int skorost){
        speed = speed - skorost;
        return speed;
    }

    void showInfo(){
        System.out.println("цвет " + color + " мотор: " + engine + " скорость " + speed);
    }
}
class car2Test{
public static void main(String[]args){
        Car2 c1 = new Car2();
        c1.color = "white";
        c1.engine = "v6";
        c1.speed = 60;

        c1.showInfo();
    }
}
