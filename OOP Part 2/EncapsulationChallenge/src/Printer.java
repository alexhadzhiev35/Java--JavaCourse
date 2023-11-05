public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted=0;
        this.tonerLevel = (tonerLevel>100||tonerLevel<0)?-1:tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        int newAmount = tonerLevel += tonerAmount;
        if (tonerAmount>100||tonerAmount<0){
            return -1;
        }
        if (newAmount > 100 || newAmount < 0) {
            return -1;
        }
            return newAmount;

    }

    public int printPages(int pages) {
        if (duplex) {
            System.out.println("Printing on a duplex printer");
            pages = Math.round((float) pages/2);
            pagesPrinted += pages;
        } else {
            pagesPrinted += pages;
        }

        return pages;
    }
}
