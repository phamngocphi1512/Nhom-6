package baitaptuan3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int a = scanner.nextInt();
        System.out.print("Nhap so thu hai: ");
        int b = scanner.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (double) a / b;
        int remainder = a % b;

        System.out.println("Tong: " + sum);
        System.out.println("Hieu: " + difference);
        System.out.println("Tich: " + product);
        System.out.println("Thuong: " + quotient);
        System.out.println("Phan du: " + remainder);
        scanner.close();
    }
}