//package com.uni.RollingProject;
//
//import java.util.Scanner;
//
//public class Options
//{
//    private final Scanner scanner = new Scanner(System.in);
//
//    public Options()
//    {
//        System.out.println("Press 1 for Student Details");
//        System.out.println("Press 2 for Unit Details");
//        System.out.println("Press 3 for Enrolment Details");
//        System.out.println("Press 4 to exit");
//
//        String option1 = scanner.nextLine();
//
//        Enrolment enrolment = new Enrolment();
//        switch (option1)
//        {
//            case "1" -> option2(1);
//            case "2" -> option2(2);
//            case "3" -> enrolment.display();
//            case "4" -> System.exit(0);
//        }
//    }
//
//    public void option2(int type)
//    {
//        System.out.println("    Enter 1 to enter details");
//        System.out.println("    Enter 2 to display details");
//        System.out.println("    Enter 3 to go back");
//
//        String option = scanner.nextLine();
//
//        switch (type)
//        {
//            case 1 -> student.options(option);
//            case 2 -> unit.options(option);
//        }
//    }
//
////    public void s()
////    {
////        System.out.println("    Enter 1 to enter details");
////        System.out.println("    Enter 2 to display details");
////        System.out.println("    Enter 3 to go back");
////
////        String option = scanner.nextLine();
////
////        student.options(option);
////    }
////
////    public void u()
////    {
////        System.out.println("    Enter 1 to enter details");
////        System.out.println("    Enter 2 to display details");
////        System.out.println("    Enter 3 to go back");
////
////        String option = scanner.nextLine();
////
////        student.options(option);
////    }
//}
