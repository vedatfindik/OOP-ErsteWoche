/***********************


Implemetation einer Measurable-Klasse
fuer Aufgabenprogramme der LV
Objektorientierte Programmierung
***********************/ 

import java.util.ArrayList;

public class OOPProgrammingTask implements Measurable {

    // name and List  of lines of code
    private String name;
    private ArrayList<String> code;

    // constructor for setting the name
    public OOPProgrammingTask (String name) {
        this.name = name;
        code = new ArrayList<String>();
    }

    // adds a line of code
    public void addLn (String line) {
        code.add(line);
    }

    // returns total number of lines
    public int getNumberOfLines () {
        return code.size();
    }

    // returns whether given lines has code
    // i.e. check if empty or comment [not perfectly implemented!!!]
    public boolean isLineCode (int which) {
        String trimmedLine = code.get(which).trim();
        if (trimmedLine.length() == 0) {
            return false;
        }
        if (trimmedLine.length() == 1) { // cannot be comment
            return true;
        }
        String leadingPair = trimmedLine.substring(0,2);
        if(leadingPair.equals("//") || leadingPair.equals("/*")) {
            return false;
        }
        return true;
    }

    // returns number of code lines
    public int getNumberOfCode () {
        int c = 0;
        for (int i = 0; i < code.size(); i++) {
            if (isLineCode(i)) {
                c++;
            }
        }
        return c;
    }

    // returns a string representation of the name combined with the number of code lines
    // and the number of total lines
    public String toString () {
        return "Program " + name + " consisting of " + getNumberOfLines() + " Lines, " + getNumberOfCode() + " of which are code";
    }

    // implements getMeasure from Measureable
    // Measure given by lines of code
    public double getMeasure () {
        return getNumberOfCode();
    }
}
