package HW_1_3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        int[] arr1 = {1, 2, 3};

        while (a == 1) {
            Random random = new Random();
            int number = random.nextInt(10);
            System.out.println(number);
            System.out.println("У вас 3 попытки угадать число от нуля до девяти.");
            for (int j = 0; j < arr1.length; j++) {
                System.out.println("Попытка " + arr1[j] + " .");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите число: ");
                int newNumber = scanner.nextInt();
                int b = newNumber;
                if (b == number) {
                    System.out.println("Поздравляем, вы угадали!");
                    System.out.println("");
                    break;
                } else if (b < number) {
                    System.out.println("Загаданное число больше вашего.");
                } else if (b > number) {
                    System.out.println("Загаданное число меньше вашего.");
                }
            }
            System.out.println("Загаданное число было " + number);
            System.out.println("");
            System.out.println("Повторить игру ещё раз?");
            System.out.println("Для продолжения введите 1, для выхода введите 0.");
          Scanner scanner = new Scanner(System.in);
          a = scanner.nextInt();
          while (a>1) {
              a = scanner.nextInt();
          }
            if (a == 0) break;
        }
    }
}
