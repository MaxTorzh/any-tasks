public class MaxMinAvg {
    public static void main(String[] args) {
        int number = 100;
        double[] array = new double[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 100;
        }
        double max = array[0];
        double min = array[0];
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
            average += array[i]/array.length;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
    }
}
