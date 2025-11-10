public class StudentGradeParser {
    public static void main(String[] args) {
        String[] grades = {"90", "A+", "85", "B", "100"}; // sample grade list

        for (String grade : grades) {
            try {
                int numericGrade = Integer.parseInt(grade); // attempt to convert
                System.out.println("Valid grade: " + numericGrade);
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid grade input: " + grade);
            }
        }
    }
}
