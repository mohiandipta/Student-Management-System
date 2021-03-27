package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) throws Exception {

        // Ask how many new studentd we want to add
        System.out.println("______________________________________");
        System.out.println("Enter number of new students to enroll: ");
        Scanner scan = new Scanner(System.in);
        int numOfStudents = scan.nextInt();
        Student[] students = new Student[numOfStudents];

        // create n number of new student
        for (int n = 0; n < numOfStudents; n++) {
            Student student1 = new Student();
            System.out.println("______________________________________");
            student1.enroll();
            System.out.println("______________________________________");
            student1.payTuition();
            System.out.println("______________________________________");
            System.out.println(student1.toString());
        }
    }
}
