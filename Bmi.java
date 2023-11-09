package com.example.commandensyu2;
import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("１人目の体重（kg）を入力してください: ");
        double weight = scanner.nextDouble();
        System.out.print("1人目の身長（m）を入力してください: ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("あなたのBMIは %.2f です。\n", bmi);

        System.out.print("2人目の体重（kg）を入力してください: ");
        double weight2 = scanner.nextDouble();
        System.out.print("2人目の身長（m）を入力してください: ");
        double height2 = scanner.nextDouble();
        double bmi2 = weight2 / (height2 * height2);
        System.out.printf("あなたのBMIは %.2f です。\n", bmi2);
    }
}
