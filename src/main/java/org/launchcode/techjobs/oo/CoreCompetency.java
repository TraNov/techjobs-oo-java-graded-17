package org.launchcode.techjobs.oo;

import java.util.Objects;
//
//  class CoreCompetency called from Job.class
//
public class CoreCompetency extends JobField {


    public CoreCompetency(String value) {
        super(value);
    }
}
//
//  Removed following code; replaced with Abstract class for JobField
//
//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public CoreCompetency() {
//        this.id = nextId;
//        nextId++;
//    }

// Custom toString, equals, and hashCode methods:

//  @Override
//    public String toString() {
//        return super.getValue();
//    }
//
//   @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof CoreCompetency)) return false;
//        CoreCompetency that = (CoreCompetency) o;
//        return getId() == that.getId();
//    }
//
//   @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }

// TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
//  ONLY a getter for the 'id' field.
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }