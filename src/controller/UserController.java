package controller;

import Interface.UserInterface;
import Service.UserImp;

import java.util.Scanner;


public class UserController {
    public static void main(String[] args) {

        UserImp userImp = new UserImp();
        userImp.InsArray();
        Scanner scanner = new Scanner(System.in);
        int condition = 0;
        while (true){
            System.out.println("enter your condition ");
            condition = scanner.nextInt();
            if(condition==1){
                userImp.createUser();
            }
            else if(condition == 2){
                userImp.displayUser();

            }else if(condition == 3){
                userImp.updateUser();

            }else if(condition == 4){
                userImp.delete();

            }else if(condition == 10){
                break;

            }else{
                System.out.println("your condition is invalid");
            }
        }


    }
}
