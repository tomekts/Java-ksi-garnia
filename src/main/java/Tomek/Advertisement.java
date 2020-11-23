package Tomek;

import java.util.Scanner;

public class Advertisement extends Publication {
    String dateExperian;

    public Advertisement(String title, String value, String dateExperian) {
        super(title, value);
        dateExperian = dateExperian;
    }

    public Advertisement() {
    }

    @Override
    void gene() {

        Scanner ss = new Scanner(System.in);
        System.out.print("podaj tytuł:");
        title = ss.nextLine();

        System.out.print("podaj tresc:");
        value = ss.nextLine();

        System.out.print("podaj koniec aukcji:");
        dateExperian = ss.nextLine();


    }




    @Override
    public String toString() {
        return "Advertisement{" +
                "DateExperien='" + dateExperian + '\'' +
                ", title='" + title + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
