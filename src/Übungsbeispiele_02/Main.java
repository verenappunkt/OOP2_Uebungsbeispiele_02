package Übungsbeispiele_02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Event Klavierkonzert = new Event
                ("Kleine Etüden", "Konzerthaus", 22.9);
        //System.out.println(Klavierkonzert.toString());

        Eventkalender eventkalender = new Eventkalender();
        eventkalender.add(Klavierkonzert);
        eventkalender.add(new Event("Große Werke", "Konzerthaus", 39.9));
        eventkalender.add(new Event("Jazzkonzert", "Jazzclub", 15.9));
        eventkalender.add(new Event("Jazz-Allstars","Jazzclub",19.9));

        System.out.println("Titel Keine Etüden: " + eventkalender.getByTitel("Keine Etüden"));
        System.out.println("Im Konzerthaus: " + eventkalender.getByOrt("Konzerthaus"));
        System.out.println("Events mit Preis zwischen inklusive 5 und 25 Euro: " + eventkalender.getByEintrittspreis(5, 25));
        System.out.println("Das teuerste Konzert im Jazzclub: " + eventkalender.getMostExpensiveByOrt("Jazzclub"));
        System.out.println("Der Durchschnittspreis im Konzerthaus: " + eventkalender.getAvgPreisByOrt("Konzerthaus"));





    }
}
