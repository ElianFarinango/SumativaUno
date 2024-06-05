package com.example.sumativainicial;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication{
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Please introduce your number of scalons: ");
        int numberOfScalons=number.nextInt();
        if(numberOfScalons>0){
            for(int k=0;k<=numberOfScalons-1;k++){
                if(k%2==0){
                    System.out.println("_");
                }else{
                    System.out.println("|");
                }
            }
            for(int j=0;j<=numberOfScalons-1;j++) {
                System.out.println(" ");
            }
        }else if(numberOfScalons<0){
            for(int j=0;j<=numberOfScalons-1;j++) {
                System.out.println(" ");
            }
            for(int k=0;k<=numberOfScalons;k++){
                if(k%2==0){
                    System.out.println("_");
                }else{
                    System.out.println("|");
                }
            }

        }
    }
}