package SortingTask;

public class Sorter {

    int[] bubbleSort(int[] sorter) {
        for (int i = 0; i < sorter.length; i++) {
            for (int j = 0; j < sorter.length - i - 1; j++) {
                if (sorter[j] > sorter[j + 1]) {
                    int temp = sorter[j];
                    sorter[j] = sorter[j + 1];
                    sorter[j + 1] = temp;
                }
            }
        }
        return sorter;
    }
}
