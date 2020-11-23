package Tomek;

import java.util.Scanner;

public class Art extends Publication {
    String author;
    String source;


    public Art(String title, String value, String author, String source) {
        super(title, value);
        this.author = author;
        this.source = source;
    }
    public Art(){}

    @Override
    void gene(){

        Scanner ss = new Scanner(System.in);
        System.out.print("podaj tytuł:");
        title=ss.nextLine();

        System.out.print("podaj tresc:");
        value=ss.nextLine();

        System.out.print("podaj cene:");
        source= ss.nextLine();

        System.out.print("podaj autora:");
        author=ss.nextLine();

    }

    @Override
    public String toString() {
        return "Art{" +
                "author='" + author + '\'' +
                ", source='" + source + '\'' +
                ", title='" + title + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
