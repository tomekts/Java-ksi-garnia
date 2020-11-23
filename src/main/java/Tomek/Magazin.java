package Tomek;

import java.util.Scanner;

public class Magazin extends Publication {
    int number;
    int price;

    public Magazin(String title, String value, int number, int price) {
        super(title, value);
        this.number = number;
        this.price = price;
    }
    public Magazin(){}
    void gene(){

        Scanner ss = new Scanner(System.in);
        System.out.print("podaj tytuł:");
        title = ss.nextLine();

        System.out.print("podaj tresc:");
        value=ss.nextLine();

        System.out.print("podaj cene:");
        price= Integer.parseInt(ss.nextLine());

        System.out.print("podaj numer wydania liczba ! XD:");
        number= Integer.parseInt(ss.nextLine());



    }


    @Override
    public String toString() {
        return "Magazin{" +
                "number=" + number +
                ", price=" + price +
                ", title='" + title + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
