package com.tbse.datastructures.threads;

/**
 * WNSW
 * Created by tbsmith on 5/25/14.
 */
public class ThreadRacer {

    public static int raceLength = 8;

    public static Thread tUSA1;
    public static Thread tUSA2;

    public static Thread tFrance1;
    public static Thread tFrance2;

    public static Thread tGermany1;
    public static Thread tGermany2;

    public static Thread tSpain1;
    public static Thread tSpain2;

    public static Thread tRussia1;
    public static Thread tRussia2;

    public static void run() {

        ThreadGroup tgUSA = new ThreadGroup("USA");
        ThreadGroup tgFrance = new ThreadGroup("France");
        ThreadGroup tgGermany = new ThreadGroup("Germany");
        ThreadGroup tgSpain = new ThreadGroup("Spain");
        ThreadGroup tgRussia = new ThreadGroup("Russia");


        tUSA1 = new Thread(tgUSA, new Racer(), "USA 01");
        tUSA2 = new Thread(tgUSA, new Racer(tUSA1), "USA 02");

        tFrance1 = new Thread(tgFrance, new Racer(), "France 01");
        tFrance2 = new Thread(tgFrance, new Racer(tFrance1), "France 02");

        tGermany1 = new Thread(tgGermany, new Racer(), "Germany 01");
        tGermany2 = new Thread(tgGermany, new Racer(tGermany1), "Germany 02");

        tSpain1 = new Thread(tgSpain, new Racer(), "Spain 01");
        tSpain2 = new Thread(tgSpain, new Racer(tSpain1), "Spain 02");

        tRussia1 = new Thread(tgRussia, new Racer(), "Russia 01");
        tRussia2 = new Thread(tgRussia, new Racer(tRussia1), "Russia 02");


        tUSA1.start();
        tUSA2.start();

        tFrance1.start();
        tFrance2.start();

        tGermany1.start();
        tGermany2.start();

        tSpain1.start();
        tSpain2.start();

        tRussia1.start();
        tRussia2.start();



    }
}
