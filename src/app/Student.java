package app;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;


    // constructor: name, year
    public Student() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter student first name:");
        this.firstName = scan.nextLine();
        System.out.println("Enter student last name:");
        this.lastName = scan.nextLine();
        System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student grade level:");
        this.gradeYear = scan.nextInt();
        setStudentID();
    }

    // generate ID
    private void setStudentID() {
        // grade level + static id
        id++;
        this.studentID = gradeYear + "" + id;
    }
    // enroll in courses
    public void enroll() {
        do{
            System.out.println("Enter course to enroll, Q to quit: ");
            Scanner scan = new Scanner(System.in);
            String course = scan.nextLine();
            if (!course.equals("Q")){
                courses = courses + "\n\t" + course;
                tuitionBalance += costOfCourse;
            } else {
                break;
            }
        } while(true);
    }

    // view balance
    public void viewBalance() {
        System.out.println("Your balanece is: " + tuitionBalance);
    }
    // pay tuition
    public void payTuition() {
        viewBalance();
        Scanner scan = new Scanner(System.in);
        System.out.print("How much do you want to pay?: ");
        int payment = scan.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // Show status
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nStudent ID: " + studentID +
                "\nGrade level: " + gradeYear +
                "\nCourses enrolled: " + courses +
                "\nBalance: " + tuitionBalance;
    }
}
