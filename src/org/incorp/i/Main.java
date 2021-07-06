package org.incorp.i;

import java.util.Scanner;

import animals.Cats;
import animals.Dog;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogRun, dogSwim, catRun, catSwim;
        String dogName, catName;
        System.out.println("Как завут собаку");
        dogName = scan.nextLine();
        System.out.println("Сколько пес должен пробежать:");
        dogRun = scan.nextInt();
        System.out.println("Сколько пес должен проплыть:");
        dogSwim = scan.nextInt();
        System.out.println("Как завут кота");
        catName = scan.next();
        System.out.println("Сколько кот должен пробежать:");
        catRun = scan.nextInt();
        System.out.println("Сколько кот должен проплыть:");
        catSwim = scan.nextInt();
        Cats cat = new Cats(catName, catRun, catSwim);
        Dog dog = new Dog(dogName, dogRun, dogSwim);
        cat.runrun();
        System.out.println();
        cat.swimswim();
        System.out.println();
        dog.runrun();
        System.out.println();
        dog.swimswim();


    }
}
