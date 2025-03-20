public class PrintedBook extends Title {
    private int pages; // Antal sider i selve bogen

    // Laver en constructor til at initialisere felterne, inklusive dem der arves fra Title
    public PrintedBook(String name, String literatureType, int copies, int pages) {
        super(name, literatureType, copies);
        this.pages = pages;
    }

    @Override
    protected double calculatePoints() {
        return getPages() * convertLiteratureTypePointsToDecimal() * getCopies();
    }

    // Laver en Getter metode til at få antal af sider
    public int getPages() {
        return pages;
    }
}
