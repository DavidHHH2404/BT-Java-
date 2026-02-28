package Bai4;

import java.util.Scanner;

public class DayofMonth {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tháng: ");
        int month = sc.nextInt();

        System.out.print("Nhập năm: ");
        int year = sc.nextInt();

        if (month < 1 || month > 12 || year <=0) {
            System.out.print("Dữ liệu đầu vào không hợp lệ");
        }

        int day = 0;

        switch (month)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;

            case 4: case 6: case 9: case 11:
                day = 30;
                break;

            case 2:
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    day = 29;
                    break;
                } else
                    day = 28;
                break;
        }

        System.out.print("Tháng " + month + " năm " + year + " có " + day + " ngày");
    }
}
