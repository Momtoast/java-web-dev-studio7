package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc{

    static final int minSpeed = 570;
    static final int maxSpeed = 1600;
    private String blueray;

    public DVD(String name, double capacity, String type, String blueray) {
        super(name, capacity, type);
        this.blueray = blueray;
    }

    public String watch() {
        return "You are watching " + super.getContents();
    }

    public void spinDisc() {
        System.out.println("A " + super.getType() + " spins at a rate of " + this.minSpeed + " to " + this.maxSpeed);
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
