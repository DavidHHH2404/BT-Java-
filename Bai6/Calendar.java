package Bai6;

import java.util.Scanner;

public class Calendar {

    public static boolean laNamNhuan(int nam) {
        return (nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0);
    }

    public static int laySoNgayTrongThang(int thang, int nam) {
        switch (thang) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return laNamNhuan(nam) ? 29 : 28;
            default:
                return 31;
        }
    }

    public static int layThuNgayDauNam(int nam) {
        int soNamTruoc = nam - 1;
        int tongSoNgay = soNamTruoc * 365 + soNamTruoc / 4 - soNamTruoc / 100 + soNamTruoc / 400;

        return (tongSoNgay + 1) % 7;
    }

    public static void inLichCuaNam(int nam) {
        int thuHienTai = layThuNgayDauNam(nam);

        for (int thang = 1; thang <= 12; thang++) {
            int soNgay = laySoNgayTrongThang(thang, nam);

            System.out.println("\n============ THÁNG " + thang + " ============");
            System.out.println(" CN  T2  T3  T4  T5  T6  T7");

            for (int i = 0; i < thuHienTai; i++) {
                System.out.print("    ");
            }

            for (int ngay = 1; ngay <= soNgay; ngay++) {
                System.out.printf("%3d ", ngay);

                thuHienTai = (thuHienTai + 1) % 7;

                if (thuHienTai == 0) {
                    System.out.println();
                }
            }

            if (thuHienTai != 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập năm in lịch: ");
        int nam = sc.nextInt();

        System.out.println("\nLỊCH NĂM " + nam);
        inLichCuaNam(nam);

        sc.close();
    }
}
