import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Title> titles;

    // Constructor
    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }
    // Metode
    public void addTitle(Title title) {
        titles.add(title);
    }

    public double calculateTotalPay() {
        double totalPay = 0.0;
        for (Title title : titles) {
            totalPay += title.calculateRoyalties();
        }
        return Math.round(totalPay * 100.0) / 100.0;
    }
    public String getName() {
        return name;
    }
}
