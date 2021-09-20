package com.company.patern;

public interface IGame {
    IGame comands(String data);

    IGame place(String data);

    IGame result_of_game(String data);

    IGame price(int data);

    IGame date(String data);

    String getComands();

    String getPlace();

    String getResult_of_game();

    int getPrice();

    String getDate();
    String toString();


}

