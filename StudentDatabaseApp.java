package studentdatabase;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        System.out.println("Enter No. of Students: ");
        Scanner in = new Scanner(System.in);
        int numberofStudents = in.nextInt();
        Student[] students = new Student[numberofStudents];

        for (int n = 0; n < numberofStudents; n++) {
            students[n] = new Student();
            students[n].select();
            students[n].payFees();
            System.out.println(students[n].toString());
        }
    }
}