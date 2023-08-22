import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] firstArray = {2, 3, 1, 7, 11};
        Arrays.sort(firstArray, Collections.reverseOrder());
        System.out.println("Array in reverse order: " + Arrays.toString(firstArray));

        int sumOfPositives = 0;
        int[] secondArray = {-4, -2, 0, 2, 4};
        for (int value : secondArray) {
            if (value >= 0)
                sumOfPositives += value;

        }
        System.out.println("Sum of positive values: " + sumOfPositives);


        int sumOfValues = 0;
        int amountOfValues = 0;
        for (int k : secondArray) {
            sumOfValues += k;
            amountOfValues++;

        }
        System.out.println("Average: " + sumOfValues / amountOfValues);

        int[] thirdArray = {3, 2, 3, 1, 4, 2, 8, 3};
        for (int i = 0; i < thirdArray.length; i++) {
            for (int j = 0; j < thirdArray.length; j++) {
                if (i == j) {
                    continue;
                } else if (thirdArray[i] == thirdArray[j]) {
                    thirdArray[j] = 0;
                }
            }
        }
        System.out.println("Repeats removed: " + Arrays.toString(thirdArray));
    }
}