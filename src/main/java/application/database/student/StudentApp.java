package application.database.student;

import java.util.Scanner;

public class StudentApp extends StudentAppListVariables {


    public StudentApp() {
        Scanner input = new Scanner(System.in);

        //Enter First Name

        System.out.print("Enter Student FirstName : ");
        this.setFirstName(input.nextLine().toUpperCase());

        //Enter Last Name
        System.out.print("Enter Student LastName : ");
        this.setLastName(input.nextLine().toUpperCase());

        //Enter Student Grade Level
        System.out.println("Enter Student Grade Level : ");
        System.out.println(" 1) Freshemen \n 2) Second Year Student \n 3) Final Year Student \n 4) Master Student ");
        System.out.print("::");
        this.setStudentGradeYr(input.nextInt());

        //Create Student ID
        setStudentID();


        // Enrolling courses
        enroll();

        //Student making tuition fee
        payingTuitionfee();

        //Showing the balance for the student
        studentBalance();

        //showing information
        studentInfo();


    }


    private void setStudentID() {
        setiD(getiD() + 1);
        this.setStudentUniID(getStudentGradeYr() + "" + getiD());

    }

    //Enroll For Courses
    public void enroll() {
        int cont = 1;
        int result = 0;
        StringBuilder builder = new StringBuilder();

        do {

            System.out.print("Enter course to Enroll (Q to quit)");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine().toUpperCase();


            // Calculating for Number Of Course Input and Listing them
            if (!course.equals("Q")) {

                setCount(cont);
                setStudentCourse(course);
                builder.append(getStudentCourse());
                setStudentCourse(String.valueOf(builder));
                builder.append("\n");
                cont++;

            } else {
                break;
            }

        } while (0 != 1);
        result = getCostOfCourse() * getCount();
        setCostOfCourse(result);


        System.out.println("STUDENT ENROLLED IN : " + "\n" + getCount() + " COURSE " + "\n" + builder);
        System.out.println("STUDENT SELECTED COURSE FEES  : $" + " " + result);

    }

    //Student School Fees Payment
    public void payingTuitionfee() {
        int payment;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("ENTER STUDENT COURSE FEE PAYMENT : $");
            payment = input.nextInt();

        } while (payment < getCostOfCourse());
        setTotalCost(payment);

    }

    public int studentBalance() {
        int total = getTotalCost() - getCostOfCourse();
        setTuitionBalance(total);
        return total;
    }

    public void studentInfo() {
        System.out.println("STUDENT NAME : " + getFirstName() + " " + getLastName() + "\nIDENTIFICATION NUMBER :" + getStudentUniID() + "\nGRADE YEAR : " + getStudentGradeYr() + "\nCOURSES ENROLLED : "
                + "\n" + getStudentCourse() + "\n"
                + "\nBALANCE FEE : $" + studentBalance());

    }


}




