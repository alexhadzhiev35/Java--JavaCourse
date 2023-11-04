public class Worker {

    private String name;
    private String birthDate;
    private String endDate;

    public Worker(){

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6));
//        System.out.println(name + "is born on " + birthDate + ".");
        return currentYear-birthYear;
    }

    public double collectPay() {
//        System.out.println(name + " has collected monthly pay");
        return 0.00;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
