package com.codegym;

public class Student {
    private String name = "John";
    private String classes = "CO2";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void setName1(String name){
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    protected void setClasses2(String classes2){
        this.classes = classes2;
    }
}
