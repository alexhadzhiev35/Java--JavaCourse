import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int length=10;

        int[] myArray = getRandomArray(10);
        int[] myArrayCopy= Arrays.copyOf(myArray,myArray.length);
        Arrays.sort(myArrayCopy);

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(myArrayCopy));

        int[] reversedArray= new int[myArrayCopy.length];

        for (int i=0; i<myArrayCopy.length;i++){
            reversedArray[i]= myArrayCopy[myArrayCopy.length-1-i];
        }

        System.out.println(Arrays.toString(reversedArray));

    }

    private static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] newInt = new int[len];

        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}
