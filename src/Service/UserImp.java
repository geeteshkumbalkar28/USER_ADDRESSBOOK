package Service;

import Interface.UserInterface;
import model.User;

import java.util.Scanner;

 public class UserImp extends UserInterface {
    User userArr[];
    int index = 0;
    Scanner scanner = new Scanner(System.in);

     @Override
     public void InsArray() {
         System.out.println("enter users size that you want to create");
         int sizeUser = scanner.nextInt();
        userArr = new User[sizeUser];
     }

     public void createUser(){

            User user=new User();
            System.out.println("Enter your first Name");
            user.setFirstName(scanner.next());

            System.out.println("Enter your last Name");
            user.setLastName(scanner.next());

            userArr[index] = user;
            index++;
            System.out.println("your user created");


    }
    public void displayUser(){
        for (int i=0;i<index;i++){

            System.out.println(userArr[i].toString());

        }
    }
    public void updateUser(){
        System.out.println("enter your firstName that you want to update");
        String input = scanner.next();

        for (int i=0;i<userArr.length;i++){
            if (input.equals(userArr[i].getFirstName())){
                User user=new User();
                System.out.println("Enter your first Name");
                user.setFirstName(scanner.next());

                System.out.println("Enter your last Name");
                user.setLastName(scanner.next());

                userArr[i] = user;
                System.out.println("your user has been updated");
            }
        }
    }
    public void delete(){
        System.out.println("enter your firstName that you want to delete");
        String input = scanner.next();

        for (int i=0;i<userArr.length;i++){
            if (input.equals(userArr[i].getFirstName())){
                User user=new User();
                user.setFirstName(null);

                user.setLastName(null);

                userArr[i] = user;
                System.out.println("your user has been updated");
            }
        }
    }

}
