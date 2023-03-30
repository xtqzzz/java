package Lesson5_Methods;

class test20{
    int summa(int a, int b, int c){
        int result = a + b + c;
        return result;
    }
}

class test21{
    public static void main(String[]args){
    test20 t = new test20();
    int summaChisel = t.summa(100,5,323);
        System.out.println(summaChisel);


    }
}
