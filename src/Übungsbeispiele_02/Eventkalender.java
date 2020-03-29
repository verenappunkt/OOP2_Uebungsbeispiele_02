package Übungsbeispiele_02;

import java.util.ArrayList;

public class Eventkalender {
    //Ein EventKalender kann über die Methode add beliebig viele Events aufnehmen, die in einer privaten
    //ArrayList<Event> events abgelegt werden

   private ArrayList<Event> Eventliste = new ArrayList<>();
   public void add(Event event) {Eventliste.add(event);}



    public Event getByTitel(String title) {
       for (Event event:Eventliste
            ) {
          if (event.getTitle().equals(title)) {
             return event;
          }
       }
        return null;
    }

    public ArrayList<Event> getByOrt (String ort) {

     ArrayList<Event> result = new ArrayList<>();
      for (Event event:Eventliste) {
         if (event.getOrt().equals(ort)) {
             result.add(event);
         }
      }
      return result;
    }

    public ArrayList<Event> getByEintrittspreis (double min, double max) {
      ArrayList<Event> result = new ArrayList<>();

       for (Event event:Eventliste
            ) {
          if (event.getEintrittspreis() >= min || event.getEintrittspreis() <= max) {
             result.add(event);
          }
       }
       return result;
    }

    public Event getMostExpensiveByOrt (String ort) {
       double preis = 0;

       ArrayList<Event> eventsInOrt = getByOrt(ort);

       for (Event event : eventsInOrt) {
          if (event.getEintrittspreis() >= preis) {
             preis = event.getEintrittspreis();
          }
       }
       for (Event event: eventsInOrt ) {
          if (event.getEintrittspreis() == preis) {
             return event;
          }
       }
       return null;
    }

    public double getAvgPreisByOrt (String ort) {
       double preis = 0;

       ArrayList<Event> eventsInOrt = getByOrt(ort);

       for (Event event : eventsInOrt) {
          preis +=event.getEintrittspreis() ;
       }
       return preis / eventsInOrt.size();
    }

 //   public String getAvgTeuersterOrt ()
}
