// Abstrakt klasse Title, som repræsenterer en generel titel (bog eller lydbog)
abstract class Title {
    private String name; // Navnet på titlen
    private String literatureType; // Litteraturtypen BI, TE, LYRIK, SKØN, FAG
    private int copies; // Antal eksemplarer

    // Constructor til at initialisere felterne
    public Title(String name, String literatureType, int copies) {
        this.name = name;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    // Getter-metoder til at få adgang til private felter
    public String getName() {
        return name;
    }

    public String getLiteratureType() {
        return literatureType;
    }

    public int getCopies() {
        return copies;
    }

    // Metode til at beregne royalties (bibliotekspenge) for titlen
    public double calculateRoyalties() {
        return calculatePoints() * 0.067574; // Multiplicerer titlens point med raten for 2025
    }

    // Metode til at konvertere litteraturtypen til point
    protected int convertLiteratureTypePoints() {
        switch (literatureType) {
            case "BI":
                return 3; // Billedbøger
            case "TE":
                return 3; // Tegneserier
            case "LYRIK":
                return 6; // Lyriksamlinger
            case "SKØN":
                return 17; // Skønlitterære bøger (1.7 * 10 for at undgå flydende punkt aritmetik)
            case "FAG":
                return 10; // Fagbøger (1 * 10 for at undgå flydende punkt aritmetik)
            default:
                return 0; // Ukendt litteraturtype
        }
    }

    // Metode til at konvertere litteraturtypen til decimal point
    protected int convertLiteratureTypePointsToDecimal() {
        return convertLiteratureTypePoints() / 10;
    }

    // Abstrakt metode til at beregne point for titlen, som skal implementeres i underklasserne
    protected abstract double calculatePoints();
}
