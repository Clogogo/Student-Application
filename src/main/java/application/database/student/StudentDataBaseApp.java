package application.database.student;


import java.util.Scanner;

public class StudentDataBaseApp {
    public static void main(String[] args) {
        StudentDataBaseApp studentDataBaseApp = new StudentDataBaseApp();
        studentDataBaseApp.StoringStudentName();



    }
    public void StoringStudentName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Student : ");
        int numStudent = scanner.nextInt();
        StudentApp[] studentNum = new StudentApp[numStudent];
        for (int i = 0; i < numStudent; i++){
            studentNum[i] = new StudentApp();
            studentNum[i].studentInfo();
            System.out.println();
        }
    }
}

