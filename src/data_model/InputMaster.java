package data_model;

public class InputMaster {
    private static String studentName ;
    private static String studentBranch;

    public static String getStudenntName() {
        return studentName;
    }

    public static String getStudentBaranch() {
        return studentBranch;
    }

    public static void setStudentName(String studenntName) {
        InputMaster.studentName = studenntName;
    }
    public static void setStudentBranch(String studentBaranch) {
        InputMaster.studentBranch = studentBaranch;
    }

    
}
