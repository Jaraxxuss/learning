import by.gsu.asoilab.Trip;

public class Runner {
    public static void main(String[] args) {
//        //1
//        Trip[] trips = new Trip[]{
//                new Trip(3, 201, "Lexa"),
//                new Trip(4, 25002, "Valera"),
//                null,
//                new Trip(2, 10330, "Jena"),
//                new Trip()
//        };
//        //2
//        printTripsWithtoString(trips);
//        //3
//        trips[trips.length - 1].setTransportationExpenses(30040);
//        //4
//        showTotalDuration(trips);
//        //5
//        printTripsWithShow(trips);
//
//
//    }
//
//    private static void printTripsWithtoString(Trip[] trips) {
//        for (Trip trip : trips) {
//                System.out.println(trip);
//        }
//    }
//    private static void printTripsWithShow(Trip[] trips) {
//        for (Trip trip : trips) {
//            if(trip != null)
//                trip.show();
//        }
//    }
//
//    private static void showTotalDuration(Trip[] trips) {
//        System.out.println("Duration = " + trips[0].getNumberOfDays() + trips[1].getNumberOfDays());
//
//    }
        //1
        Trip[] trips = new Trip[]{
                new Trip(3, 201, "Lexa"),
                new Trip(4, 25002, "Valera"),
                new Trip(5, 10550, "Vaca"),
                new Trip(2, 10330, "Jena"),
                new Trip(7, 40070, "artem")
        };
        //2
        printTripsWithShow(trips);
        //3
        int avg = calculateTotalExpenses(trips);
        System.out.println("avg = " + avg);
        //4
        trips[trips.length - 1].setNumberOfDays(trips[trips.length - 1].getNumberOfDays() + 1);
        //5
        printTripsWithtoString(trips);

    }

    private static void printTripsWithtoString(Trip[] trips) {
        for (Trip trip : trips) {
            System.out.println(trip);
        }
    }

    private static void printTripsWithShow(Trip[] trips) {
        for (Trip trip : trips) {
            if (trip != null)
                trip.show();
        }
    }

    private static void showTotalDuration(Trip[] trips) {
        System.out.println("Duration = " + trips[0].getNumberOfDays() + trips[1].getNumberOfDays());

    }

    private static int calculateTotalExpenses(Trip[] trips) {
        int res = 0;
        for (Trip trip : trips) {
            res += trip.getTransportationExpenses();
        }
        return res;
    }


}

