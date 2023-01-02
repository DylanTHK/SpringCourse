package com.coachapp.demo;

public class MyApp {
    public static void main(String[] args) {
        // create new instance of coach
        Coach myCoach = new BaseballCoach();
        Coach golfCoach = new GolfCoach();

        // use the instance of coach
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(golfCoach.getDailyWorkout());

    }
}
