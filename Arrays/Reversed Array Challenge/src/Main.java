import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArr =new int[]{1,2,3,4,5,6};
        reverseArray(myArr);

    }

    public static void reverseArray(int[] array) {

        int[] straightArray = Arrays.copyOf(array, array.length);
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }

        System.out.println(Arrays.toString(straightArray));
        System.out.println(Arrays.toString(reversedArray));

    }
}
