import java.util.Scanner;
public class Bai7Tuan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mang = {2, 5, 8, 3, 9, 1, 7, 4, 6};
        System.out.println("Mang co san:");
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i] + " ");
        }
        int tong = 0;
        for (int i = 0; i < mang.length; i++) {
            tong += mang[i];
        }
        System.out.println("\nTong cac phan tu trong mang: " + tong);
        
        scanner.close();
    }
}