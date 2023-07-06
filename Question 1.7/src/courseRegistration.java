public abstract class courseRegistration {
    private String studentID;
    private String studentName;
    private int studentAge;
    private char studentGender;
    private int studentType;

    public courseRegistration(String studentID, String studentName, int studentAge, char studentGender,
            int studentType) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
        this.studentType = studentType;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return this.studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public char getStudentGender() {
        return this.studentGender;
    }

    public void setStudentGender(char studentGender) {
        this.studentGender = studentGender;
    }

    public int getStudentType() {
        return this.studentType;
    }

    public void setStudentType(int studentType) {
        this.studentType = studentType;
    }

    public abstract double calculateFee();

    public String toString() {
        return "Student ID: " + studentID + "\nStudent Name: " + studentName + "\nStudent Age: " + studentAge
                + "\nGender: " + studentGender + "\nStudent Type: " + studentType;
    }

}