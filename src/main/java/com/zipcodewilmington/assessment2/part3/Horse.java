package com.zipcodewilmington.assessment2.part3;

public class Horse implements Animal {

    private int speed;
    private String color;
    private String move;


    public Horse(int getSpeed, String color) {

        this.color = color;
        this.speed = getSpeed;

    }

    public Horse() {

    }


    public String getColor() {
        return color;

    }

    public void setColor(String Color) {
        this.color = "yellow";

    }

    @Override
    public String move() {
        return "gallop";
    }


    public int getSpeed() {
        return speed;
    }

    @Override
    public String color() {
        return "brown";
    }

    public void getSpeed(Integer speed) {
        this.speed = 30;

    }


}