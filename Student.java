package personmanagement;

import java.util.Scanner;

public class Student extends Person {
    private String studentId;
    private String discipline;

    public Student() {}

    public Student(String fullName, java.util.Date birthDate, String gender, int idCard,
                   String studentId, String discipline) {
        super(fullName, birthDate, gender, idCard);
        this.studentId = studentId;
        this.discipline = discipline;
    }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getDiscipline() { return discipline; }
    public void setDiscipline(String discipline) { this.discipline = discipline; }

    public void evaluateDiscipline() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose discipline: 1-Excellent, 2-Good, 3-Average, 4-Poor");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> discipline = "Excellent";
            case 2 -> discipline = "Good";
            case 3 -> discipline = "Average";
            case 4 -> discipline = "Poor";
            default -> discipline = "Unknown";
        }
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        studentId = sc.nextLine();
        evaluateDiscipline();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId + ", Discipline: " + discipline);
    }
}
