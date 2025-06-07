package ro.cts.clase;

public class CheckInDesk {
    public String canPass(Passenger passenger1) {
        Passport passport = new Passport();
        BoardingPass boardingPass = new BoardingPass();
        Luggage luggage = new Luggage();
        if (passport.havePassport(passenger1)) {
            if (boardingPass.boardingPassPrinted(passenger1)) {
                if (luggage.weightAllowed(passenger1)) {
                    return "Luggage weight allowed: "+passenger1.getLuggageWeight()+"\nPassenger can pass";


                }
                else{return "Luggage weight not allowed" + passenger1.getLuggageWeight();}


            }else
            {return "Boarding pass not printed";}


        } else {
            return "Passenger doesnt have a passport";
        }

    }
}
