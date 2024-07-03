
public class Arrays {
    public static void main(String[] args) {

        int[] ass2 = new int[10000000];
        setRandomValuesToArray (ass2);

        //System.out.println(getBiggestElement (ass2));

        //arraysConsoleOutput (ass2);

        System.out.println(linearSearch(ass2, 10));
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

    public static int getSmallestElement(int[] array){
        int minAt = 0;
        for (int i = 0; i < array.length; i++) {
            minAt = array[i] < array[minAt] ? i : minAt;
        }
        return array[minAt];
    }

    public static void arraysConsoleOutput(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static int linearSearch(int[] array, int kay){
        for (int i = 0; i < array.length; i++) {
            if (array [i] == kay ){
                return i;
            }
        }
        return -2;
    }

}
