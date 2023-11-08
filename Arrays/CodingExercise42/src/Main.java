import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numOfElements = readIntegers();
        int[] array = readElements(numOfElements);
        System.out.println(findMin(array));

    }

    public static int readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count of elements you want to add:");
        int count = Integer.parseInt(scanner.nextLine());

        return count;
    }

    public static int[] readElements(int count) {
        System.out.println("Enter your elements one by one");
        int[] array = new int[count];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < count; i++) {

            array[i] = Integer.parseInt(scanner.nextLine());
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;

    }
}
