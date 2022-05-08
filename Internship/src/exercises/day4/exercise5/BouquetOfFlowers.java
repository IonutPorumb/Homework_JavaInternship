package exercises.day4.exercise5;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BouquetOfFlowers {
    private Set<String> flowers = new HashSet<>();

    public BouquetOfFlowers(List<String> flowers) {
        for (String f : flowers) {
            this.flowers.add(f.trim().toLowerCase());
        }
    }

    public Collection<String> getAll() {
        return flowers;
    }

    public void add(String flower) {
        flowers.add(flower.trim().toLowerCase());
    }

    public void remove(String flower) {
        flowers.remove(flower.trim().toLowerCase());
    }

}
