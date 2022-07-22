package io.zipcoder.polymorphism;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainApplication {
    Scanner sc = new Scanner(System.in);
    private Integer numOfPets;

    public static void main(String[] args) {
        MainApplication m = new MainApplication();
        m.run();
    }

    void run() {
        getNumOfPets();

        if (numOfPets <=0) {
            System.out.println("you have no pets?...k bye");
        }
        else if (numOfPets ==1) {
            System.out.println("you have ONLY ONE pet");
        }
        else {
            System.out.println("you have mad pets");
            System.out.println("niceeee :)");
        }
    }


    Integer getNumOfPets() {
        System.out.println("Hi, how many pet do you have? ");
        numOfPets = sc.nextInt();
        sc.hasNextLine();

        return numOfPets;
    }

    String 



/*
    Map getPetNameAndType() {
        String petName;
        String petType;
        int count =1;
        Map<String, String> nameWithType = new HashMap<>();

        for (int n=0; n<numOfPets; n++) {
            System.out.println("\nWhat is your #" +count +" pet's name?");
            petName = sc.next();
            System.out.println("What kind of pet are they?");
            petType = sc.next();

            nameWithType.put(petName, petType);
            count++;
        }
        return nameWithType;
    }
*/
}

