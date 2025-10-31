public class StudentMarksReport {
    public static void main(String[] args) {
        Object[] marks = {"85", 95, Integer.valueOf(88), "null", null, "90"};

        int sum = 0;
        int count = 0;

        for (Object mark : marks) {
            Integer value = null;

            if (mark instanceof Integer) {
                value = (Integer) mark;
            } else if (mark instanceof String) {
                try {
                    if (!mark.equals("null")) {
                        value = Integer.valueOf((String) mark);
                    }
                } catch (NumberFormatException e) {
                    value = null;
                }
            }

            if (value != null) {
                sum += value;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of valid marks: " + average);
        } else {
            System.out.println("No valid marks available.");
        }
    }
}
