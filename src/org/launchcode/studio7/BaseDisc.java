package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.Objects;

public abstract class BaseDisc {

    private String name;
    private double capacity;
    private ArrayList<String> contents = new ArrayList<>();
    private String type;
    private boolean inserted = false;
    private double freeSpace;

    public BaseDisc(String name, double capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
        this.freeSpace = capacity;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public void setContents(ArrayList<String> contents) {
        this.contents = contents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isInserted() {
        return inserted;
    }

    public void setInserted(boolean inserted) {
        this.inserted = inserted;
    }

    public double getFreeSpace() {
        return freeSpace;
    }

    public void setFreeSpace(double freeSpace) {
        this.freeSpace = freeSpace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseDisc baseDisc = (BaseDisc) o;
        return getName().equals(baseDisc.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Current Disc{" + name + '\'' +
                ", Capacity = " + capacity +
                ", Type = '" + type + '\'' +
                ", Space Available = " + freeSpace +
                '}';
    }

    public void insert() {
        this.inserted = true;
    }

    public void eject() {
        this.inserted = false;
    }

    public void laserWrite(String file, int size) {
        contents.add(file);
        freeSpace = freeSpace - size;
    }
}
