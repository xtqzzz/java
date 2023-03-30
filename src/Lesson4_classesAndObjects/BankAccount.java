package Lesson4_classesAndObjects;

public class BankAccount { // Любой класс - это тип данных

        int id;
        String name;
        double balance;

    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount(); // с помощью конструктора создаём объект
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Никита";
        MyAccount.balance = 100000;

        YourAccount.id = 2;
        YourAccount.name = "Саша";
        YourAccount.balance = 1;

        HisAccount.id = 3;
        HisAccount.name = "Егор";


        System.out.println(MyAccount.id);
        System.out.println(HisAccount.id); // Я не задавал значение этой переменной, по дефолту 0, а у рефер - null

    }
}


