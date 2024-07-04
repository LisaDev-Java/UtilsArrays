
public class Arrays {
    public static void main(String[] args) {

        int[] ass2 = new int[20];
        setRandomValuesToArray(ass2); //Заполение массива рандомными значениями
        arraysConsoleOutput(ass2); //Вывод всех эллементов массива
        permutationSort(ass2);
        arraysConsoleOutput(ass2);

    }

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

    public static int linearSearch(int[] array, int elementToFind){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToFind ){
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
}
