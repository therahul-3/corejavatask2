import java.util.Scanner;

abstract class Student {
    protected int studentId;
    protected String studentName;
    protected String department;
    protected String gender;
    protected String category;
    protected double collegeFee;

    // Constructor
    public Student(int studentId, String studentName, String department, String gender, String category, double collegeFee) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
        this.gender = gender;
        this.category = category;
        this.collegeFee = collegeFee;
    }

    // Abstract method to calculate total fee
    public abstract double calculateTotalFee();
}
