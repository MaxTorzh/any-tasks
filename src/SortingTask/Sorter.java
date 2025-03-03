package SortingTask;

public class Sorter {

    double[] bubbleSort(double[] sorter) {
        for (int i = 0; i < sorter.length; i++) {
            for (int j = 0; j < sorter.length - i - 1; j++) {
                if (sorter[j] > sorter[j + 1]) {
                    double temp = sorter[j];
                    sorter[j] = sorter[j + 1];
                    sorter[j + 1] = temp;
                }
            }
        }
        return sorter;
    }
}
