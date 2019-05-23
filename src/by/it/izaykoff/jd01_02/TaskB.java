package by.it.izaykoff.jd01_02;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        step1();

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        step2(month);

        double a =sc.nextDouble();
        double b =sc.nextDouble();
        double c =sc.nextDouble();
        step3(a,b,c);

    }

    private static void step1(){
        int[] mas = new int[25];
        int j = 1;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = j;
            if (j % 5 == 0) {
                System.out.println(mas[i]);
            } else
                System.out.print(mas[i] + " ");
            ++j;
        }

    }

    private static void step2(int month){
        switch (month) {
            case 1: {
                System.out.println("январь");
                break;
            }
            case 2: {
                System.out.println("февраль");
                break;
            }
            case 3: {
                System.out.println("март");
                break;
            }
            case 4: {
                System.out.println("апрель");
                break;
            }
            case 5: {
                System.out.println("май");
                break;
            }
            case 6: {
                System.out.println("июнь");
                break;
            }
            case 7: {
                System.out.println("июль");
                break;
            }
            case 8: {
                System.out.println("август");
                break;
            }
            case 9: {
                System.out.println("сентябрь");
                break;
            }
            case 10: {
                System.out.println("октябрь");
                break;
            }
            case 11: {
                System.out.println("ноябрь");
                break;
            }
            case 12: {
                System.out.println("декабрь");
                break;
            }
            default:
                System.out.println("нет такого месяца");
        }

    }

    private static void step3(double a, double b, double c){
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0){
            System.out.print("корней нет");

        }else if (Math.sqrt(discriminant) == 0){
            double root = -b / (2 * a);
            System.out.println(root);

        }else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println(root1 + " " + root2);
        }


    }
}
