package exercises.day5.exercise6;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;

public class Shop<T extends ShopItem> {
    private List<T> shopItems = new ArrayList<>();

    public Shop(List<T> shopItems) {
        this.shopItems.addAll(shopItems);
    }

    public void addItem(T item) {
        shopItems.add(item);
    }

    public List<T> findByCategory(Category cat) {
        List<T> resultList = new ArrayList<>();
        for (T t : shopItems) {
            if (t.category().equals(cat)) {
                resultList.add(t);
            }
        }
        return resultList;
    }

    public List<T> findWithLowerPrice(int maxPrice) {
        List<T> resultList = new ArrayList<>();
        for (T t : shopItems) {
            if (t.price() < maxPrice) {
                resultList.add(t);
            }
        }
        return resultList;
    }

    public List<T> findWithHigherPrice(int minPrice) {
        List<T> resultList = new ArrayList<>();
        for (T t : shopItems) {
            if (t.price() > minPrice) {
                resultList.add(t);
            }
        }
        return resultList;
    }

    public Optional<T> findByName(String name) {
        for (T t : shopItems) {
            if (t.name().equals(name.trim().toLowerCase())) {
                return Optional.of(t);
            }
        }
        return Optional.empty();
    }

    public Optional<T> removeItem(String item) {
        T result = null;
        for (T t : shopItems) {
            if (t.name().equals(item.trim().toLowerCase())) {
                result = t;
                shopItems.remove(t);
                break;
            }
        }
        return Optional.ofNullable(result);
    }


    @Override
    public String toString() {
        return "Shop{" +
                "shopItems=" + shopItems +
                '}';
    }
}
