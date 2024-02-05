package com.lianafinaritra.buildpattern.model;

public class CarBuilder implements Builder {
    private Car car = new Car();

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int number) {
        car.setSeats(number);
    }

    @Override
    public void setEngine(Engine engine) {
        car.setEngine(engine);
    }

    @Override
    public void setGPS(String position) {
        car.setGps(position);
    }

    @Override
    public void setTripComputer(String tripComputer) {
        car.setTripComputer(tripComputer);
    }

    public Car getResult() {
        return car;
    }
}
