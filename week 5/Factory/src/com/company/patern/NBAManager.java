package com.company.patern;

import java.util.Scanner;

public class NBAManager {
    private NBA nba;

    public NBAManager(){
         nba = new NBA();
    }
    public void addGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new events:\n " +
                "format: <comand>-<comand>,<place>,<result>," +
                "<price>,<date>");
        while (scanner.hasNextLine()){
            String input = scanner.nextLine();
            String[]d = input.split(",");
            Game g = new Game();
            g.comands(d[0]).place(d[1]).result_of_game(d[2]).price(Integer.parseInt(d[3])).date(d[4]);
            nba.notify(g);
        }
    }
    public void subscribeToNBA (IObserver<Game> o){
        nba.subscribe(o);
    }

}
