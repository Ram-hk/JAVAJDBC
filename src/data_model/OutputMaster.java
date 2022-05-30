package data_model;

public class OutputMaster {
    private static int indexNo;
    private static String studentName, studentBranch;

    public static String getStudentBranch() {
        return studentBranch;
    }
    public static String getStudentName() {
        return studentName;
    }
    public static int getIndexNo() {
        return indexNo;
    }
    public static void setIndexNo(int indexNo) {
        OutputMaster.indexNo = indexNo;
    }
    public static void setStudentBranch(String studentBranch) {
        OutputMaster.studentBranch = studentBranch;
    }
    public static void setStudentName(String studentName) {
        OutputMaster.studentName = studentName;
    }
    
}
