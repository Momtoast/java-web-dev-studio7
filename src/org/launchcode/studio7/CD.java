package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {

    static final int minSpeed = 200;
    static final int maxSpeed = 500;

    public CD(String name, double capacity, String type) {
        super(name, capacity, type);
    }

    public String listenTo() {
        return "You are listening to " + super.getContents();
    }

    public void spinDisc() {
        System.out.println("A " + super.getType() + " spins at a rate of " + this.minSpeed + " to " + this.maxSpeed);
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
