package personmanagement;

import java.util.Scanner;

public class Teacher extends Person {
    private String teacherId;
    private String competitionRating;

    public Teacher() {}

    public Teacher(String fullName, java.util.Date birthDate, String gender, int idCard,
                   String teacherId, String competitionRating) {
        super(fullName, birthDate, gender, idCard);
        this.teacherId = teacherId;
        this.competitionRating = competitionRating;
    }

    public String getTeacherId() { return teacherId; }
    public void setTeacherId(String teacherId) { this.teacherId = teacherId; }

    public String getCompetitionRating() { return competitionRating; }
    public void setCompetitionRating(String competitionRating) { this.competitionRating = competitionRating; }

    public void evaluateCompetition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose competition rating: 1-Type A, 2-Type B, 3-Type C");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> competitionRating = "Type A";
            case 2 -> competitionRating = "Type B";
            case 3 -> competitionRating = "Type C";
            default -> competitionRating = "Unknown";
        }
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter teacher ID: ");
        teacherId = sc.nextLine();
        evaluateCompetition();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Teacher ID: " + teacherId + ", Competition Rating: " + competitionRating);
    }
}

