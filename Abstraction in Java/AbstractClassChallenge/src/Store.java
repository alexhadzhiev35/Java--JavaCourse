import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product) {
}

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

        storeProducts.add(new ArtObject("Oil Painting", 1350, "This is a short desc"));
        storeProducts.add(new ArtObject("Sculpture", 2000, "This is another short desc"));
        storeProducts.add(new Furniture("Desk", 2020, "Basic wooden desk with high price"));
        storeProducts.add(new Furniture("Lamp", 212, "Old school gas lamp"));

        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3, 5);
        addItemToOrder(order2, 2, 1);
        addItemToOrder(order2, 0, 1);
        printOrder(order2);
    }

    public static void listProducts() {

        for (var item : storeProducts) {
            System.out.println("-".repeat(40));
            item.showDetails();
        }

    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity) {

        order.add(new OrderItem(quantity, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {

        double salesTotal = 0;

        for (var item : order) {
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getASalesPrice(item.quantity());
        }

        System.out.printf("Sales total = $%6.2f %n", salesTotal);
    }

}
