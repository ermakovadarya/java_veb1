package lesson1;

import java.util.Random;

public class pr1 {
    public static void main(String[] args) {
        pr1();
    }

    public static void pr1() {
        //Задать одномерный массив и найти в нем минимальный и максимальный элементы
        int[]arr=new int[10];
        Random random=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]= random.nextInt(0,20);
            System.out.printf("%d ",arr[i]);
        }
        int maxEl=arr[0];
        int minEl=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxEl){
                maxEl=arr[i];
            }
            if (arr[i] < minEl) {
                minEl=arr[i];
            }
        }
        System.out.println();
        System.out.printf("Минимальный элемент массива - %d",minEl);
        System.out.println();
        System.out.printf("Максимальный элемент массива - %d",maxEl);
    }
}
