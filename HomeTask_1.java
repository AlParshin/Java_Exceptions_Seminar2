// Реализуйте метод, который запрашивает у пользователя ввод дробного числа
// (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо
// этого, необходимо повторно запросить у пользователя ввод данных.

package Java_Exceptions.Seminar_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeTask_1 {
    public static void main(String[] args) {
        float N;
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Введите число: ");
                N = input.nextFloat();
                input.close();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели число типа не FLOAT! Введите еще раз через запятую в формате ***,***");
                continue;
            }
        }
        System.out.println("Вот теперь все прекрасно, число является FLOAT");
        System.out.println(N);
    }
}