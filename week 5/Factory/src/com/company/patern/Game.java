package com.company.patern;

public class Game implements IGame{
    private String comands;
    private String place;
    private String result_of_game;
    private int price;
    private String date;

    @Override
    public IGame comands(String data) {
        comands = data;
        return this;
    }

    @Override
    public IGame place(String data) {
        place = data;
        return this;
    }

    @Override
    public IGame result_of_game(String data) {
        result_of_game = data;
        return this;
    }

    @Override
    public IGame price(int data) {
        price = data;
        return this;
    }

    @Override
    public IGame date(String data) {
        date = data;
        return this;
    }

    @Override
    public String getComands() {
        return this.comands;
    }

    @Override
    public String getPlace() {
        return this.place;
    }

    @Override
    public String getResult_of_game() {
        return this.result_of_game;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getDate() {
        return this.date;
    }
    public String toString(){
        return "Match: comands "+comands+" date: "+date;
    }
}
