
public class Arrays {
    public static void main(String[] args) {

        int[] ass2 = new int[47];
        fillingTheArray(ass2);
        System.out.println(ArrayUtils.binarySearch (ass2,13));

    }

    public static void fillingTheArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }


}
