package com.example.whereistherobot;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication  {
    public static void main(String[] args) {
        int positionInX=0;
        int positionInY=0;
        Scanner move=new Scanner(System.in);
        Scanner steps= new Scanner(System.in);
        System.out.println("Escribe el numero de pasos");
        int numberOfSteps=steps.nextInt();
        int[] movements= new int[numberOfSteps];
        for(int i=0;i<=numberOfSteps-1;i++){
            System.out.println("Step: "+(i+1));
            movements[i]=move.nextInt();
            if (i % 3 == 0) {
                if (movements[i]>0) {
                    positionInY=movements[i]-positionInY;
                }else{
                    positionInY=movements[i]+positionInY;
                }
            }
            if (i % 2 == 0) {
                if (movements[i]>0) {
                    positionInX=movements[i]-positionInX;
                }else{
                    positionInX=movements[i]+positionInX;
                }
            }
        }
        System.out.println("X: "+positionInY+", Y: "+positionInX);
    }
}