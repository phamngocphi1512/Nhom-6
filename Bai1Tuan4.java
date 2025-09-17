import java.util.Scanner;
public class Bai1Tuan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra: ");
        double so = scanner.nextDouble();
        if (so > 0) {
            System.out.println(so + " la so duong");
        } else if (so < 0) {
            System.out.println(so + " la so am");
        } else {
            System.out.println(so + " bang 0");
        }
        scanner.close();
    }
}