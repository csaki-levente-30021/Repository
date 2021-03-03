package com.example.school;

import javax.swing.plaf.basic.BasicTreeUI;

public class School {
    String name;
    int age;
    String schoolName;
    String city;

    public School(String fn, int ag, String schname, String cityes) {
        name = fn;
        age = ag;
        schoolName = schname;
        city = cityes;
    }

    public void displaySchool() {
        System.out.println("Student name: " + name);
        System.out.println("Age: " + age);
        System.out.println("School name: " + schoolName);
        System.out.println("City: " + city);
        System.out.println("\n");
    }

    public static void main(String[] args) {
        School s1 = new School("John", 18, "Utcn", "Cluj");
        s1.displaySchool();

        School s2 = new School("Fred", 22, "Ubb", "Oradea");
        s2.displaySchool();

        School s3 = new School("Tom", 21, "Utb", "Brasov");
        s3.displaySchool();

        School s4 = new School("Joseph", 25, "Umft", "Timisoara");
        s4.displaySchool();
    }
}
