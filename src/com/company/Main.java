package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Car c1 = new Car("mrzedez", "hubav", 2006);
        Car c2 = new Car("nissan", "cube", 2012);
        Car c3 = new Car("fiat", "multipla", 2007);
        Car c4 = new Car("bmw", "losh", 4);
        cars.add(c1); cars.add(c2); cars.add(c3); cars.add(c4);

        Collections.sort(cars);
        for(int i = 0; i < 4; i++) {
            System.out.println(cars.get(i).toString());
        }
    }
}
