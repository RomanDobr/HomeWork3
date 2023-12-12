package city;


import java.util.Arrays;

public final class City {
    private final String nameCity;
    private final House[] houses;

    private final House[] housesCity;

    public City(String nameCity, House[] houses) {
        this.nameCity = nameCity;
        this.houses = houses;
        housesCity = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
           int number =  houses[i].getNumberHouse();
           String name = houses[i].getStreet();
           housesCity[i] = new House(name, number);
        }
    }

    @Override
    public String toString() {
        return "город :" + nameCity + ", дома :" + Arrays.toString(housesCity);
    }
}
