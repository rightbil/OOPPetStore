package com.company;

import java.util.Scanner;

public class AnimalApp {
    public static void print(Object string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
        //register animals
        Scanner sc = new Scanner(System.in);
        print("Animal App is loading.....");
        Animal dog = new Animal();
        print("Enter Details of Animal: ");
        print("Name ?");
        dog.setName(sc.next());
        print("Type ?");
        dog.setType(sc.next());
        print("Description ?");
        dog.setDescription(sc.next());
        print("Animal details are: ");
        print(dog.getName());
        print(dog.getType());
        print(dog.getDescription());

    }
}
