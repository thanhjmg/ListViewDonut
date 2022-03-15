package com.example.listviewdonut;

public class Donut {
    private int imageDonut;
    private String name;
    private String chuthich;
    private String price;


    public Donut(int imageDonut, String name, String chuthich, String price) {
        this.imageDonut = imageDonut;
        this.name = name;
        this.chuthich = chuthich;
        this.price = price;
    }

    public int getImageDonut() {
        return imageDonut;
    }

    public void setImageDonut(int imageDonut) {
        this.imageDonut = imageDonut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChuthich() {
        return chuthich;
    }

    public void setChuthich(String chuthich) {
        this.chuthich = chuthich;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
