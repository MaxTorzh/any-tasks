package SortingTask;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        Random random = new Random();
        double[] sorterTest = new double[10];
        for (int i = 0; i < sorterTest.length; i++) {
            sorterTest[i] = random.nextDouble() * 100;
        }
        System.out.println("Список до сортировки " + Arrays.toString(sorterTest));
        System.out.println("-".repeat(50));
        System.out.println("Отсортированный список " + Arrays.toString(sorter.bubbleSort(sorterTest)));
    }
}
