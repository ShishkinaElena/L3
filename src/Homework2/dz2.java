package Homework2;

import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {

        /*Д/з: Необходимо написать простой консольный калькулятор на Java.
        Для считывания ввода нужно использовать класс Scanner.
        В конце напечатать результат. Используйте форматированный вывод.
        Пока пусть работает так, пользователь вводит целые числа,
         а на вывод передается результат 4-х операций(+, -, *, /) без выбора операции.
         В дальнейшем будете дорабатывать приложение.   */

        Scanner scanner= new Scanner(System.in);

        System.out.print("Input number 1: "); // число 1
        long num = scanner.nextLong();
        System.out.print("Input number 2: "); // число 2
        long number = scanner.nextLong();
        long a =num+number;
        long b=num-number;
        long c =num*number;
        double d=(double)num/number;
        scanner.nextLine();

        System.out.printf("Результат сложения: %d\nРезультат вычетания: %d\nРезультат умножения: %d\nРезультат деления %.10f\n" , a, b, c, d);

        scanner.close();
    }
}
