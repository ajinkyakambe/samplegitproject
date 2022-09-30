package com.bridgelabz;

public class UserRegistration {

//    As a User need to
//    enter a valid First
//    Name
//- First name starts with Cap and has
//    minimum 3 characters

    // UC1 Regex day 19

    public boolean firstName(String firstName) {
        String nameRegex = "^[A-Z]{1}[a-z]{2,}$";
        return firstName.matches(nameRegex); // True or False

    }

    public boolean lastName(String lastName) {
        return true;

    }
}