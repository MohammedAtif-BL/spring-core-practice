package com.example.backend;

public class Engine {
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public void start(){
        System.out.println("Engine of type " + type + " started");
    }
}
