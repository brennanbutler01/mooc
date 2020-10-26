import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int smallestInt = array[0];

        for (int i=0; i < array.length; i++) {
            if (array[i] < smallestInt) {
                smallestInt = array[i];
            }
        }
        return smallestInt;
    }

    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = 0;
        if(array.length == 0) {
            return -1;
        }
        int smallest = array[0];

        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] < smallest) {
                indexOfSmallest = i;
                smallest = array[i];
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexOfSmallest = startIndex;
        if (array.length == 0) {
            return -1;
        }
        int smallest = array[startIndex];

        for (int i = startIndex; i<array.length; i++) {
            if (array[i] < smallest) {
                indexOfSmallest = i;
                smallest = array[i];
            }
        }
        return indexOfSmallest;
    }

    public  static void swap (int[] array, int indexOne, int indexTwo) {
        int helper = 0;
        helper = array[indexTwo];
        array[indexTwo]=array[indexOne];
        array[indexOne] = helper;
    }

    public static void sort(int[] array) {
        int i = 0;
        System.out.println(Arrays.toString(array));
        while (i < array.length) {
            if (i == 0) {
                int smallest = indexOfSmallest(array);
                swap(array, 0, smallest);
                System.out.println(Arrays.toString(array));
                i++;
                continue;
            }
            int smallest = indexOfSmallestFrom(array, i);
            swap(array, i, smallest);
            System.out.println(Arrays.toString(array));
            i++;
            continue;
        }
    }

}
