package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    // Never use main method
    // Logic of main method is, for running the program is a entry point to java program.

//    First name starts with Cap and has
//    minimum 3 characters

    // 1) Check if vaid
    // 2) not starting with caps
    // 3)  Less than three chars

    @Test
    public void checking_if_firstName_is_valid(){
        UserRegistration userRegistrationObj = new UserRegistration();
        boolean isValid = userRegistrationObj.firstName("Amol");
        Assert.assertTrue(isValid);
    }

    // 2) not starting with caps
    // 3)  Less than three chars


}
