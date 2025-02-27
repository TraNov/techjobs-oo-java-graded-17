package org.launchcode.techjobs.oo;

import java.util.Objects;
//
//  JobField extends:
//                   CoreCompetency
//                   Employer
//                   Location
//                   PositionType
//

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    @Override
    public  String toString(){
        return value;
    }

    @Override
    public  boolean equals(Object o){
        if (!(o instanceof PositionType)) return false;
        //PositionType positionType = (PositionType) o;
        JobField jobField=(JobField) o;
        return getId() == jobField.getId();
    } ;
    @Override
    public  int hashCode(){
        return Objects.hash(getId());

    } ;


}
