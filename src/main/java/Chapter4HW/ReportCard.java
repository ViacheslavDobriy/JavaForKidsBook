package Chapter4HW;

public class ReportCard {

    public static char convertGrades(int testResult) {
        char grade;
        if (testResult >= 90) {
            grade = 'A';
        } else if(testResult >=80) {
            grade = 'B';
        } else if (testResult >=70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        return grade;
    }

    public static void main(String[] args) {

        char yourGrade = ReportCard.convertGrades(75);
        System.out.println("Your result is - " + yourGrade);
    }
}
