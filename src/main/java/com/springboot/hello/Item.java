package com.springboot.hello;

public class Item {

    private long id;
    private String name;
    private String description;
    private double price;

    public Item(long id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public long getId() {
        return id;
    }
}
