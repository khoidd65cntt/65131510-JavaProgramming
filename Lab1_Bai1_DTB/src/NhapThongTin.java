import java.util.Scanner;

public class NhapThongTin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = scanner.nextLine();

        System.out.print("Nhập điểm trung bình: ");
        double diemTrungBinh = scanner.nextDouble();

        System.out.println("---------------------------------");
        System.out.println("THÔNG TIN SINH VIÊN:");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Điểm trung bình: " + diemTrungBinh);

        scanner.close();
    }
}
