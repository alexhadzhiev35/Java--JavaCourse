import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {

        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("Third item = " + groceries.get(2));

        if (groceries.contains("mustard")) {
            System.out.println("List contains mustard");
            System.out.println(groceries.indexOf("mustard"));
        }

        groceries.add("yogurt");
        System.out.println(groceries);
        System.out.println("first found \"yogurt\" = " + groceries.indexOf("yogurt"));
        System.out.println("last found \"yogurt\" = " + groceries.lastIndexOf("yogurt"));

        System.out.println("-".repeat(30));
        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);

        //removing items from arrayList
        groceries.remove("yogurt");
        System.out.println(groceries);
        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println(groceries);

        //removing only items which are not in the specified list
        groceries.retainAll(List.of("apples", "milk", "mustard", "cheese"));
        System.out.println(groceries);

        System.out.println("-".repeat(30));
        //clearing the whole "groceries" list
        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());

        //Adding elements
        System.out.println("-".repeat(30));
        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        System.out.println(groceries);
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));
        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        //to list transformation
        System.out.println("-".repeat(30));

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));


    }
}
