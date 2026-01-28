public class TinhTienLuong {
    public static void main(String[] args) {
        // Gán giá trị trực tiếp
        double soGioLam = 208;
        double luongMoiGio = 35000;

        double tongLuong;

        if (soGioLam <= 40) {
            tongLuong = soGioLam * luongMoiGio;
        } else {
            double gioChuan = 40;
            double gioVuot = soGioLam - 40;
            tongLuong = (gioChuan * luongMoiGio) + (gioVuot * luongMoiGio * 1.5);
        }

        System.out.printf("Tổng tiền lương: %,.0f VNĐ\n", tongLuong);
    }
}