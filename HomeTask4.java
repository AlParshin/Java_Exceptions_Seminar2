// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package Java_Exceptions.Seminar_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask4 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            System.out.println("Введите строку: ");
            s = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                reader.close();
                System.out.println("Введенная нами строка: ");
                System.out.println(s);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        if (s.equals("")) {
            throw new Exception("Строка не может быть пустой!");
        }
    }
}