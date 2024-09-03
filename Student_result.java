import java.util.Scanner;

class Student_result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER THE TOTAL NO OF SUBJECTS:");
        int num_Sub = scanner.nextInt();

        int total_Marks = 0;

        for (int i = 0; i < num_Sub; i++) {
            System.out.println("ENTER THE MARKS FOR SUBJECT " + (i + 1) + ":");
            int marks = scanner.nextInt();
            total_Marks += marks;
        }

        double average_Percentage = (double) total_Marks / num_Sub;

        String grade = getGrade(average_Percentage);

        System.out.println("Total Marks: " + total_Marks);
        System.out.println("Average Percentage: " + average_Percentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static String getGrade(double average_Percentage) {
        if (average_Percentage >= 90) {
            return "A";
        } else if (average_Percentage >= 80) {
            return "B";
        } else if (average_Percentage >= 70) {
            return "C";
        } else if (average_Percentage >= 60) {
            return "D";
        } else {
            return "Fail";
        }
    }
}


