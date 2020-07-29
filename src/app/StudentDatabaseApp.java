package app;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {

        // Ask how many students we want to add
        System.out.println("Enter number of stundets to enroll:");
        Scanner scan = new Scanner(System.in);
        int numOfStudents = scan.nextInt();
        Student[] students = new Student[numOfStudents];


        // Create n number of new students
        for (int n = 0; n < numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println(students[i].toString());
        }
    }
}
