package main;

public class Main {
    public static void main(String[] args) {
        int[][] arrayNumbers = new int[5][5];
        arrayFill(arrayNumbers);
        System.out.println(maxNumber(arrayNumbers));
        System.out.println(avgNumber(arrayNumbers));
        System.out.println(minNumber(arrayNumbers));
    }
    //Заполнение массива
    public static void arrayFill(int[][] arrayTemp){
        for (int i = 0; i < arrayTemp.length; i++) {
            for (int j = 0; j < arrayTemp[i].length; j++) {
                arrayTemp[i][j] = (int)(Math.random() * 100 + 1);
            }
        };
    }
    //Поиск минимального значения
    public static int minNumber(int[][] arrayTemp){
        int minValue = Integer.MAX_VALUE;
        for (int[] anArray : arrayTemp) {
            for (int anAnArray : anArray) {
                if(anAnArray < minValue){
                    minValue = anAnArray;
                }
            }
        }
        return minValue;
    }
    //Поиск максимального значения
    public static int maxNumber(int[][] arrayTemp){
        int maxValue = Integer.MIN_VALUE;
        for (int[] anArray : arrayTemp) {
            for (int anAnArray : anArray) {
                if(anAnArray > maxValue){
                    maxValue = anAnArray;
                }
            }
        }
        return maxValue;
    }

    //Поиск среднего значения
    public static double avgNumber(int[][] arrayTemp){
        int avgValue = 0;
        int divide = arrayTemp.length * arrayTemp[0].length;
        for (int[] anArray : arrayTemp) {
            for (int anAnArray : anArray) {
                avgValue += anAnArray;
            }
        }
        return (double) avgValue / divide;

    }
}
