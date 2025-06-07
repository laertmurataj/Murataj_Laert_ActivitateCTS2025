package ro.cts.main;


import ro.cts.clase.CheckInDesk;
import ro.cts.clase.Passenger;

public class Main {
    public static void main(String[] args) {
        Passenger passenger1 = new Passenger("Laert",true,false,25);
        CheckInDesk checkInDesk = new CheckInDesk();
        System.out.println(checkInDesk.canPass(passenger1));

        Passenger passenger2 = new Passenger("Ana",false,true,19);
        System.out.println(checkInDesk.canPass(passenger2));
        }
    }
