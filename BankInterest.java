import java.util.Scanner;
public class BankInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tien gui (VND): ");
        double tienGui = scanner.nextDouble();
        System.out.print("Nhap lai suat hang nam (%): ");
        double laiSuatNam = scanner.nextDouble();
        System.out.print("Nhap so thang gui: ");
        int soThang = scanner.nextInt();
        double laiSuatThang = laiSuatNam / 100 / 12;
        double tienLai = tienGui * laiSuatThang * soThang;
        double tongTien = tienGui + tienLai;
        System.out.printf("Tien lai: %.2f VND%n", tienLai);
        System.out.printf("Tong tien goc va lai: %.2f VND%n", tongTien);
        scanner.close();
    }
}