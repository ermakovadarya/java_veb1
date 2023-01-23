package lesson1;

import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {
        pr2();
    }

    public static void pr2() {
        /*
        Написать метод, который определяет, является ли введенный пользователем год високосным,
        и возвращает в консоль boolean (високосный - true, не високосный - false).
        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
         */
        Scanner scanner=new Scanner(System.in);
        int year= scanner.nextInt();
        boolean result;
        if (year%400==0){
            result=true;
        }
        else if (year%100==0){
            result=false;
        }
        else if (year%4==0){
            result=true;
        }
        else {
            result=false;
        }
        System.out.println(result);
    }
}
