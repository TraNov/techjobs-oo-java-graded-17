package org.launchcode.techjobs.oo;

import java.util.Objects;
//
//  class PositionType called from Job.class
//
public class PositionType extends JobField {

    public PositionType(String value) {
        super(value);
    }

}

//
//  Removed following code; replaced with Abstract class for JobField
//
//    private int id;
//    private static int nextId = 1;
//    private String value;

//    public PositionType() {
//        id = nextId;
//        nextId++;
//    }
    // TODO: Add a custom toString() method that returns the data stored in 'value'.
//@Override
//  public String toString(){return value;}
    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

//  @Override
//  public boolean equals(Object o) {  // Two objects are equal if they have the same id.if (this == o) return true;
//       if (!(o instanceof PositionType)) return false;
//       PositionType positionType = (PositionType) o;
//       return getId() == positionType.getId();
//   }

//    @Override
//  public int hashCode() {
//        return Objects.hash(getId());
//    }
//    // Getters and Setters:
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
