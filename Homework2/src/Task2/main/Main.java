package Task2.main;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(searchPairOfNumber(new int[]{3, 4, 2, 7}, 10)));
    }
    public static int[] searchPairOfNumber(int[] array, int number){

        if (array == null){
            return new int[0];
        }

        Set<Integer> set = new HashSet<>();

        for (int j : array) {
            int numberToFind = number - j;
            if (set.contains(numberToFind)) {
                return new int[]{numberToFind, j};
            }
            set.add(j);
        }
        return new int[0];
    }
}
