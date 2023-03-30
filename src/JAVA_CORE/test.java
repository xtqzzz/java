package JAVA_CORE;

import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        System.out.println("Здравствуйте. Введите число от 1 до 10: ");
        Scanner myObj = new Scanner(System.in);
        while (true) {
            try {
                Integer number = Integer.valueOf(myObj.nextLine());
                if (number > 0 && number < 5) {
                    System.out.println("Привет");
                    break;
                } else if (number > 4 && number < 11) {
                    System.out.println("Пока");
                    break;
                } else System.out.println("Попробуйте ещё раз");
            } catch (Exception e) {
                System.out.println("Допустимый диапазон 1-10, повторите попытку ");
            }
        }
    }
}
