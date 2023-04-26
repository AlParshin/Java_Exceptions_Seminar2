package Java_Exceptions.Seminar_2;

import java.util.Arrays;

public class HomeTask_3 {
    public static void main(String[] args) throws Exception { // здесь throws Exception можно было бы и не писать...
        try {
            int a = 90;
            int b = 3;
            System.out.println((float) a / b);
            printSum(23, 234);
            int[] abc = { 1, 2, 3 };
            abc[3] = 9;
            printMas(abc);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void printMas(int[] massiv) {
        System.out.println(Arrays.toString(massiv));
    }

}
