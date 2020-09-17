package com.company;


public class Main {

    public static void main(String[] args) {
        byte myAge = 18,  yearOfStudy = 2, numOfCats = 2;
        double numOfGuitars = 2.5;
        short numPianoKeys = 88;
        int minHz = 20, maxHz = 20000, catHz = 77000;
        boolean f = true;
        String myName = "Daniel", myProf = " year student at Chernivtsi National University";

        System.out.println("My name is "+ myName + ". I'm " + myAge + " years old and i'm a " + yearOfStudy +
                            myProf + ".\nI have " + numOfGuitars + " guitars(one of them is an ukulele)." +
                            "\nStandart piano has " + numPianoKeys + " keys." +
                            " And a human ear can hear sounds in a range of " + minHz +"Hz " + "up to " + maxHz + "Hz." +
                            "\nI have " + numOfCats + " cats." + " Cats can hear frequencies up to "  + catHz + " Hz." +
                            "\nThese statements are " + f + ".");


        
    }
}