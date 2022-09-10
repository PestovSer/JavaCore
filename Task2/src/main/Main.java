package main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        sortArrays(arr);
    }


    //Метод сортировки массива
    public static void sortArrays(int[] arr){
        boolean sort = false;
        int temp = 0;
        //Цикл сортирует, и выводит в консоль
        while(!sort){
            sort = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]){
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    sort = false;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}

