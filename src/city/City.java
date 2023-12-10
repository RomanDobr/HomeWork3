package city;

import javax.management.ImmutableDescriptor;
import java.util.Arrays;

public final class City {
    private final String nameCity;
    private final House[] houses;

    public City(String nameCity, House[] houses) {
        this.nameCity = nameCity;
        this.houses = houses;
    }

    @Override
    public String toString() {
        return "город :" + nameCity + ", дома :" + Arrays.toString(houses);
    }
}
