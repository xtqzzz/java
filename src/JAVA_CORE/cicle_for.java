package JAVA_CORE;

public class cicle_for {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {                        // ЕСЛИ ЗНАЕМ ТОЧНО КОЛИЧЕСТВО ИТЕРАЦИЙ - ИСПОЛЬЗУЕМ FOR
            System.out.println("Итерация" + i);
        }
        /*
        int i;
        i = 0;
        for(; i < 5; ){
            System.out.println("Итерация" + i); Тоже самое, но менее читаемое
        }
         */
    }
}