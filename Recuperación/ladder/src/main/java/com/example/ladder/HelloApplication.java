package com.example.ladder;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication{
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Please introduce your number of ladders: ");
        int numberOfLadders=number.nextInt();
        System.out.println("Graphic: ");
        if(numberOfLadders>0){
            for(int i=1;i<=numberOfLadders;i++){
                for(int j=0;j<=numberOfLadders-i-1;j++) {
                    System.out.print(" ");
                }
                System.out.println("_|");
            }
        }
        if(numberOfLadders<0){
            for(int i=numberOfLadders;i<=-1;i++){
                System.out.println("|_");
                for(int j=numberOfLadders;j<=i;j++) {
                    System.out.print(" ");
                }
            }
        }else if(numberOfLadders==0){
            System.out.println("__");
        }
    }
}