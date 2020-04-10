package studentdatabase;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int Year;
    private String RegNo;
    private String subjects= "";
    private int fees=0;
    private static int feesofsubject = 10000;
    private static int no=1000;

    //Constructor to tell student to add Name and Year

    public Student() {
        Scanner in= new Scanner(System.in);

        System.out.print("Student First Name: ");
        this.firstName=in.nextLine();

        System.out.print("Student Last Name: ");
        this.lastName=in.nextLine();

        System.out.print("1: First Year\n2: Second Year\n3: Third Year\n4: Final Year\nEnter Student Year: ");
        this.Year=in.nextInt();

        setRegNo();

        System.out.println(firstName + " " + lastName + " " + Year + " " + RegNo);

    }

    // Unique Registeration Number
    private void setRegNo() {
        // Reg. no will be 1st no. of the year and then static int
        no++; //just incrementing no from 1000
        this.RegNo = Year + "" + no;

    }

    //Subjects
    public void select(){
        do{
            System.out.print("Enter subjects to selects (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String subject = in.nextLine();
            if (!subject.equals("Q")) {
                 subjects = subjects + "\n" + subject;
                 fees = fees + feesofsubject;
            }
            else {
                break;
            }
        } while (1!=0);
    }

    //fees
    public void viewFees(){

        System.out.println("Your pending Fees is: $" + fees);
    }

    //paying fees
    public void payFees(){
        viewFees();
        System.out.print("Enter your Payment: $");
        Scanner in=new Scanner(System.in);
        int payment= in.nextInt();
        fees=fees-payment;
        System.out.println("Payment Done! Thank You for Paying: $" + payment);
        viewFees();
    }

    //current status
    public String toString(){
        return "Name: " + firstName + " " + lastName +
                "\nYear: " + Year +
                "\nRegistration No.: " + RegNo +
                "\nSubjects Selected:" + subjects +
                "\nPending Fees: $" + fees;
    }
}
