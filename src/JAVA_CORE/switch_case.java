package JAVA_CORE;

import java.io.IOException;

public class switch_case {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите номер месяца: ");
        int month = System.in.read();

        String monthString;
        switch (month) {                      //switch-case используем тогда, когда мы знаем какие могут быть варианты ответа
            case 1: monthString = "Январь";
                break;
            case 2: monthString = "Февраль";
                break;
            case 3: monthString = "Март";
                break;
            case 4: monthString = "Апрель";
                break;
            case 5: monthString = "Май";
                break;
            case 6: monthString = "Июнь";
                break;
            case 7: monthString = "Июль";
                break;
            case 8: monthString = "Август";
                break;
            case 9: monthString = "Сентябрь";
                break;
            case 10: monthString = "Октябрь";
                break;
            case 11: monthString = "Ноябрь";
                break;
            case 12: monthString = "Декабрь";
                break;
            default: monthString = "Не знаем такого";
            break;
        }

        System.out.println(monthString);
    }
}
