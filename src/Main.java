import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

class Country {
    private String name;
    private int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        return name + " " + numberFormat.format(population);
    }
}

class PopulationComparator implements Comparator<Country> {
    @Override
    public int compare(Country c1, Country c2) {
        return Integer.compare(c2.getPopulation(), c1.getPopulation());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Country Sorter\n");

        ArrayList<Country> countries = new ArrayList<>();
        countries.add(new Country("Japan", 123294513));
        countries.add(new Country("Mexico", 128455567));
        countries.add(new Country("Bangladesh", 172954319));
        countries.add(new Country("Nigeria", 223804632));
        countries.add(new Country("Indonesia", 277534122));
        countries.add(new Country("China", 1425671352));
        countries.add(new Country("India", 1428627552));
        countries.add(new Country("United States", 339996563));
        countries.add(new Country("Pakistan", 240485658));
        countries.add(new Country("Brazil", 216422446));
        countries.add(new Country("Russia", 144444359));
        countries.add(new Country("Ethiopia", 126527060));

        System.out.println("Before sorting:");
        for (Country country : countries) {
            System.out.println(country);
        }

        Collections.sort(countries, new PopulationComparator());

        System.out.println("\nAfter sorting:");
        for (Country country : countries) {
            System.out.println(country);
        }
    }
}
