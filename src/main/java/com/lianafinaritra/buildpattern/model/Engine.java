package com.lianafinaritra.buildpattern.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Engine {
    private final String name;

    public Engine(String name){
        this.name = name;
    }

}