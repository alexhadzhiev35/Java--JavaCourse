public class Main {

    public static void main(String... args) {

        System.out.println("Hello World");

        String[] splitStrings = "Hello world again".split(" ");
        printText(splitStrings);

        System.out.println("-".repeat(30));
        printText("Hello");

        System.out.println("-".repeat(30));
        printText("Hello","World","again");

        System.out.println("-".repeat(30));
        printText();
    }

    private static void printText(String... textList) {

        for (String t : textList) {
            System.out.println(t);
        }
    }
}
