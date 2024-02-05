package com.lianafinaritra.buildpattern.model;

public class Director {
    public void makeSUV(Builder builder){
        builder.setEngine(new Engine("SUV Car"));
    };
    public void makeSportsCar(Builder builder){
        builder.setEngine(new Engine("Sports Car"));
    };
}
