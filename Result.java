/***********************

Implemetation einer Measurable Result-Klasse
geeignet fuer Ergebnisse mit Teilergebnissen
***********************/ 

import java.util.stream.DoubleStream;

public class Result implements Measurable {

    // name and array of partial results
    private String name;
    private double[] results;

    //constructor for setting the name and the number of scores
    public Result (String name, int scores) {
        this.name = name;
        results = new double[scores];
    }

    //sets for score which the given amount
    public void setScore (int which, double amount) {
        results[which] = amount;
    }

    //returns score which
    public double getScore (int which) {
        return results[which];
    }

    //returns the total score
    public double getTotalScore () {
        return DoubleStream.of(results).sum();
    }

    // returns a string representation of the name combined with all
    // scores and the total score
    public String toString () {
        return name + ": " + String.join(" / ", DoubleStream.of(results).boxed().map(String::valueOf).toArray(String[]::new)) + " = " + getTotalScore();
    }

    // implements getMeasure from Measureable
    // Measure given by total Score
    public double getMeasure () {
        return getTotalScore();
    }
}
