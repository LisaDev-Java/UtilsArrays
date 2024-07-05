public class ArrayUtils {

    public static int getElementByIndex(int[] array, int index) {
        return array[index];
    }

    public static void setRandomValuesToArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public static int getBiggestElement(int[] array) {
        int maxAt = 0;

        for (int i = 0; i < array.length; i++) {
            maxAt = array[i] > array[maxAt] ? i : maxAt;

            /*if (array[i] > array[maxAt]) {
                maxAt = i;
            } else {
                maxAt = maxAt;
            }*/

        }
        return array[maxAt];
    }

    public static int getSmallestElement(int[] array) {
        int minAt = 0;
        for (int i = 0; i < array.length; i++) {
            minAt = array[i] < array[minAt] ? i : minAt;
        }
        return array[minAt];
    }

    public static void arraysConsoleOutput(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int linearSearch(int[] array, int elementToFind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToFind) {
                return i;
            }
        }
        return -1;
    }

    public static void permutationSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int nextI = i + 1; nextI < array.length; nextI++) {
                if (array[nextI] < array[min]) {
                    min = nextI;
                }
            }
            int temporary = array[i];
            array[i] = array[min];
            array[min] = temporary;
        }
    }

    public static int binarySearch(int[] sortedArray, int valueToFind) {
        int index = -1;
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortedArray[mid] < valueToFind) {
                low = mid + 1;
            } else if (sortedArray[mid] > valueToFind) {
                high = mid - 1;
            } else if (sortedArray[mid] == valueToFind) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
