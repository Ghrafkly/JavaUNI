//package com.uni.RollingProject;
//
//import java.util.Scanner;
//
//public class Student implements Details
//{
//    private String name;
//    private String address;
//    private String email;
//    private String phoneNo;
//    private final Options options = new Options();
//    private final Scanner scanner = new Scanner(System.in);
//
//    public Student()
//    {
//        name = "John Doe";
//        address = "";
//        email = "";
//        phoneNo = "";
//    }
//
//    public Student(String address, String email, String name, String phoneNo)
//    {
//        this.name = name;
//        this.address = address;
//        this.email = email;
//        this.phoneNo = phoneNo;
//    }
//
//    @Override
//    public void options(String option)
//    {
//        switch (option)
//        {
//            case "1" -> entry();
//            case "2" -> display();
//            case "3" -> options.option2(1);
//            default -> throw new IllegalStateException("Unexpected value: " + scanner.nextLine());
//        }
//    }
//
//    @Override
//    public void entry()
//    {
//        System.out.println("Please enter student information");
//        System.out.println("----------------------------------");
//
//        String[] studentDetails = {"Name", "Address", "Email", "PhoneNo"};
//
//        for (int i = 0; i < studentDetails.length; i++)
//        {
//            System.out.printf("%s: ", studentDetails[i]);
//            studentDetails[i] = scanner.nextLine();
//        }
//
//        this.name = (studentDetails[0]);
//        this.address = (studentDetails[1]);
//        this.email = (studentDetails[2]);
//        this.phoneNo = (studentDetails[3]);
//        options.option2(1);
//    }
//
//    @Override
//    public void display()
//    {
//        System.out.println("Student Information");
//        System.out.println("-------------------");
//        System.out.printf("Name: %s\nAddress: %s\nEmail: %s\nphoneNo: %s\n", name, address, email, phoneNo);
//        options.option2(1);
//    }
//
//    public String getAddress()
//    {
//        return address;
//    }
//
//    public String getEmail()
//    {
//        return email;
//    }
//
//    public String getName()
//    {
//        return name;
//    }
//
//    public String getPhoneNo()
//    {
//        return phoneNo;
//    }
//
//    public void setAddress(String address)
//    {
//        this.address = address;
//    }
//
//    public void setEmail(String email)
//    {
//        this.email = email;
//    }
//
//    public void setName(String name)
//    {
//        this.name = name;
//    }
//
//    public void setPhoneNo(String phoneNo)
//    {
//        this.phoneNo = phoneNo;
//    }
//}
