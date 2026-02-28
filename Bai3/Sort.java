package Bai3;

import java.util.Scanner;
import java.util.Arrays;

public class Sort
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

       System.out.print("Nhập số lượng phần tử n = ");
       int n = sc.nextInt();

       int[] array = new int[n];

       System.out.println("Nhập giá trị các phần tử");
       for (int i = 0; i < n; i++)
       {
           System.out.print("Phần tử thứ " + (i + 1) + ": ");
           array[i] = sc.nextInt();
       }

       for (int i = 0; i < n -1; i++) {
           for (int j = 0; j < n - i - 1; j++) {
               if (array[j] > array[j+1]) {
                   int tam = array[j];
                   array[j] = array[j+1];
                   array[j+1] = tam;
               }
           }
       }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
