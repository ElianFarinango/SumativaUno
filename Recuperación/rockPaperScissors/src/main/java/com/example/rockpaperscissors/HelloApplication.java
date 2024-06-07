package com.example.rockpaperscissors;
import java.util.Objects;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication {
    public static void main(String[] args) {
        Scanner playerChoice=new Scanner(System.in);
        int rounds=3;
        int players=2;
        int playerOneWins = 0;
        int playerTwoWins = 0;
        System.out.println("Options");
        System.out.println("R for Rock");
        System.out.println("S for Scissors");
        System.out.println("P for Paper");
        System.out.println("Number of Rounds=3");
        String[][] games = new String[rounds][players];
        for(int i=0;i<=rounds-1;i++){
            int tempValue=0;
            System.out.println("Round "+(i+1));
            for(int j=0;j<=players-1;j++){
                System.out.print("Player " + (j+1) + ", please write one of that options: ");
                games[i][j]=playerChoice.nextLine();
            }
            System.out.println(" ");
            if (Objects.equals(games[i][tempValue + 1], games[i][tempValue])){
                    System.out.println("Tie");
            }else if (Objects.equals(games[i][tempValue], "P") && Objects.equals(games[i][tempValue + 1], "R")) {
                playerOneWins=playerOneWins+1;
                System.out.println("Player 1");
            }else if (Objects.equals(games[i][tempValue], "R") && Objects.equals(games[i][tempValue + 1], "P")){
                playerTwoWins=playerTwoWins+1;
                System.out.println("Player 2");
            }else if (Objects.equals(games[i][tempValue], "S") && Objects.equals(games[i][tempValue + 1], "P")) {
                playerOneWins=playerOneWins+1;
                System.out.println("Player 1");
            }else if (Objects.equals(games[i][tempValue], "P") && Objects.equals(games[i][tempValue + 1], "S")){
                playerTwoWins=playerTwoWins+1;
                System.out.println("Player 2");
            }else if (Objects.equals(games[i][tempValue], "R") && Objects.equals(games[i][tempValue + 1], "S")) {
                playerOneWins=playerOneWins+1;
                System.out.println("Player 1");
            }else if (Objects.equals(games[i][tempValue], "S") && Objects.equals(games[i][tempValue + 1], "R")){
                playerTwoWins=playerTwoWins+1;
                System.out.println("Player 2");
            }
            System.out.println(" ");
        }
        System.out.println("Results: ");
        System.out.println(" ");
        if (playerOneWins==playerTwoWins) {
            System.out.println("Tie");
        }else if (playerOneWins>playerTwoWins) {
            System.out.println("Player 1 wins");
        }else{
            System.out.println("Player 2 wins");
        }
    }
}