package task16;

import java.util.Random;
import java.util.function.Consumer;

public class Sorting {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        double timeForBubbleSort = timeForSorting(5, Sorting::mergeSort);
        System.out.println("Среднее время сотрировки слиянием: " + timeForBubbleSort + " мс");
        double timeForSelectionSort = timeForSorting(5,Sorting::sortSelection);
        System.out.println("Среднее время сотрировки выбором : " + timeForSelectionSort + " мс");
        double timeForInsertionSort = timeForSorting(5, Sorting::sortInsertion);
        System.out.println("Среднее время сотрировки вставками : " + timeForInsertionSort + " мс");
    }

    private static double timeForSorting(int iteration, Consumer<int[]> arrayConsumer){
        double sum = 0;
        for (int i = 0; i < iteration; i++) {
            int[] array = generateArray(100_000);
            long start = System.currentTimeMillis();
            arrayConsumer.accept(array);
            long end = System.currentTimeMillis()-start;
            sum += end;
        }
        return sum / iteration;
    }
    private static int[] generateArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = RANDOM.nextInt(100);
        }
        return array;
    }
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = arr[mid + i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }
    public static void merge(int[] arr, int[] left, int[] right) {

        int mainP = 0;
        int leftP = 0;
        int rightP = 0;
        while (leftP < left.length && rightP < right.length) {
            if (left[leftP] <= right[rightP]) {
                arr[mainP++] = left[leftP++];
            } else {
                arr[mainP++] = right[rightP++];
            }
        }
        while (leftP < left.length) {
            arr[mainP++] = left[leftP++];
        }
        while (rightP < right.length) {
            arr[mainP++] = right[rightP++];
        }
    }
    private static void swapElements(int[] arr, int indexA, int indexB){
        int tmp = arr[indexA];
        arr[indexA]= arr[indexB];
        arr[indexB] = tmp;
    }
    private static void sortSelection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            swapElements(arr, i, minElementIndex);
        }
    }
    private static void sortInsertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }
}