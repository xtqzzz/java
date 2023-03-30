package Lesson2;

public class DZ {
    public static void main(String[] args) {

        byte b10 = 12;
        byte b2 = 0b1100;
        byte b8 = 014;
        byte b16 = 0xC;
        System.out.println(b10);
        System.out.println(b2);
        System.out.println(b8);
        System.out.println(b16);

        System.out.println();

        short c10 = 1300;
        short c2 = 0b010100010100;
        short c8 = 02424;
        short c16 = 0x514;
        System.out.println(c10);
        System.out.println(c2);
        System.out.println(c8);
        System.out.println(c16);

        System.out.println();

        int i10 = 0;
        int i2 = 0b0;
        int i8 = 00;
        int i16 = 0x0;
        System.out.println(i10);
        System.out.println(i2);
        System.out.println(i8);
        System.out.println(i16);

        System.out.println();

        long l10 = 123456789L;
        long l2 = 0b0111010110111100110100010101L;
        long l8 = 0726746425L;
        long l16 = 0x75bcd15L;
        System.out.println(l10);
        System.out.println(l2);
        System.out.println(l8);
        System.out.println(l16);

        System.out.println();

        float f1 = 123.4f;
        float f2 = 12.3f;
        double d1 = 32.1;
        double d2 = 32.5;
        boolean b1 = true;
        boolean b3 = false;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(b1);
        System.out.println(b3);

        System.out.println();

        char c1 = 'z';
        char c4 = 123;
        char c3 = '\u0123';
        System.out.println(c1);
        System.out.println(c4);
        System.out.println(c3);
    }
}
