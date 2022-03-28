package com.uni.Week2.Other;

public class Author
{
    private String firstName;
    private String lastName;

    public Author()
    {
        firstName = "unknown";
        lastName = "unknown";
    }

    public Author(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void display()
    {
        System.out.printf("Author: %s %s\n", firstName, lastName);
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public static void main(String[] args)
    {
        Author author1 = new Author();
        Author author2 = new Author("John", "Smith");
        author1.display();
        author2.display();
    }
}