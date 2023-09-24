package org.launchcode.techjobs.oo;

import java.util.Objects;
//
//  class Employer called from Job.class
//
public class Employer extends JobField {


    public Employer(String value) {
        super(value);
    }

}
//
//  Removed following code; replaced with Abstract class for JobField
//
//    private int id;
//    private static int nextId = 1;
//    private String value;

//    public Employer() {
//       super();
//    }
    // Custom toString, equals, and hashCode methods:

//   @Override
//   public String toString() {return super.getValue();
//   }
//
//  @Override
//    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
//        if (this == o) return true;
//        if (!(o instanceof Employer)) return false;
//        Employer employer = (Employer) o;
//        return getId() == employer.getId();
//    }
//
//   @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }

    // Getters and Setters:

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

