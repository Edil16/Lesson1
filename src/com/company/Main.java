package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String задание = "word55";
        final int NUM = 55;
        String word = "word";
        System.out.println(задание+" " + NUM+ " " + word);
        if (NUM > 0) {
            System.out.println("вы сохранили положительное число"); //print показывает на той же строке
        } else if (NUM < 0) {
            System.out.println("вы сохранили отрицательное число");
        } else if (NUM == 0) {
            System.out.println("вы сохранили ноль");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("здраствуйте " + name);

    }
}
