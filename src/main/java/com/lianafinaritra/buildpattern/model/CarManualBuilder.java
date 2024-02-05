package com.lianafinaritra.buildpattern.model;

public class CarManualBuilder implements Builder {
    private CarManual carManual = new CarManual();

    @Override
    public void reset() {
        carManual = new CarManual();
    }

    @Override
    public void setSeats(int number) {
        carManual.setSeats(number);
    }

    @Override
    public void setEngine(Engine engine) {
        carManual.setEngine(engine);
    }

    @Override
    public void setGPS(String position) {
        carManual.setGps(position);
    }

    @Override
    public void setTripComputer(String tripComputer) {
        carManual.setTripComputer(tripComputer);
    }

    public CarManual getResult() {
        return carManual;
    }
}
