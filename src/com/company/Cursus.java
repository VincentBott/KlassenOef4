package com.company;

private int aantalCursisten;


public class Cursus {


    private static final int MAXCURSISTEN = 6;
    private String[] cursisten = new String[MAXCURSISTEN];


    public void addCursist(String naam) {
    }

    public int getAantalCursisten() {
        return 0;
    }

    public boolean zitCursusVol() {
        if (aantalCursisten == MAXCURSISTEN)
            return true;
        else
            return false;
    }

    public String getCursist(int i) {
    }
}
