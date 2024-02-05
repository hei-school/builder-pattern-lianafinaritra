package com.lianafinaritra.buildpattern.model;

public interface Builder {
    public void reset();
    public void setSeats(int seats);
    public void setEngine(Engine engine);
    public void setGPS(String position);
    public void setTripComputer(String tripComputer);
}
