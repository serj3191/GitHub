package HashSet_HashMap;

import java.util.HashSet;

public class HashSet1 {

    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Mazda");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");

        System.out.println(cars);
    }
}

