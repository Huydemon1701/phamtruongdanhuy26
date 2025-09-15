package personmanagement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {
    private String fullName;
    private Date birthDate;
    private String gender;
    private int idCard;

    public Person() {}

    public Person(String fullName, Date birthDate, String gender, int idCard) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.idCard = idCard;
    }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public int getIdCard() { return idCard; }
    public void setIdCard(int idCard) { this.idCard = idCard; }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: ");
        fullName = sc.nextLine();
        System.out.print("Enter date of birth (dd/MM/yyyy): ");
        String dateStr = sc.nextLine();
        try {
            birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
        } catch (ParseException e) {
            birthDate = new Date(); // fallback to today
        }
        System.out.print("Enter gender: ");
        gender = sc.nextLine();
        System.out.print("Enter ID card number: ");
        idCard = Integer.parseInt(sc.nextLine());
    }

    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Name: " + fullName +
                ", Birth Date: " + sdf.format(birthDate) +
                ", Gender: " + gender +
                ", ID Card: " + idCard);
    }
}

