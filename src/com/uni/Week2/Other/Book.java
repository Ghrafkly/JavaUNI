package com.uni.Week2.Other;

public class Book
{
    private String title;
    private Author author;
    private double price;

    public Book(String title, Author author, double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display()
    {
        System.out.printf("Book: %s | Author: %s %s | Price: $%s", title, author.getFirstName(), author.getLastName(), price);
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setAuthor(String firstName, String lastName)
    {
        this.author.setFirstName(firstName);
        this.author.setLastName(lastName);
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getTitle()
    {
        return title;
    }

    public Author getAuthor()
    {
        return author;
    }

    public double getPrice()
    {
        return price;
    }

    public static void main(String[] args)
    {
        Author author = new Author("Mark", "Twain");
        Book book = new Book("Huckleberry Finn", author, 9.5);
        book.display();
    }
}