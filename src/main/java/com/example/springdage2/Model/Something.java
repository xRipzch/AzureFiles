package com.example.springdage2.Model;

public class Something {
    private int id;
    private String text;
    private double number;


    public Something(int nr, String quote, double number) {
        this.id = nr;
        this.text = quote;
        this.number = number;
    }

    public Something() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
