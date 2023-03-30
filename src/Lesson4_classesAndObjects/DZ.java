package Lesson4_classesAndObjects;

public class DZ {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.studentIdNumber = 1;
        student1.name = "Никита";
        student1.secondName = "Костюков";
        student1.yearOfStudy = 2017;
        student1.avgMath = 7.1;
        student1.avgEconomy = 6.8;
        student1.avgLang = 9.0;

        student2.studentIdNumber = 2;
        student2.name = "Иван";
        student2.secondName = "Иванов";
        student2.yearOfStudy = 2017;
        student2.avgMath = 7.0;
        student2.avgEconomy = 5.4;
        student2.avgLang = 7.5;

        student3.studentIdNumber = 3;
        student3.name = "Пётр";
        student3.secondName = "Петров";
        student3.yearOfStudy = 2017;
        student3.avgMath = 8.2;
        student3.avgEconomy = 7.4;
        student3.avgLang = 6.9;

        double avg1 = (student1.avgEconomy + student1.avgMath + student1.avgLang) / 3;
        double avg2 = (student2.avgEconomy + student2.avgMath + student2.avgLang) / 3;
        double avg3 = (student3.avgEconomy + student3.avgMath + student3.avgLang) / 3;

        System.out.println("Средняя оценка студента " + student1.name + " " + student1.secondName + " ровна " + avg1);
        System.out.println("Средняя оценка студента " + student2.name + " " + student2.secondName + " ровна " + avg2);
        System.out.println("Средняя оценка студента " + student3.name + " " + student3.secondName + " ровна " + avg3);
    }
}
class Student{
    int studentIdNumber;
    String name;
    String secondName;
    int yearOfStudy;
    double avgMath;
    double avgEconomy;
    double avgLang;

}