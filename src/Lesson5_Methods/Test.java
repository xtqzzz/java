package Lesson5_Methods;

public class Test {
    public static void main(String[] args) {        //public - acces midifier, static - non-acces modifier(s)
                                                    //void - return type, main - name, (String[] args) - parameters(s), {} - body
    summa t = new summa();                          // 5. Создаём объект класса summa
    t.sum(1,2,3);                          // 6. Вызов функции
    int summa_chisel = t.sum(5,5,5);       // 7. Связываем объект с функцией(чтобы подтянулись параметры), прописываем аргументы
        System.out.println(summa_chisel);           // 8. Вывод на экран

    }
}


class summa {                                        // 1. Создали класс для функции
    int sum(int a, int b, int c) {                   // 2. Создали функцию, прописали в ней параметры
        int result = a + b + c;                      // 3. Прописали что с параметрами нужно сделать
        return result;                               // 4. Вернули функцию
    }
}
