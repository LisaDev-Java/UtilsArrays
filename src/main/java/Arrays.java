
public class Arrays {
    public static void main(String[] args) {

        int[] ass2 = new int[20];
        setRandomValuesToArray (ass2);
        getElementByIndex (ass2, 19);
        getBiggestElement (ass2);
        getSmallestElement (ass2);
        arraysConsoleOutput (ass2);
    }

    public static int getElementByIndex(int[] array, int index) {
        return array[index];
    }

    public static void setRandomValuesToArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public static int getBiggestElement(int[] array){
        int maxAt = 0;

        for (int i = 0; i < array.length; i++) {
            maxAt = array[i] > array[maxAt] ? i : maxAt;
        }
        return maxAt;

    }

    public static int getSmallestElement(int[] array){
        int minAt = 0;
        for (int i = 0; i < array.length; i++) {
        minAt = array[i] < array[minAt] ? i : minAt;
    }
        return minAt;
}
    public static void arraysConsoleOutput(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}



