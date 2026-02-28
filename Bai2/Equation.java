package Bai2;

import java.util.Scanner;

public class Equation
{
    public static void Solve(double a, double b, double c)
    {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.print("Phuong trinh vo so nghiem");
                }
                else {
                    System.out.print("Phuong trinh vo nghiem");
                }
            }
            else {
                System.out.print("Phuong trinh co nghiem x = " + (-c/b));
            }
        }
        else {
            double delta = b*b - 4*a*c;

            if (delta < 0) {
                System.out.print("Phuong trinh vo nghiem");
            }
            else if (delta == 0) {
                System.out.print("Phuong trinh co nghiem x = " + ( -b / (2*a) ));
            }
            else {
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.println("Phuong trinh co 2 nghiem phan biet");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }

    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("--Dinh dang phuong trinh ax^2 + bx + c = 0");

        System.out.print("Nhap a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap b: ");
        double b = sc.nextDouble();

        System.out.print("Nhap c: ");
        double c = sc.nextDouble();

        Solve(a,b,c);

        sc.close();
    }
}