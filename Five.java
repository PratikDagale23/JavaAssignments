import java.util.Scanner;

abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    private int subject1;
    private int subject2;
    private int subject3;

    public A(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    double getPercentage() {
        int totalMarks = subject1 + subject2 + subject3;
        return (double) totalMarks / 3;
    }
}

class B extends Marks {
    private int subject1;
    private int subject2;
    private int subject3;
    private int subject4;

    public B(int subject1, int subject2, int subject3, int subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    double getPercentage() {
        int totalMarks = subject1 + subject2 + subject3 + subject4;
        return (double) totalMarks / 4;
    }
}

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for Student A (three subjects):");
        System.out.print("Subject 1: ");
        int subject1A = scanner.nextInt();
        System.out.print("Subject 2: ");
        int subject2A = scanner.nextInt();
        System.out.print("Subject 3: ");
        int subject3A = scanner.nextInt();

        System.out.println("Enter marks for Student B (four subjects):");
        System.out.print("Subject 1: ");
        int subject1B = scanner.nextInt();
        System.out.print("Subject 2: ");
        int subject2B = scanner.nextInt();
        System.out.print("Subject 3: ");
        int subject3B = scanner.nextInt();
        System.out.print("Subject 4: ");
        int subject4B = scanner.nextInt();

        A studentA = new A(subject1A, subject2A, subject3A);
        B studentB = new B(subject1B, subject2B, subject3B, subject4B);

        System.out.println("Percentage of marks obtained by Student A: " + studentA.getPercentage());
        System.out.println("Percentage of marks obtained by Student B: " + studentB.getPercentage());
    }
}
