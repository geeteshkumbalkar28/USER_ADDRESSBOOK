package controller;

import Interface.UserInterface;
import service.UserImp;

public class UserController {
    public static void main(String[] args) {
        UserInterface userInterface=new UserImp();
        try {

            userInterface.create();

        }catch (Exception e){
            System.out.println(e);
        }
        userInterface.display();

    }
}
