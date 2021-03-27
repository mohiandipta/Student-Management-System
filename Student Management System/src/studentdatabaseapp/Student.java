package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // constructor: prompt user to enter student's name and year
    public Student() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Student first name: ");
        this.firstName = scan.nextLine();
        System.out.print("Enter Student last name: ");
        this.lastName = scan.nextLine();
        System.out
                .print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\n5 - Graduate\nEnter student class level: ");
        this.gradeYear = scan.nextInt();
        generateStudentID();
        // System.out.println(firstName + " " + lastName + " " + gradeYear + " " +
        // studentId);
    }

    // Generate ID
    private void generateStudentID() {
        // Grade level + ID
        id++;
        this.studentId = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll() {
        // Get inside a loop, user hits 0
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner scan = new Scanner(System.in);
            String course = scan.nextLine();

            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
        // System.out.println("Enrolled in: " + courses);
    }

    // View balance
    public void viewbalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // Pay tuition
    public void payTuition() {
        viewbalance();
        System.out.print("Enter your payment: $");
        Scanner scan = new Scanner(System.in);
        int payment = scan.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewbalance();
    }

    // Show status
    public String toString() {
        return "Name: " + firstName + lastName + "\nGrade level: " + gradeYear + "\nStudent ID: " + studentId
                + "\nCourses Enrolled: " + courses + "\nBalance: $" + tuitionBalance;
    }
}
