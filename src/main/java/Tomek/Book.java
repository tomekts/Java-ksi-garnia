package Tomek;

import java.util.Scanner;

public class Book  extends Publication{
    private String author;
    private int price;
    public Book(String title, String value,String author, int price) {
        super(title, value);
        this.author=author;
        this.price= price;
    }
    public Book(){}


    void gene(){
        Scanner ss = new Scanner(System.in);
        System.out.print("podaj tytuł:");
        title=ss.nextLine();

        System.out.print("podaj tresc:");
        value=ss.nextLine();

        System.out.print("podaj cene:");
        price= Integer.parseInt(ss.nextLine());

        System.out.print("podaj autora:");
        author=ss.nextLine();

    }
    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", price=" + price +
                ", title='" + title + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
