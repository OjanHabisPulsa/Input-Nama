import java.util.Scanner;

public class LatihanInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, nim, ps;

        System.out.println("==========Input==========");
        System.out.print("Nama: ");
        nama = input.nextLine();

        System.out.print("NIM: ");
        nim = input.nextLine();

        System.out.print("Program Studi: ");
        ps = input.nextLine();

        System.out.println("==========Output==========");
        System.out.println("Hi " + nama + ", Anda terdaftar dengan NIM: " + nim + " di Program Studi " + ps);


    }
}
