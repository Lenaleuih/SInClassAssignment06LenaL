package com.example.android.sinclassassignment06_lenal;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;
    private int numberOfLegs;
    private boolean hasFur;
    private String animalClass;
    private String additioanlInformation;

    public Animal(String name, int numberOfLegs, boolean hasFur, String animalClass, String additioanlInformation) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
        this.animalClass = animalClass;
        this.additioanlInformation = additioanlInformation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean whetherHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    public String getAdditioanlInformation() {
        return additioanlInformation;
    }

    public void setAdditioanlInformation(String additioanlInformation) {
        this.additioanlInformation = additioanlInformation;
    }

    public String toString() {
        String n = "Animal Type/Name: " + name;
        String nl = "Number of Legs: " + numberOfLegs;
        String ac = "Animal Class:" + animalClass;
        String hf = "Does it have Fur?" + Boolean.toString(hasFur);
        String oi = "Any Additional Information: " + additioanlInformation;
        return n + "\n" + nl + "\n" + ac + "\n" + hf + "\n" + oi;


    }
}
