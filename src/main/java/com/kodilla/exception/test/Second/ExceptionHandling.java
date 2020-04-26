package com.kodilla.exception.test.Second;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();
        String result = "";
        try {
            result = secondChallenge.probablyIWillThrowException(0,1);
        } catch (Exception e) {
            System.out.println("Errorr: " + e);
            result = "Error occurred!";
        } finally {
            System.out.println(result);
        }
    }
}
