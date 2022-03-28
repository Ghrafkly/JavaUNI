//package com.uni.RollingProject;
//
//import java.util.Scanner;
//
//public class Unit implements Details
//{
//    private String instructorName;
//    private String unitCode;
//    private String unitDescription;
//    private int creditPoints;
//    private int currentStudents;
//    private int maxStudents;
//    private final Options options = new Options();
//    Scanner scanner = new Scanner(System.in);
//
//    public Unit()
//    {
//        instructorName = "John Doe";
//        unitCode = "N/A";
//        unitDescription = "N/A";
//        creditPoints = -1;
//        currentStudents = -1;
//        maxStudents = -1;
//    }
//
//    public Unit(String name, String code, String description, int points, int current, int max)
//    {
//        instructorName = name;
//        unitCode = code;
//        unitDescription = description;
//        creditPoints = points;
//        currentStudents = current;
//        maxStudents = max;
//    }
//
//    @Override
//    public void options(String option)
//    {
//        System.out.println("    Enter 1 to enter details");
//        System.out.println("    Enter 2 to display details");
//        System.out.println("    Enter 3 to go back");
//
//        switch (option) {
//            case "1" -> entry();
//            case "2" -> display();
//            case "3" -> options.option2(2);
//            default -> throw new IllegalStateException("Unexpected value: " + scanner.nextLine());
//        }
//    }
//
//    @Override
//    public void entry()
//    {
//        System.out.println("Please enter unit information");
//        System.out.println("----------------------------------");
//
//        String[] unitDetails = {"Code", "Description", "Instructor Name",
//                "Credit Points", "Max Students"};
//
//        for (int i = 0; i < unitDetails.length; i++)
//        {
//            System.out.printf("%s: ", unitDetails[i]);
//            unitDetails[i] = scanner.nextLine();
//        }
//
//        this.unitCode = (unitDetails[0]);
//        this.unitDescription = (unitDetails[1]);
//        this.instructorName = (unitDetails[2]);
//        this.creditPoints = Integer.parseInt((unitDetails[3]));
//        this.maxStudents = Integer.parseInt(unitDetails[4]);
//        options.option2(2);
//    }
//
//    public void display()
//    {
//        System.out.println("Unit Information");
//        System.out.println("----------------");
//        System.out.printf("Unit Code: %s\nUnit Description: %s\nCredit Points: %d\n", unitCode, unitDescription, creditPoints);
//        System.out.printf("Instructor: %s\nEnrolled: %d\nLimit: %d\n", instructorName, currentStudents, maxStudents);
//        options.option2(2);
//    }
//
//    public int getCreditPoints()
//    {
//        return creditPoints;
//    }
//
//    public int getCurrentStudents()
//    {
//        return currentStudents;
//    }
//
//    public String getInstructorName()
//    {
//        return instructorName;
//    }
//
//    public int getMaxStudents()
//    {
//        return maxStudents;
//    }
//
//    public String getUnitCode()
//    {
//        return unitCode;
//    }
//
//    public String getUnitDescription()
//    {
//        return unitDescription;
//    }
//
//    public void setCreditPoints(int creditPoints)
//    {
//        this.creditPoints = creditPoints;
//    }
//
//    public void setCurrentStudents(int currentStudents)
//    {
//        this.currentStudents = currentStudents;
//    }
//
//    public void setInstructorName(String instructorName)
//    {
//        this.instructorName = instructorName;
//    }
//
//    public void setMaxStudents(int maxStudents)
//    {
//        this.maxStudents = maxStudents;
//    }
//
//    public void setUnitCode(String unitCode)
//    {
//        this.unitCode = unitCode;
//    }
//
//    public void setUnitDescription(String unitDescription)
//    {
//        this.unitDescription = unitDescription;
//    }
//}
