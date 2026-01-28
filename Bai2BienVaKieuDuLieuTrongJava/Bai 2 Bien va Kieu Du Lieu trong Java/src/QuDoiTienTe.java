import java.util.Scanner;
public class QuDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double RATE_USD = 23500;
        final double RATE_EUR = 27000;

        System.out.println("--- CHƯƠNG TRÌNH QUY ĐỔI TIỀN TỆ ---");
        System.out.println("1. Đổi USD sang VND");
        System.out.println("2. Đổi EUR sang VND");
        System.out.print("Mời bạn chọn loại tiền tệ (1 hoặc 2): ");
        int luaChon = sc.nextInt();

        System.out.print("Nhập số tiền ngoại tệ muốn đổi: ");
        double soTien = sc.nextDouble();

        double tienVND = 0;
        boolean nhapDung = true;

        switch (luaChon) {
            case 1:
                tienVND = soTien * RATE_USD;
                System.out.println("Đang quy đổi USD -> VND...");
                break;
            case 2:
                tienVND = soTien * RATE_EUR;
                System.out.println("Đang quy đổi EUR -> VND...");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                nhapDung = false;
        }

        if (nhapDung) {
            System.out.printf("Số tiền quy đổi là: %,.0f VND\n", tienVND);
        }

        sc.close();
    }
}
