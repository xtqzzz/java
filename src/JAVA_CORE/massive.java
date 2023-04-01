package JAVA_CORE;

public class massive {
    public static void main(String[] args) {
        int num1 = 1;  // Массив - переменная, в которой находится определенное или неопределённое количество данных
        int num2 = 1;
        int num3 = 1;
        int num4 = 1;
        int num5 = 1;

        // int[] nums = {1, 2, 3, 4, 5}; У переменных в массиве нету имени, только индекс
        //////////////0  1  2  3  4

        int[] nums = new int[4];
        for(int i = 0; i < 4; i++) {
            nums[i] = i;
        }

        nums[3] = 100; // 3 элементу присвоили значение 100

        for (int e :nums) {        // ЦИКЛ for each. Он удобнее, так как не создаём лишнюю переменную для цикла
            System.out.println();  // и не обращаемся к массиву через индекс
        }

        for(int i = 0; i < 4; i++) {
            System.out.println("Элемент [" + i + "]" +nums[i]);
        }

        //////////////////////////////// МНОГОМЕРНЫЙ МАССИВ ////////////////////////////////////////

        int table[][] = new int[3][4];
        table[0] = new int[4];
        table[1] = new int[4];


    }
}
