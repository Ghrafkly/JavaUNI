package com.uni.RollingProjectv2;

import java.util.Scanner;

public class University
{
    private Enrolment enrolment;

    public University()
    {
    }

    public University(Enrolment enrolment)
    {
        this.enrolment = enrolment;
    }

    public void display()
    {
        System.out.println(enrolment.display());
    }

    public void inputStudentDetails(Enrolment e)
    {
        Input input = new Input();
        Validation validation = new Validation();

        System.out.println("""
                Please enter student information
                ----------------------------------""");

        String[] studentDetails = {"Date of Enrolment", "Name", "Address", "Email", "PhoneNo"};

        for (int i = 0; i < studentDetails.length; i++)
        {
            var s = "";
            while (validation.isBlank(s))
            {
                s = input.acceptString(studentDetails[i] + ": ");
            }
            studentDetails[i] = s;
        }

        e.setDate(studentDetails[0]);

        e.setStudent(
                studentDetails[1],
                studentDetails[2],
                studentDetails[3],
                studentDetails[4]
        );
        System.out.println("Student has been created!");
    }

    public void inputUnitDetailsOnce(int x, Enrolment e)
    {
        Input input = new Input();
        Validation validation = new Validation();
        String unitCode = "";
        String unitDescription = "";
        int creditPoints = -1;

        System.out.println("""
                Please enter unit information
                ----------------------------------""");

        while (validation.isBlank(unitCode) || !validation.lengthWithinRange(unitCode, x, x))
        {
            unitCode = input.acceptString("Unit Code: ");
        }

        while (validation.isBlank(unitDescription))
        {
            unitDescription = input.acceptString("Unit Description: ");
        }

        creditPoints = input.acceptInteger("Credit Points: ");

        e.setUnit(unitCode, unitDescription, creditPoints);

        System.out.println("Unit has been enrolled!\n");
    }

    public Enrolment getEnrolment()
    {
        return enrolment;
    }

    public void setEnrolment(Enrolment enrolment)
    {
        this.enrolment = enrolment;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Enrolment enrolment = new Enrolment();
        University university = new University();

        while (true)
        {
            System.out.println("""
                    Select 1 to enrol a student
                    Select 2 to see Enrolment details
                    Select 3 to exit
                    """);

            switch (scanner.nextLine()) {
                case "1" -> {
                    university.inputStudentDetails(enrolment);
                    System.out.println();
                    university.inputUnitDetailsOnce(7, enrolment);
                }
                case "2" -> university.display();
                case "3" -> System.exit(0);
                default -> throw new IllegalStateException("Unexpected value");
            }
            university.setEnrolment(enrolment);
        }
    }
}
