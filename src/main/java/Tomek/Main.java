package Tomek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void choice(){
        System.out.println("ss");
    }
    public static void main(String[] args) {
        System.out.println("test");

        List<Publication> pub = new ArrayList<>();
        Scanner ss = new Scanner(System.in);
        int userChoice;
        boolean exit = true;
        Publication publi;
        System.out.println("te");





//        Publication pies = new Book("Ja kot","blablabla","Jan Blan", 5  );
//        Publication pies11 = new Book("Ja kot","blablabla","Jan Blan", 5  );
//        Art pies1 = new Art("Ja kot","blablabla","Jan Blan", "sd"  );
//        pies.gene();
//        pub.add(pies);
//        pub.add(pies1);
//        pub.add(pies11);



        while (exit){
            System.out.println();
            System.out.println("0: wypisz");
            System.out.println("1: dodaj ksiązke");
            System.out.println("2 dodaj artykuł");
            System.out.println("3 dodaj magazyn");
            System.out.println("4 dodaj ogłoszenie");
            System.out.println("5 exit");
        System.out.printf("Podaj liczbe: ");
        userChoice = ss.nextInt();

        switch (userChoice) {
            case 0 -> {System.out.println("wyb 0");
                for (Publication p:pub) {
                    System.out.println(p);
                }}


            case 1 -> {System.out.println("wyb 1");
            publi=new Book();
            publi.gene();
            pub.add(publi);
            }

            case 2 -> {
                System.out.println("wyb 2");
                publi=new Art();
                publi.gene();
                pub.add(publi);
            }
            case 3 -> {
                System.out.println("wyb 3");
                publi=new Magazin();
                publi.gene();
                pub.add(publi);
            }
            case 4 -> {
                System.out.println("wyb 4");
                publi=new Advertisement();
                publi.gene();
                pub.add(publi);
            }
            case 5 -> {
                System.out.println("Koniec");
                exit = false;
            }
        }
        }


    }
}
