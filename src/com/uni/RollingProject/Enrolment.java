//package com.uni.RollingProject;
//
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//public class Enrolment
//{
//    private String date;
//    private Student student;
//    private Unit unit;
//
//    public Enrolment()
//    {
//        date = "1970/01/01";
//        student = new Student();
//        unit = new Unit();
//    }
//
//    public Enrolment(String date, Student student, Unit unit)
//    {
//        this.date = date;
//        this.student = student;
//        this.unit = unit;
//    }
//
//    public void display()
//    {
//        LocalDateTime date = LocalDateTime.now();
//        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        String formattedDate = date.format(dateFormat);
//
//        System.out.println("Enrolment Information");
//        System.out.println("=====================");
//        System.out.printf("Date: %s\n", formattedDate);
//        System.out.println();
//        student.display();
//        System.out.println();
//        unit.display();
//    }
//
////    public static void main(String[] args) throws InterruptedException
////    {
////        Scanner scanner = new Scanner(System.in);
////        Student student = new Student();
////        Unit unit = new Unit();
////
////        LocalDateTime date = LocalDateTime.now();
////        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
////        String formattedDate = date.format(dateFormat);
////
////        System.out.println("Please enter enrolment information");
////        System.out.println("----------------------------------");
////
////        String[] studentDetails = {"Name", "Address", "Email", "PhoneNo"};
////
////        for (int i = 0; i < studentDetails.length; i++)
////        {
////            System.out.printf("%s: ", studentDetails[i]);
////            studentDetails[i] = scanner.nextLine();
////        }
////
////        student.setName(studentDetails[0]);
////        student.setAddress(studentDetails[1]);
////        student.setEmail(studentDetails[2]);
////        student.setPhoneNo(studentDetails[3]);
////
////        System.out.println();
////
////        int i = 0;
////        while (i < 3)
////        {
////            System.out.print("Generating enrolment.\r");
////            Thread.sleep(500);
////            System.out.print("Generating enrolment..\r");
////            Thread.sleep(500);
////            System.out.print("Generating enrolment...");
////            Thread.sleep(500);
////            System.out.print("\b ");
////            System.out.print("\b\b \r");
////            i++;
////        }
////
////        Enrolment enrolment = new Enrolment(formattedDate, student, unit);
////        enrolment.display();
////    }
//}
