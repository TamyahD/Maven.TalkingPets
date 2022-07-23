package io.zipcoder.polymorphism;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.*;

public class MainApplication {
    Map<String, String> petMap = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    private Integer numOfPets;

    public static void main(String[] args) {
        MainApplication m = new MainApplication();
        m.run();
    }

    void run() {
        getNumOfPets();

        if (numOfPets <= 0) {
            System.out.println("you have no pets?...k bye");
        } else if (numOfPets >= 1) {
            getPetInfo();
            System.out.println(petMap.toString() + "\n");

            for (Map.Entry<String, String> el : petMap.entrySet()) {
                switch (el.getValue()) {
                    case "Dog":
                        Dog d = new Dog(el.getKey());
                        System.out.println(d.getName() + " says " + d.speak());
                        break;
                    case "Cat":
                        Cat c = new Cat(el.getKey());
                        System.out.println(c.getName() + " says " + c.speak());
                        break;
                    case "Chinchilla":
                        Chinchilla ch = new Chinchilla(el.getKey());
                        System.out.println(ch.getName() + " says " + ch.speak());
                        break;
                    default:
                        OtherPet op = new OtherPet(el.getKey());
                        System.out.println("idk what this pet is but..." +
                                op.getName() + " says " + op.speak());
                        break;
                }
            }
        }
    }


/*
    public String capitalizeAll(String str) {
        String[] arr = str.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)))
                    .append(arr[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }
*/

    Integer getNumOfPets() {
        System.out.println("Hi, how many pet do you have? ");
        numOfPets = sc.nextInt();
        sc.hasNextLine();

        return numOfPets;
    }

    Map<String, String> getPetInfo() {
        int count = 1;

        for (int n = 0; n < numOfPets; n++) {
            System.out.println("What is pet #" + (count) + "'s name? ");
            String petName = sc.next();
            System.out.println("What kind of pet is " + petName + "? ");
            String petType = sc.next();

            petMap.put(StringUtils.capitalize(petName),
                    StringUtils.capitalize(petType));
            count++;
        }
        return petMap;
    }
}

