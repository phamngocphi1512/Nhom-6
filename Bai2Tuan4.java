import java.util.Scanner;
public class Bai2Tuan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Nhap so a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap so b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap so c: ");
        double c = scanner.nextDouble();
        double min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("So nho nhat trong ba so la: " + min);
        scanner.close();
    }
}