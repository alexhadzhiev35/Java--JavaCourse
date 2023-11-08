import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] myArr= readIntegers();
        System.out.println(Arrays.toString(myArr));
        System.out.println(findMin(myArr));

    }

    public static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a list of integers, separated by commas:");
        String numbers = scanner.nextLine();
        String[] array = numbers.split(",");
        int[] arrayOfNum= new int[array.length];

        for (int i = 0; i<array.length; i++){
            arrayOfNum[i]=Integer.parseInt(array[i]);
        }

        return arrayOfNum;
    }

    public static int findMin(int[] array){
        int temp= Integer.MAX_VALUE;

        for (int element:array){
            if(element<temp){
                temp=element;
            }
        }

        return temp;
    }

}
