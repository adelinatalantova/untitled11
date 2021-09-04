package com.company;

public class Main {

    public static void main(String[] args) {
        String[] name = {"Alina","Ars","Alana","Ali"};
        for (int i = 0;i < name.length; i++) {
            switch (name[i]){
                case "Alina":
                    System.out.println("Good morning!" + name [i]);
                    break;
                case "Ars":
                    System.out.println("Good day! " + name[i]);
                    break;
                case "Alana":
                    System.out.println("Good evening!" + name[i]);
                    break;
                case "Ali":
                    System.out.println("Good night!" + name[i]);
                    break;

        }

        }
    }
}
