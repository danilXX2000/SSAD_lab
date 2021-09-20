package com.company.patern;

public class Main {

    public static void main(String[] args) {
        NBAManager nbaManager = new NBAManager();
        LA_Lakers la_lakers = new LA_Lakers();
        nbaManager.subscribeToNBA(la_lakers);
        nbaManager.addGame();
    }

}
