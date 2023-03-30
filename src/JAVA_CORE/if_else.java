package JAVA_CORE;

import java.io.IOException;

public class if_else {
    public static void main(String[] args) throws IOException {
        char ch, answer = 'B';
        System.out.println("Какую букву я загадал? ");
        System.out.print("Попытайтесь её угадать: ");

        ch = (char)System.in.read();

        if (ch == answer){                                 //if-else используем когда нам нужно произвести какую-то проверку
            System.out.println("Вы угадали букву!");
        } else if (ch > answer) {
            System.out.println("Перестарался");
        } else if (ch < answer) {
            System.out.println("Недостарался");
        }

    }
}
