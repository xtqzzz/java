package JAVA_CORE;

public class cicle_do_while {
    public static void main(String[] args) {

        int count = 10;

        do {                               //Один раз итерация цикла пройдёт в любом случае
            System.out.println(count);
            count++;
        }   while (count < 10);

    }
}
