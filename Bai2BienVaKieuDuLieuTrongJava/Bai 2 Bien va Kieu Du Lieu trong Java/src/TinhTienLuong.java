import java.util.Scanner;
public class TinhTienLuong {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        // 1. Nhập dữ liệu
        System.out.print("Nhập số giờ làm việc: ");
        double soGioLam = sc.nextDouble();

        System.out.print("Nhập lương mỗi giờ: ");
        double luongMoiGio = sc.nextDouble();

        double tongLuong;

        // 2. Logic tính lương
        if (soGioLam <= 40) {
            // Trường hợp làm việc bình thường
            tongLuong = soGioLam * luongMoiGio;
        } else {
            // Trường hợp có làm thêm giờ (overtime)
            double gioChuan = 40;
            double gioVuot = soGioLam - 40;

            // Công thức: Lương 40h đầu + Lương giờ vượt (nhân hệ số 1.5)
            tongLuong = (gioChuan * luongMoiGio) + (gioVuot * luongMoiGio * 1.5);
        }

        // 3. Xuất kết quả
        System.out.println("-------------------------------");
        System.out.printf("Tổng tiền lương nhận được: %,.2f VNĐ\n", tongLuong);

        sc.close();
    }
}
