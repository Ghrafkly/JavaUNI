package com.uni.RollingProjectv2;

public class Enrolment
{
    private String date;
    private Student student;
    private Unit unit;

    public Enrolment()
    {
        this.date = "01/01/1970";
        this.student = new Student();
        this.unit = new Unit();
    }

    public Enrolment(String date, Student student, Unit unit)
    {
        this.date = date;
        this.student = student;
        this.unit = unit;
    }

    public String display()
    {
        return String.format("""
                Enrolment Information
                =====================
                Date of enrolment: %s
                
                Student Information
                -------------------
                %s
                Unit Information
                ----------------
                %s""", date, student.display(), unit.display());
    }

    public String getDate()
    {
        return date;
    }

    public Student getStudent()
    {
        return student;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public void setStudent(String address, String email, String name, String phoneNo)
    {
        this.student = new Student(address, email, name, phoneNo);
    }

    public void setUnit(String code, String description, int points)
    {
        this.unit = new Unit(code, description, points);
    }
}
