public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {
        // Opretter en ny forfatter ved navn Olga Ravn
        Author olgaRavn = new Author("Olga Ravn");

        // Opretter en printet bog og en lydbog og tilføjer dem til forfatteren
        PrintedBook celestinePrint = new PrintedBook("Celestine", "SKØN", 140, 166);
        AudioBook celestineAudio = new AudioBook("Celestine", "SKØN", 140, 192);

        // Tilføjer titlerne til forfatteren
        olgaRavn.addTitle(celestinePrint);
        olgaRavn.addTitle(celestineAudio);

        // Beregner og udskriver forfatterens samlede bibliotekspenge
        double totalPay = olgaRavn.calculateTotalPay();
        System.out.println(olgaRavn.getName() + ": " + totalPay + "kr");
    }
}
