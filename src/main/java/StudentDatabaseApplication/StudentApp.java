package StudentDatabaseApplication;

import java.io.File;
import java.util.Scanner;

public class StudentApp extends StudentAppListVariables {


    public StudentApp() {
        Scanner input = new Scanner(System.in);

        //Enter First Name
        System.out.print("Enter Student FirstName : ");
        this.setFirstName(input.nextLine());
        //Enter Last Name
        System.out.print("Enter Student LastName : ");
        this.setLastName(input.nextLine());
        //Enter Student Grade Level
        System.out.println("Enter Student Grade Level : ");
        System.out.println(" 1) Freshemen \n 2) Second Year Student \n 3) Final Year Student \n 4) Master Student ");
        System.out.print("::");
        this.setStudentGradeYr(input.nextInt());
        //Create Student ID
        setStudentID();

        //  System.out.println("Student Full Name : " + getFirstName() + " " + this.getLastName() + " " + getStudentGradeYr() + " " + getStudentUniID());

        enroll();


    }

    private void setStudentID() {
        setiD(getiD() + 1);
        this.setStudentUniID(getStudentGradeYr() + "" + getiD());

    }

    //Enroll For Courses
    public void enroll() {
        do {
            System.out.print("Enter course to Enroll (Q to quit)");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine().toUpperCase();



            if (!course.equals("Q")) {
                count++;
                studentCourse +=course;
                tuitionBalance += costOfCourse;

            } else {
                break;
            }
        } while (0 != 1);

        System.out.println("STUDENT ENROLLED IN : " + "\n" + getCount() + " COURSE " + "\n" + getStudentCourse());
        System.out.println("STUDENT TUITION BALANCE  : " + getTuitionBalance());

    }

    public void writeFile(){
        File file = new File("");

    }
}

