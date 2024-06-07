package service;

import Interface.UserInterface;
import model.User;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserImp implements UserInterface {
    Scanner scanner =new Scanner(System.in);
    User user=new User();

    @Override
    public void create() {
        System.out.println("enter the firstName");
        String firstName = scanner.next();
        if (isNameValid(firstName)){
            user.setFirstName(firstName);
        }else {
            throw new RuntimeException("Your first name is invalid EX:::(Geetesh)");
        }
        System.out.println("enter the lastName");
        String lastName = scanner.next();

        if (isNameValid(lastName)){
            user.setLastName(lastName);
        }else {
            throw new RuntimeException("Your lastName name is invalid EX:::(Geetesh)");
        }
    }

    @Override
    public void display() {
        System.out.println(user.toString());
    }

    public boolean isNameValid(String name){
        boolean output = Pattern.matches("^[A-Z]{1}[a-z]{1,10}",name);
        return output;
    }
}
