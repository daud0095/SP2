
public class AudioBook extends Title {
    private int durationInMinutes; // Varighed i minutter

    // Constructor til at initialisere felterne, inklusive dem der arves fra Title
    public AudioBook(String name, String literatureType, int copies, int durationInMinutes) {
        super(name, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        return (getDurationInMinutes() * 0.5) * convertLiteratureTypePointsToDecimal() * getCopies();
    }

    // Getter-metode til at få adgang til varigheden i minutter
    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
