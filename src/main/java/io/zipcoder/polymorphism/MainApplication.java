package io.zipcoder.polymorphism;

import java.util.*;

public class MainApplication {
    List<Pet> petList = new ArrayList<>();
    Map<String, String> petMap = new HashMap<>();
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
            getPetInfo();
            System.out.println(petMap.toString() +"\n");

            for (Map.Entry<String, String> el : petMap.entrySet()) {
                switch (el.getValue()) {
                    case "Dog":
                        Dog d = new Dog(el.getKey());
                        System.out.println(d.getName() +" says "+d.speak());
                        break;
                    case "Cat":
                        Cat c = new Cat(el.getKey());
                        System.out.println(c.getName()+" says "+c.speak());
                        break;
                    case "Guinea Pig":
                        GuineaPig gp = new GuineaPig(el.getKey());
                        System.out.println(gp.getName()+" says "+gp.speak());
                        break;
                    default:
                        OtherPet op = new OtherPet(el.getKey());
                        System.out.println("idk what this pet is but...\n" +
                                op.getName() +" says "+op.speak());
                        break;
                }
            }
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

    Map<String, String> getPetInfo() {
        String petName;
        String petType;
        System.out.println("What is your pet's name?");
        petName = sc.next();
//        sc.next();
        System.out.println("What kind of pet is " +petName +"?");
        petType = sc.next();


        petMap.put(petName, petType);

        return petMap;
    }



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

