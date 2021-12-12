package ru.gb.springbootdemo.dto;

public class Product {
    private int id;
    private String name;
    private  float cost;

    public Product(int id, String name, float cost) {
        this.id=id;
        this.name=name;
        this.cost=cost;
    }

    public Product(){

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }

}

