import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] myIntArray = new int[5];
        int [] anotherArray = myIntArray;

        System.out.println(myIntArray);
        System.out.println(anotherArray);

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0]=1;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
    }
}