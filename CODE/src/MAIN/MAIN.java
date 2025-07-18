package MAIN;

import AIROPLANE.*;
import BUS.BUSLINE;
import SIGN_UP_LOG_IN.VALIDITY;
import TRAINLINE.TRAINLINE;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MAIN {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> mobileNumbers = new ArrayList<>();
    static ArrayList<String> emails = new ArrayList<>();
    static ArrayList<String> passwords = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Already Have An Account!!!\nThan Press 1 For Sign_in");
        System.out.println("New User... \nThan Press 2 For Log_In");


        int choise= sc.nextInt();
        switch (choise){
            case 1:
            {
                VALIDITY.sign_in();
                break;
            }
            case 2:
            {
                VALIDITY.login();
                System.out.println("Press 1 for Flight Booking");
                System.out.println("Press 2 for Train Booking");
                System.out.println("Press 3 for Bus Booking ");
                int input= sc.nextInt();
                switch (input) {
                    case 1: {
                        AIRLINE.run();
                        break;
                    }
                    case 2: {
                        TRAINLINE.run();
                        break;
                    }
                    case 3: {
                        BUSLINE.run();
                    }
                    default:{
                        System.out.println("Enter Valid Choice !!!");
                    }
                    break;
                }
            }

            default:
            {
                System.out.println("Enter Valid Choice !!!");
            }
        }
    }
}








