package com.company;


//  Werkende versie van de docent, Jef.


public class Cursus {
    private static final int MAXCURSISTEN = 6;
    private String[] cursisten = new String [MAXCURSISTEN];
    private int aantalCursisten=0;

    public void addCursist(String naam) {
        if (zitCursusVol()) return;
        cursisten[aantalCursisten] = naam;
        aantalCursisten++;

    }

    public boolean zitCursusVol() {
        return MAXCURSISTEN == aantalCursisten;
    }

    public String getCursist(int index) {
        if (index < 1 || index > MAXCURSISTEN)return null;
        return cursisten[index-1];
    }

    public int getAantalCursisten() {
        return aantalCursisten;
    }
}