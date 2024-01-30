package com.company;

public class Car extends Vehicle implements Comparable<Car> {
    private String brand;
    private String model;
    private int yearOfProduction;

    public Car() {
    }

    public Car(String brand, String model, int yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public int compareTo(Car o) {
        if (this.yearOfProduction > o.yearOfProduction)
            return 1;
        else if (this.yearOfProduction < o.yearOfProduction)
            return -1;
        return 0;
    }

    @Override
    void draw() {
        System.out.println("The Car is moving!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
}

