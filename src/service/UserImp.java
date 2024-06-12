package service;

import Interface.UserInterface;
import model.User;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserImp implements UserInterface {
    Scanner scanner =new Scanner(System.in);
    User userArr[] = new User[5];
    @Override
    public void create() {
        System.out.println("Enter the size");
        int size = scanner.nextInt();

        for (int i=0;i<size;i++){
            User user = new User();
            System.out.println("enter the first Name");
            String firstName = scanner.next();
            if (isNameValid(firstName)){
                user.setFirstName(firstName);
            }else {
                throw new RuntimeException("firstName invalid Ex : Geetesh");
            }


            System.out.println("enter the last Name");
            String lastName = scanner.next();
            if (isNameValid(lastName)){
                user.setLastName(lastName);
            }else {
                throw new RuntimeException("lastName invalid Ex : Geetesh");
            }

            userArr[i] = user;
            System.out.println("Your user creted ");

        }
    }

    @Override
    public void display() {
        for (int i =0;i<userArr.length;i++){
            if (!userArr[i].equals(null)){

                System.out.println(userArr[i].toString());

            }}
    }

    @Override
    public void update() {
        System.out.println("enter the firstName");
        String firstname = scanner.next();

        for (int i = 0;i<userArr.length;i++){
            if (!userArr[i].equals(null) && (userArr[i].getFirstName()).equals(firstname)){

                System.out.println("enter the first Name");
                String firstName = scanner.next();
                if (isNameValid(firstName)){
                    userArr[i].setFirstName(firstName);
                }else {
                    throw new RuntimeException("firstName invalid Ex : Geetesh");
                }


                System.out.println("enter the last Name");
                String lastName = scanner.next();
                if (isNameValid(lastName)){
                    userArr[i].setLastName(lastName);
                }else {
                    throw new RuntimeException("lastName invalid Ex : Geetesh");
                }


                System.out.println("Your user updated ");
            }
        }

    }

    @Override
    public void delete() {
        System.out.println("enter the firstName");
        String firstname = scanner.next();

        for (int i = 0;i<userArr.length;i++){
            if (!userArr[i].equals(null) && (userArr[i].getFirstName()).equals(firstname)){



                    userArr[i].setFirstName(null);




                    userArr[i].setLastName(null);



                System.out.println("Your user deleted ");
            }
        }
    }

    public boolean isNameValid(String name){
        boolean output = Pattern.matches("^[A-Z]{1}[a-z]{1,10}",name);
        return output;
    }
}
