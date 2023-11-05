public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(59,true);
        Printer oldPrinter = new Printer(90,false);

System.out.println(printer.addToner(41));
System.out.println(printer.printPages(25));
System.out.println(printer.getPagesPrinted());
    }
}
