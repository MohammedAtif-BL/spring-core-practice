package com.example.backend;

import java.util.List;
import java.util.Map;

public class Car {
    private String model;
    private Engine engine;
    private List<String> features;
    private Map<String, String> specs;

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public void setSpecs(Map<String, String> specs) {
        this.specs = specs;
    }

    public void showDetails(){
        System.out.println("Car Model " +model);
        engine.start();

        System.out.println("Features: ");
        for (String feature : features){
            System.out.println("- "+feature);
        }

        System.out.println("Specification: ");
        specs.forEach((k,v) -> System.out.println(k + ": "+v));
    }
}
