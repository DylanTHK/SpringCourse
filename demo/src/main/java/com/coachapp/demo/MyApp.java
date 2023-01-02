package com.coachapp.demo;

public class MyApp {
    public static void main(String[] args) {
        // create new instance of coach
        BaseballCoach myCoach = new BaseballCoach();

        // use the instance of coach
        System.out.println(myCoach.getDailyWorkout());
    }
}
