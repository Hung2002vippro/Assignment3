
package assignment3;

import java.util.Scanner;


public class Assignment3 {

    public static void ptb1(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh bac 1 = " + x);
        }
    }

    public static void ptb2(double a, double b, double c) {
        if (a == 0) {
            ptb1(b, c);
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong tirnh vo nghiem");
            }
            else if (delta == 0)
            {
               double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: x = " + x);

            }
            else{
                    double x1=(-b + Math.sqrt(delta))/(2*a);
                    double x2=(-b - Math.sqrt(delta))/(2*a);
                    System.out.println("Phuong trinh co 2 nghiem phan biet:");
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chon phuong trinh:");
        System.out.println("1.Phuong trinh bac 1");
        System.out.println("2.Phuong trinh bac 2");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Nhap a:");
                double a1 = scanner.nextDouble();
                System.out.println("Nhap b:");
                double b1 = scanner.nextDouble();
                ptb1(a1,b1);
                break;
            case 2:
                System.out.println("Nhap a:");
                double a2 = scanner.nextDouble();
                System.out.println("Nhap b:");
                double b2 = scanner.nextDouble();
                System.out.println("Nhap c:");
                double c2 = scanner.nextDouble();
                ptb2(a2,b2,c2);
                break;
        }
        scanner.close();
    }
}
