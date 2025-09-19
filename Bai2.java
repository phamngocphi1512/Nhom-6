package baitaptuan3;

public class PersonalInfo {
    public static void main(String[] args) {
        String name = "Pham Ngoc Phi";
        int age = 20;
        double height = 1.75;
        boolean likeProgramming = true;

        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Chieu cao: " + height + "m");
        System.out.println("Thich lap trinh khong?: " + (likeProgramming ? "Co" : "Khong"));
    }
}