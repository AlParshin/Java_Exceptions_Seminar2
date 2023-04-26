package Java_Exceptions.Seminar_2;

public class HomeTask_2 {
    public static void main(String[] args) {
        int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            catchedRes1 = (float) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("ДЕЛЕНИЕ НА НОЛЬ!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ИНДЕКС ЗА ГРАНИЦАМИ МАССИВА!");
        }
    }
}
