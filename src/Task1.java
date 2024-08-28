import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральную степень k: ");
        int k = scanner.nextInt();

        // Генерируем список коэффициентов
        Random random = new Random();
        int[] coefficients = new int[k + 1];
        for (int i = 0; i < coefficients.length; i++) {
            coefficients[i] = random.nextInt(101);
        }

        // Записываем коэффициенты в файл
        try (FileWriter fileWriter = new FileWriter("polynomial.txt")) {
            for (int i = coefficients.length - 1; i >= 0; i--) {
                if (i == 0) {
                    fileWriter.write(coefficients[i] + " = 0");
                } else if (i == 1) {
                    fileWriter.write(coefficients[i] + "x + ");
                } else {
                    fileWriter.write(coefficients[i] + "x^" + i + " + ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}