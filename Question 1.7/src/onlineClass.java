public class onlineClass extends courseRegistration {
    private String programCode;

    public onlineClass(String studentID, String studentName, int studentAge, char studentGender, int studentType,
            String programCode) {
        super(studentID, studentName, studentAge, studentGender, studentType);
        this.programCode = programCode;
    }

    public String getProgramCode() {
        return this.programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public double calculateFee() {
        double fee = 0;

        if (getStudentType() == 1) {
            fee = 1600;
            if (programCode.equals("COMP")) {
                fee *= 0.6;
            } else if (programCode.equals("ENG")) {
                fee *= 0.35;
            }
        } else if (getStudentType() == 2) {
            fee = 2100;
            if (programCode.equals("COMP")) {
                fee *= 0.7;
            } else if (programCode.equals("ENG")) {
                fee *= 0.75;
            }
        }

        return fee;
    }

    public String toString() {
        return super.toString() + "\nProgram Code: " + programCode;
    }

}
