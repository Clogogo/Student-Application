package application.database.student;

public class StudentAppListVariables {
    private static String firstName;
    private String lastName;
    private int studentGradeYr;
    private String studentUniID;
    private String studentCourse;
    private int tuitionBalance;
    private int totalCost = 0;
    private static int costOfCourse = 600;
    private static int iD = 1000;
    private int count;

    public  int getCostOfCourse() {
        return costOfCourse;
    }

    public  void setCostOfCourse(int costOfCourse) {
        this.costOfCourse = costOfCourse;
    }

    public static int getiD() {
        return iD;
    }

    public static void setiD(int iD) {
        StudentAppListVariables.iD = iD;
    }

    public static String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentGradeYr() {
        return studentGradeYr;
    }

    public void setStudentGradeYr(int studentGradeYr) {
        this.studentGradeYr = studentGradeYr;
    }

    public String getStudentUniID() {
        return studentUniID;
    }

    public void setStudentUniID(String studentUniID) {
        this.studentUniID = studentUniID;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public int getTuitionBalance() {
        return tuitionBalance;
    }

    public void setTuitionBalance(int tuitionBalance) {
        this.tuitionBalance = tuitionBalance;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
