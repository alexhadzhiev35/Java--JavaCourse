import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> groceryList= new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Available actions: \n " +
                "0 - to shutdown \n" +
                "1 - to add item(s) to list (comma delimited list) \n" +
                "2 - to remove any items (comma delimited list) \n" +
                "Enter a number for which action you want to do:");

        int action = Integer.parseInt(scanner.nextLine());

        if(action==0){
            return;
        }else if(action==1){
            System.out.println("Items you want to be added to the list:");
            String[] items =scanner.nextLine().split(", ");
            addItemsToList(items,groceryList);

        } else if (action == 2) {
            System.out.println("Items you want to be removed from the list:");
            String[] items =scanner.nextLine().split(", ");
            removeItemsFromList(items,groceryList);
        }


    }

    private static void addItemsToList(String[] arrayOfItems, ArrayList<String> list ){
    for (String item: arrayOfItems){
        if(list.contains(item)){
            continue;
        }else{
            list.add(item);
        }
    }

    list.sort(Comparator.naturalOrder());
    System.out.println(list);

    }
    private static void removeItemsFromList(String[] arrayOfItems, ArrayList<String> list ){
        for (String item: arrayOfItems){
            if(list.contains(item)){
                continue;
            }else{
                list.remove(item);
            }
        }

        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }
}
