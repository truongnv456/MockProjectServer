package com.paci.training.android.truongnv92.mockprojectserver.model;

public class Fruit {
    private final int id;
    private String name;
    private String detail;
    public Fruit(int id, String name, String detail) {
        this.id = id;
        this.name = name;
        this.detail = detail;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
}
