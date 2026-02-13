import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int subjects = 5;

        System.out.println("Enter marks for 5 subjects:");

        for(int i = 1; i <= subjects; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        double average = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        if(average >= 90)
            System.out.println("Grade: A");
        else if(average >= 75)
            System.out.println("Grade: B");
        else if(average >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");
        sc.close();
    }
}
