package Übungsbeispiele_02_Pegelverwaltung;

import Übungsbeispiele_02.Event;

import java.util.ArrayList;

public class WasserstandManager {

    private ArrayList <Wasserstand> Wasserstandliste = new ArrayList<>();
    public void  add (Wasserstand wasserstandobjekt) {Wasserstandliste.add(wasserstandobjekt);}

    /* Methode findByID: Liefert den Wasserstand mit der übergebenen Id.
    Wird id nicht gefunden, so soll NULL retourniert werden. */
    public Wasserstand findById(int id) {

        for (Wasserstand wasserstandobjekt: Wasserstandliste ) {
        if (wasserstandobjekt.getId() == id) {
            return wasserstandobjekt;
            }
        }
        return null;
    }


    // Methode findALLByGewaesser:   Liefert alle Wasserstände des Gewässers mit dem übergebenen Namen.

    public ArrayList<Wasserstand> findAllByGewaesser(String gewaesserName) {
        ArrayList <Wasserstand> result = new ArrayList<>();

        for (Wasserstand wasserstandobjekt : Wasserstandliste ) {
            if (wasserstandobjekt.getGewaessername() == gewaesserName)
            {
                result.add(wasserstandobjekt);
            }
        }
        return result;
    }

    //Methode findLastWasserstande liefert den neuesten Wasserstand (= jener mit dem größten Zeitpunkt) für das Gewässer
    // mit dem übergebenen Namen:

    public Wasserstand findLastWasserstand(String gewaesserName) {
        ArrayList <Wasserstand> listeFuerGewaesser = findAllByGewaesser(gewaesserName);
        int hilfsvariable =0;

        for (Wasserstand wasserstandobjekt: listeFuerGewaesser  ) {
            if (wasserstandobjekt.getZeitpunkt() >= hilfsvariable) {
                hilfsvariable = wasserstandobjekt.getZeitpunkt();
            }
        }
        for (Wasserstand wasserstandobjekt : listeFuerGewaesser ) {
            if (wasserstandobjekt.getZeitpunkt() == hilfsvariable) {
                return wasserstandobjekt;
            }
        }
        return null;
    }

    /* Methode findForAlarmierung: Liefert alle Wasserstände, deren aktueller Wasserstand höher oder gleich wie dessen Wert
       messWertFuerAlarmierung ist */
        public ArrayList<Wasserstand> findForAlarmierung() {
            ArrayList <Wasserstand> result = new ArrayList<>();

            for (Wasserstand wasserstandobjekt : Wasserstandliste  ) {
                if (wasserstandobjekt.getMessWert() >= wasserstandobjekt.getMessWertFueAlarmierung()) {
                    result.add(wasserstandobjekt);
                }
            }
             return result;
        }

        /*
        Methode calcMittlererWasserstand: Liefert den durchschnittlichen Wasserstand für das Gewässer
        mit dem übergebenen Namen am angegebenen Ort.
         */
        //public double calcMittlererWasserstand() {

      //  }












}
