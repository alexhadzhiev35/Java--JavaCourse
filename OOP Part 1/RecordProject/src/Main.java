public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "John";
                        case 3 -> "Noah";
                        case 4 -> "Victor";
                        case 5 -> "Anna";
                        default -> "no";
                    },
                    "05/11/1948",
                    "Java Masterclass");
            System.out.println(s);
        }
    }
}
