public class Main {

    public static void main(String[] args) {

//        Customer alex = new Customer();
//        Customer alex = new Customer("alex","example.com");
        Customer alex = new Customer("alex",12.22,"example.com");
        System.out.println(alex.getName());
        System.out.println(alex.getEmail());
        System.out.println(alex.getCreditLimit());
    }


}
