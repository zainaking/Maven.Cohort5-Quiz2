package com.zipcodewilmington.assessment2.part3;

public class BlueJay implements Animal {

    private int speed;
    private String color;
    private String move;


    public BlueJay(int getSpeed, String color) {

        this.color = color;
        this.speed = getSpeed;

    }

    public BlueJay() {

    }


    public String getColor() {
        return color;

    }

    public void setColor(String Color) {
        this.color = "blue";

    }

    public void setMove (String move){

        this.move = "fly";
    }


    @Override
    public String move() {
        return "fly";
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public String color() {
        return "blue";
    }
}



