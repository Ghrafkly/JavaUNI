package com.uni.RollingProjectv2;

public class Student
{
    private String name;
    private String address;
    private String phoneNo;
    private String email;

    public Student()
    {
        name = "John Doe";
        address = "";
        email = "";
        phoneNo = "";
    }

    public Student(String address, String email, String name, String phoneNo)
    {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public String display()
    {
        return String.format("""
                Name    : %s
                Address : %s
                Email   : %s
                Phone No: %s
                """, name, address, email, phoneNo);
    }

    public String getAddress()
    {
        return address;
    }

    public String getEmail()
    {
        return email;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNo()
    {
        return phoneNo;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPhoneNo(String phoneNo)
    {
        this.phoneNo = phoneNo;
    }
}
