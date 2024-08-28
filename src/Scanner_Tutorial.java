import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * \n - переход на новую строку
 * %d - целочисоенные
 * %x - шестнадцатиричные
 * %f - с плавающей точкой
 * %c - для одиночного символа
 * %s - для строковых значений
 */

public class Scanner_Tutorial {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Hi, %s!\n", name);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.printf("Now: %s", LocalDateTime.now().format(dtf));
        iScanner.close();
    }
}