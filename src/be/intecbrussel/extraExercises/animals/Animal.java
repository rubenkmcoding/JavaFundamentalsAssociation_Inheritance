package be.intecbrussel.extraExercises.animals;

import javax.xml.namespace.QName;

public class Animal {

    //properties
    String name;
    String gender;
    int age;

    //making object
    Animal () {
        this("");
    }

    Animal (String name) {
        this (name, "");
    }

    Animal (String name, String gender) {
        this (name, gender, 0);
    }

    Animal (String name, String gender, int age) {
        this.setName(name);
        this.setGender(gender);
        this.setAge(age);
    }

    //setters
    void setName (String name) {
        this.name = name;
    }

    void setGender (String gender) {
        this.gender = gender;
    }

    void setAge (int age) {
        this.age = age;
    }

    //Getters
    String getName () {
        return name;
    }

    String getGender () {
        return gender;
    }

    int getAge () {
        return age;
    }
}
