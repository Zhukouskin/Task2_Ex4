package T2Ex4;
/*
Написать программу, которая проверяет, является ли год високосным.

 */
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println("Введите год : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(cal.isLeapYear(x))
        {
            System.out.print("Этот год високосный.");
        }
        else
        {
            System.out.print("Этот год не високосный.");
        }

    }
}
