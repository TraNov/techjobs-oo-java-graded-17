package org.launchcode.techjobs.oo;

import java.util.Objects;
//
//  class PositionType called from Job.class
//  class Job calls:
//                   CoreCompetency
//                   Employer
//                   Location
//                   PositionType
//
public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        id=nextId;
        nextId++;
    }
    public Job(String name,Employer employer,Location location,PositionType positionType,
               CoreCompetency coreCompetency){
        this();
        this.name=name;
        this.employer=employer;
        this.location=location;
        this.positionType=positionType;
        this.coreCompetency=coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
//
//    @Override
//    public String toString() {
//        return "\n  \n";
//    }

    @Override
    public String toString() {
        String emp=employer.getValue();
        String loc=location.getValue();
        String pos=positionType.getValue();
        String core=coreCompetency.getValue();
        if (this.name==""){
            this.name="Data not available";
        }
        if(emp==""){
            emp="Data not available";
        }
        if(loc==""){
            loc="Data not available";
        }
        if(pos==""){
            pos="Data not available";
        }
        if(core==""){
            core="Data not available";
        }
        //
        // Issues with TestTaskFive.testToStringStartsAndEndsWithNewLine():
        //              lineSeparator: Windows "/r/n" vs Unix "/n"
        //
        String lineSeparator = System.lineSeparator();
        lineSeparator = System.getProperty("line.separator");
        String strOut = lineSeparator +
                "ID: " + id +
                lineSeparator + "Name: " + name +
                lineSeparator + "Employer: " + emp +
                lineSeparator + "Location: " + loc +
                lineSeparator + "Position Type: " + pos +
                lineSeparator + "Core Competency: " + core +
                lineSeparator;
        return "\n" +
                "ID: " + id +
                "\nName: " + name +
                "\nEmployer: " + emp +
                "\nLocation: " + loc +
                "\nPosition Type: " + pos +
                "\nCore Competency: " + core +
                "\n";
    }


// TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
