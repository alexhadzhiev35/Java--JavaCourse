public class Main {

    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        Employee ti2m = new Employee("Tim", "11/11/1985", "01/01/2020");

        System.out.println(ti2m);

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1995", "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Joe's paycheck = "+joe.collectPay());

        joe.retire();
        System.out.println(joe);
        System.out.println("Joe's pension check = "+joe.collectPay());

        HourlyEmployee mary= new HourlyEmployee("Mary", "21/01/2000", "20/01/2021", 23);
        System.out.println(mary);
        System.out.println(mary.collectPay());
        System.out.println(mary.getDoublePay());


    }
}
