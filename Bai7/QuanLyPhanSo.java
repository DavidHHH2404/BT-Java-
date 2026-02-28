package Bai7;
import java.util.Scanner;
class PhanSo
{
    private int tuSo;
    private int mauSo;

    public PhanSo() {
        tuSo = 0;
        mauSo = 1;
    }

    public void Nhap(Scanner sc) {
        System.out.print("  Nhập tử số: ");
        this.tuSo = sc.nextInt();

        do {
            System.out.print("  Nhập mẫu số (khác 0): ");
            this.mauSo = sc.nextInt();
            if (this.mauSo == 0) {
                System.out.println("Mẫu số phải khác 0. Nhập lại");
            }
        } while (this.mauSo == 0);

        if (this.mauSo < 0) {
            this.tuSo = -this.tuSo;
            this.mauSo = -this.mauSo;
        }
    }

    public double tinhGiaTri() {
        return (double) this.tuSo / this.mauSo;
    }


    public void Xuat() {
        System.out.print(this.tuSo + "/" + this.mauSo);
    }
}
public class QuanLyPhanSo {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Số lương phân số n = ");
        int n = sc.nextInt();

        PhanSo[] mangPs = new PhanSo[n];

        System.out.println("--Nhập mảng--");
        for (int i = 0; i < n; i++)
        {
            System.out.println("Nhập phân số thứ " + (i + 1) + ":");
            mangPs[i] = new PhanSo();
            mangPs[i].Nhap(sc);
        }

        PhanSo min = mangPs[0];
        PhanSo max = mangPs[0];

        for (int i = 1; i < n; i++) {
            if (mangPs[i].tinhGiaTri() < min.tinhGiaTri()) {
                min = mangPs[i];
            }
            if (mangPs[i].tinhGiaTri() > max.tinhGiaTri()) {
                max = mangPs[i];
            }
        }

        System.out.print("Danh sách mảng phân số vừa nhập: ");
        for (int i = 0; i < n; i++) {
            mangPs[i].Xuat();
            System.out.print("   ");
        }

        System.out.print("\nPhân số nhỏ nhất là: ");
        min.Xuat();

        System.out.print("\nPhân số lớn nhất là: ");
        max.Xuat();
        System.out.println();

        sc.close();
    }
}
