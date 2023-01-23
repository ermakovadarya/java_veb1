package lesson1;

import java.util.Random;

public class pr3 {
    public static void main(String[] args) {
        pr3();
    }
    public static void changeLR(int l, int r, int[] arr){
        int temp = arr[r];
        arr[r] = arr[l];
        arr[l] = temp;
    }

    public static void pr3() {
        /*
        Дан массив nums = [3,2,2,3] и число val = 3.
        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
        а остальные - равны ему.
         */
        int[]arr=new int[10];
        Random random=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]= random.nextInt(0,4);
            System.out.printf("%d ",arr[i]);

        }
        System.out.println();
        int val=3;
        int l=0;
        int r= arr.length-1;

        while (l<r){
            if (arr[l]==val &&arr[r]!=val){
                changeLR(l,r,arr);
                l++;
                r--;
            }
            else if (arr[l]!=val) {
                l++;
            }
            else if (arr[r]==val){
                while (arr[r]==val){
                    r--;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ",arr[i]);
        }
    }
}
