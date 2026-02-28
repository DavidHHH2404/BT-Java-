package Bai5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayManage {

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> daySo = new ArrayList<>();
        int luaChon;

        System.out.println("\n====== QUẢN LÝ DÃY SỐ NGUYÊN ======");
        System.out.println("1. Nhập dãy số");
        System.out.println("2. Xuất dãy số");
        System.out.println("3. Thêm một số vào dãy");
        System.out.println("4. Xóa một số trong dãy");
        System.out.println("5. Sửa một số trong dãy");
        System.out.println("6. Sắp xếp dãy số tăng dần");
        System.out.println("7. Tính giá trị trung bình và tìm phần tử gần mức trung bình nhất");
        System.out.println("0. Thoát chương trình");
        System.out.println("===================================");

        do {

            System.out.print("\nChọn chức năng (0-7): ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    System.out.print("Số phần tử n = ");
                    int n = scanner.nextInt();
                    daySo.clear();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                        daySo.add(scanner.nextInt());
                    }
                    break;

                case 2:
                    System.out.println("Dãy số đã nhập: " + daySo);
                    break;

                case 3:
                    System.out.print("Nhập giá trị số muốn thêm: ");
                    int soMoi = scanner.nextInt();
                    daySo.add(soMoi);
                    System.out.println("Đã thêm thành công!");
                    break;

                case 4:
                    if (daySo.isEmpty()) {
                        System.out.println("Dãy số trống");
                        break;
                    }
                    System.out.print("Nhập vị trí muốn xóa (0 đến " + (daySo.size() - 1) + "): ");
                    int viTriXoa = scanner.nextInt();
                    if (viTriXoa >= 0 && viTriXoa < daySo.size()) {
                        daySo.remove(viTriXoa);
                        System.out.println("Đã xóa thành công!");
                    } else {
                        System.out.println("Vị trí không hợp lệ!");
                    }
                    break;

                case 5:
                    if (daySo.isEmpty()) {
                        System.out.println("Dãy số trống");
                        break;
                    }
                    System.out.print("Nhập vị trí muốn sửa (0 đến " + (daySo.size() - 1) + "): ");
                    int viTriSua = scanner.nextInt();
                    if (viTriSua >= 0 && viTriSua < daySo.size()) {
                        System.out.print("Nhập giá trị mới: ");
                        int giaTriMoi = scanner.nextInt();
                        daySo.set(viTriSua, giaTriMoi);
                        System.out.println("Đã sửa thành công!");
                    } else {
                        System.out.println("Vị trí không hợp lệ!");
                    }
                    break;

                case 6:
                    if (daySo.isEmpty()) {
                        System.out.println("Dãy số trống");
                    } else {
                        Collections.sort(daySo);
                        System.out.println("Đã sắp xếp dãy số tăng dần! (Chọn mục 2 để xem lại)");
                    }
                    break;

                case 7:
                    if (daySo.isEmpty()) {
                        System.out.println("Dãy số trống");
                        break;
                    }

                    double tong = 0;
                    for (int so : daySo) {
                        tong += so;
                    }
                    double trungBinh = tong / daySo.size();

                    int phanTuGanNhat = daySo.get(0);
                    double khoangCachMin = Math.abs(phanTuGanNhat - trungBinh);

                    for (int so : daySo) {
                        double khoangCach = Math.abs(so - trungBinh);
                        if (khoangCach < khoangCachMin) {
                            khoangCachMin = khoangCach;
                            phanTuGanNhat = so;
                        }
                    }

                    System.out.printf("Giá trị trung bình của dãy: %.2f\n", trungBinh);
                    System.out.println("Phần tử gần giá trị trung bình nhất là: " + phanTuGanNhat);
                    break;

                case 0:
                    System.out.println("Thoát chương trình");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
                    break;
            }
        } while (luaChon != 0);

        scanner.close();
    }
}