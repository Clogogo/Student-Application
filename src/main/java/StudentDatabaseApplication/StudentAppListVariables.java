package StudentDatabaseApplication;

public class StudentAppListVariables {
    protected String firstName;
    protected String lastName;
    protected int studentGradeYr;
    protected String studentUniID;
    protected String studentCourse ="" ;
    protected int tuitionBalance;
    protected final static int costOfCourse = 600;
    protected final static int iD = 1000;
    protected int count = 0;

    public static int getCostOfCourse() {
        return costOfCourse;
    }

    public static void setCostOfCourse(int costOfCourse) {
        StudentAppListVariables.costOfCourse = costOfCourse;
    }

    public static int getiD() {
        return iD;
    }

    public static void setiD(int iD) {
        StudentAppListVariables.iD = iD;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
