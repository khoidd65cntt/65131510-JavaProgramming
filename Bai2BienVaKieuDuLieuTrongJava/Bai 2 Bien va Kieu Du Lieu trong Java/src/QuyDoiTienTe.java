public class QuyDoiTienTe {
    public static void main(String[] args) {
        // Gán giá trị trực tiếp
        int luaChon = 1; // Giả sử chọn 1 là USD, 2 là EUR
        double soTien = 100; // Số tiền ngoại tệ cần đổi

        final double RATE_USD = 23500;
        final double RATE_EUR = 27000;

        double tienVND = 0;
        boolean hopLe = true;

        switch (luaChon) {
            case 1:
                tienVND = soTien * RATE_USD;
                System.out.println("Quy đổi: USD -> VND");
                break;
            case 2:
                tienVND = soTien * RATE_EUR;
                System.out.println("Quy đổi: EUR -> VND");
                break;
            default:
                System.out.println("Lựa chọn sai");
                hopLe = false;
        }

        if (hopLe) {
            System.out.printf("Kết quả: %,.0f VNĐ\n", tienVND);
        }
    }
}