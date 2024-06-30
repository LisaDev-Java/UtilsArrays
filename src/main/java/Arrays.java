public class Arrays {
    public static void main(String[] args) {

        int[] ass2 = new int[560];
        setRandomValuesToArray (ass2);

    }

    public static int getElementByIndex(int[] array, int index) {
        return array[index];
    }

    public static void setRandomValuesToArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
    }
}
