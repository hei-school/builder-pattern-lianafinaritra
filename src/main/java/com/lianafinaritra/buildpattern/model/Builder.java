package com.lianafinaritra.buildpattern.model;

public interface Builder {
    void reset();
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setGPS(String position);
    void setTripComputer(int tripComputer);
}
