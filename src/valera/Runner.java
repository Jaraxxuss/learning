package valera;

public class Runner {
    public static void main(String[] args) {
        Trip[] trips = {
                new Trip(1,"55555",55555),
                new Trip(20000,"22222",20000),
                null,
                new Trip(30000,"30000",30000),
                new Trip()

        };
        for (Trip trip : trips) {
            if(trip != null){
                trip.show();
            }
        }
        trips[trips.length - 1].setDengi(0);
        System.out.println("Duration = " + (trips[0].getKolvodney()+trips[1].getKolvodney()));
        for (Trip trip : trips) {
            System.out.println(trip);
        }
    }

}
