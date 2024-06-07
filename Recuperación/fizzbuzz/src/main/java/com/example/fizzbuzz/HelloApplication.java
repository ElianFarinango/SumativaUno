package com.example.fizzbuzz;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication{
    public static void main(String[] args) {
        int limitOfNumbers=100;
        for(int i=1;i<=limitOfNumbers;i++){
            if(i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
            }else if(i%3==0){
                System.out.println("fizz");
            }else if(i%5==0){
                System.out.println("buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}