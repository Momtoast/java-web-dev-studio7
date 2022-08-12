package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        DVD classics = new DVD("Film Noir", 4.7, "DVD", "no");
        DVD romcoms = new DVD("Hugh Grant", 4.7, "DVD", "no");
        CD classical = new CD("Tchaikovsky", 700, "CD");
        CD classicRock = new CD("Queen", 700, "CD");

        classics.spinDisc();
        classical.spinDisc();

        classicRock.laserWrite("Bohemian Rhapsody", 4);
        classicRock.laserWrite("We are the Champions", 3);

        System.out.println(classicRock.listenTo());

        System.out.println(classicRock.toString());

        romcoms.laserWrite("Sense and Sensibility", 200);
        System.out.println(romcoms.watch());


        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
