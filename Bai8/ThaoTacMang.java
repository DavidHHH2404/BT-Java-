package Bai8;
import java.util.Scanner;
import java.util.Arrays;

public class ThaoTacMang {
    public static int[] nhapMang(Scanner sc, int n) {
        int[] mang = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            mang[i] = sc.nextInt();
        }
        return mang;
    }

    public static void xuatMang(int[] mang) {
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println();
    }

    public static void demChanLe(int[] mang) {
        int soChan = 0;
        int soLe = 0;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] % 2 == 0) {
                soChan++;
            } else {
                soLe++;
            }
        }
        System.out.println("- Số lượng phần tử chẵn: " + soChan);
        System.out.println("- Số lượng phần tử lẻ: " + soLe);
    }

    public static void tinhTrungBinh(int[] mang) {
        if (mang.length == 0) return;

        double tong = 0;
        for (int i = 0; i < mang.length; i++) {
            tong += mang[i];
        }
        double trungBinh = tong / mang.length;
        System.out.printf("- Giá trị trung bình của mảng: %.2f\n", trungBinh);
    }

    public static void timMaxMin(int[] mang) {
        if (mang.length == 0) return;

        int max = mang[0];
        int min = mang[0];

        for (int i = 1; i < mang.length; i++) {
            if (mang[i] > max) {
                max = mang[i];
            }
            if (mang[i] < min) {
                min = mang[i];
            }
        }
        System.out.println("- Phần tử lớn nhất: " + max);
        System.out.println("- Phần tử nhỏ nhất: " + min);
    }

    public static void xuatNguoc(int[] mang) {
        System.out.print("- Mảng xuất theo chiều ngược lại: ");

        for (int i = mang.length - 1; i >= 0; i--) {
            System.out.print(mang[i] + " ");
        }
        System.out.println();
    }


    public static void sapXepVaXuat(int[] mang) {
        //Copy để không làm thay đổi mảng gốc
        int[] mangDaSapXep = Arrays.copyOf(mang, mang.length);

        Arrays.sort(mangDaSapXep);

        System.out.print("- Mảng sau khi sắp xếp tăng dần:  ");
        xuatMang(mangDaSapXep);
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử n: ");
        int n = sc.nextInt();

        int[] mangSoNguyen = nhapMang(sc, n);

        System.out.println("\n============= KẾT QUẢ =============");
        System.out.print("- Mảng ban đầu : ");
        xuatMang(mangSoNguyen);

        demChanLe(mangSoNguyen);
        tinhTrungBinh(mangSoNguyen);
        timMaxMin(mangSoNguyen);
        xuatNguoc(mangSoNguyen);
        sapXepVaXuat(mangSoNguyen);
        System.out.println("===================================");

        sc.close();
    }
}

