package epam.part4.simplestclasses;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Tasks {
    public static void main(String[] args) {
//        Train[] trains = createFiveTrains();
//        showTrainsList(trains);
//        sortTrainsByDestination(trains);
//        System.out.println();
//        showTrainsList(trains);
//        Customer[] customers = Customers.sortCustumersInAlphabetOrder(new Customer[]{new Customer(14000, "Evgenii", "Sergeevich", "Rudenkov"),
//                new Customer(12345, "Valera", "Sergeevich", "Kavenkin"),
//                new Customer(12000, "Cheslav", "Sergeevich", "Averchenko"),
//                new Customer(10000, "Alexandr", "Sergeevich", "Rudenkov")});
//        showCustomers(custumers, new boolean[]{true, true, true, false, false, false, false});
//        showCustomers(Custumers.getCustomersWithSpecialCreditCard(custumers, 10000, 13000), new boolean[]{true, true, true, false, true, false, false});

//        Book[] books = Books.getBooksByAuthor(new Book[]{
//                new Book("PolesPechat","Gold Fish",new String[]{"Pyshkin","Lermontov"},2005),
//                new Book("PolesPechat","Kolobok",new String[]{"Pyshkin"},2004),
//                new Book("PolesPechat","12 stulev",new String[]{"Lermontov"},2005),
//        },"Lermontov");
//        showBooks(books,new boolean[]{true,true,true,true,true,false,false,false});
        Airline[] airlines = Airlines.getAirlinesByDayOfWeekAndDepartureTime(new Airline[]{
                new Airline(234, new Time(10, 30, 0), new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.FRIDAY}, "Kiev"),
                new Airline(235, new Time(11, 30, 0), new DayOfWeek[]{DayOfWeek.SATURDAY, DayOfWeek.FRIDAY}, "Kiev"),
                new Airline(236, new Time(12, 30, 0), new DayOfWeek[]{DayOfWeek.THURSDAY, DayOfWeek.TUESDAY}, "Minsk"),
        }, DayOfWeek.FRIDAY, new Time(9, 0, 0));
        showAirlines(airlines, new boolean[]{true, true, true, true, true, false});
    }

    public static void showCustomers(Customer[] customers, boolean[] flags) {
        StringBuilder output = new StringBuilder("");
        for (Customer customer : customers) {
            if (flags[0]) output.append("id                 : " + customer.getId() + '\n');
            if (flags[1]) output.append("first name         : " + customer.getFirstName() + '\n');
            if (flags[2]) output.append("last name          : " + customer.getLastName() + '\n');
            if (flags[3]) output.append("second name        : " + customer.getSecondName() + '\n');
            if (flags[4]) output.append("credit card number : " + customer.getCreditCard() + '\n');
            if (flags[5]) output.append("adress             : " + customer.getAdress() + '\n');
            if (flags[6]) output.append("bank number        : " + customer.getBankNumber() + '\n');
        }
        System.out.println(output);
    }

    public static void showBooks(Book[] books, boolean[] flags) {
        StringBuilder output = new StringBuilder("");
        for (Book book : books) {
            if (flags[0]) output.append("id                 : " + book.getId() + '\n');
            if (flags[1]) output.append("name               : " + book.getName() + '\n');
            if (flags[2]) {
                output.append("Authors            : ");
                for (String author : book.getAuthors()) {
                    output.append(author + ", ");
                }
                output.deleteCharAt(output.length() - 2);
                output.append('\n');
            }
            if (flags[3]) output.append("Publishing House   : " + book.getPublishingHouse() + '\n');
            if (flags[4]) output.append("Year of Publishing : " + book.getYearOfPublishing() + '\n');
            if (flags[5]) output.append("Number of pages    : " + book.getNumberOfPages() + '\n');
            if (flags[6]) output.append("Price              : " + book.getPrice() + '\n');
            if (flags[7]) {
                output.append("Type of binding    : ");
                switch (book.getBinding()) {
                    case Hard:
                        output.append("Hard");
                        break;
                    case Soft:
                        output.append("Soft");
                        break;
                    case OnBolts:
                        output.append("On Bolts");
                        break;
                    case MetalSpring:
                        output.append("Metal Spring");
                        break;
                    case Integral:
                        output.append("Integral");
                        break;
                    case MetalBracket:
                        output.append("Metal Bracket");
                        break;
                }
                output.append('\n');
            }
        }
        System.out.println(output);
    }

    public static void showAirlines(Airline[] airlines, boolean[] flags) {
        StringBuilder output = new StringBuilder("");
        for (Airline airline : airlines) {
            if (flags[0]) output.append("id                 : " + airline.getId() + '\n');
            if (flags[1]) output.append("flight number      : " + airline.getFlightNumber() + '\n');
            if (flags[2]) {
                output.append("Days               : ");
                for (DayOfWeek dayOfWeek : airline.getDays()) {
                    switch (dayOfWeek) {
                        case MONDAY:
                            output.append("Monday, ");
                            break;
                        case TUESDAY:
                            output.append("Tuesday, ");
                            break;
                        case WENDESDAY:
                            output.append("Wendesday, ");
                            break;
                        case THURSDAY:
                            output.append("Thursday, ");
                            break;
                        case FRIDAY:
                            output.append("Friday, ");
                            break;
                        case SATURDAY:
                            output.append("Saturday, ");
                            break;
                        case SUNDAY:
                            output.append("Sunday, ");
                            break;
                    }
                }
                output.deleteCharAt(output.length() - 2);
                output.append('\n');
            }
            if (flags[3]) output.append("Departure time     : " + airline.getDepartureTime() + '\n');
            if (flags[4]) output.append("Destination        : " + airline.getDestination() + '\n');
            if (flags[5]) {
                output.append("Type of binding    : ");
                switch (airline.getPlaneType()) {
                    case CARGO:
                        output.append("Cargo");
                        break;
                    case MILITARY:
                        output.append("Military");
                        break;
                    case PASSENGER:
                        output.append("Passenger");
                        break;
                }
                output.append('\n');
            }
        }
        System.out.println(output);
    }

    public static void showGoodStudents(Student[] students) {
        for (Student student : students) {
            if (student.isGood()) System.out.println(student.getFname() + " " + student.getGroupNumber());
        }
    }

    public static void sortTrainsByNumber(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            for (int j = (i % 2) + 1; j < trains.length; j += 2) {
                if (trains[j].getNumber() < trains[j - 1].getNumber()) {
                    Train train = trains[j];
                    trains[j] = trains[j - 1];
                    trains[j - 1] = train;

                }
            }
        }
    }

    public static void sortTrainsByDestination(Train[] trains) {
        int resultOfComporation;
        for (int i = 0; i < trains.length; i++) {
            for (int j = (i % 2) + 1; j < trains.length; j += 2) {
                resultOfComporation = trains[j].getDestination().compareTo(trains[j - 1].getDestination());
                if (resultOfComporation < 0 | (resultOfComporation == 0 & (trains[j].getDepartureTime().compareTo(trains[j - 1].getDepartureTime()) < 0))) {
                    Train train = trains[j];
                    trains[j] = trains[j - 1];
                    trains[j - 1] = train;

                }

            }
        }

    }

    public static Train findTrain(Train[] trains, int number) {

        int left = 0;
        int rigth = trains.length - 1;
        while (left <= rigth) {
            int mid = (left + rigth) / 2;
            if (number == trains[mid].getNumber()) return trains[mid];
            if (number < trains[mid].getNumber()) {
                rigth = mid - 1;
            }
            if (number > trains[mid].getNumber()) {
                left = mid + 1;
            }
        }
        return null;

    }


    public static Train[] createFiveTrains() {
        Train[] trains = new Train[]{
                new Train(65, "gomel", new Time(3, 1, 1)),
                new Train(61, "minsk", new Time(2, 4, 0)),
                new Train(70, "gomel", new Time(2, 9, 8)),
                new Train(55, "vitebsk", new Time(12, 6, 8)),
                new Train(90, "mogilev", new Time(6, 1, 10))
        };

        return trains;
    }

    public static void showTrainsList(Train[] trains) {
        for (Train train : trains) {
            System.out.println(train);
        }
    }

}

class Test1 {
    private int a, b;

    public int sum() {
        return a + b;
    }

    public void showAB() {
        System.out.println("a = " + a + " b = " + b);
    }

    public void changeA(int a) {
        this.a = a;
    }

    public void changeB(int b) {
        this.a = b;
    }

    public int largest() {
        return a > b ? a : b;
    }
}

class Test2 {
    private int a, b;

    public Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Test2() {
        a = 0;
        b = 0;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}

class Student {
    private String fname;
    private String initiali;
    private int groupNumber;
    private int[] uspevaemost;

    public Student(String fname, String initiali, int groupNumber, int[] uspevaemost) {
        this.fname = fname;
        this.initiali = initiali;
        this.groupNumber = groupNumber;
        this.uspevaemost = uspevaemost;
    }

    String getFname() {
        return fname;
    }

    int getGroupNumber() {
        return groupNumber;
    }

    boolean isGood() {
        for (int i : uspevaemost) {
            if (i < 9) return false;
        }
        return true;
    }
}

class Train {
    private int number;
    private String destination;

    public Time getDepartureTime() {
        return departureTime;
    }

    private Time departureTime;

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    Train(Train train) {
        number = train.number;
        destination = train.destination;
        departureTime = train.departureTime;
    }

    public Train(int number, String destination, Time departureTime) {
        this.number = number;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Train{" +
                "number=" + number +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime.toString() +
                '}';
    }
}

class Time implements Comparable<Time> {
    private static int SECONDS_IN_HOUR = 3600;
    private static int SECONDS_IN_MINUTE = 60;

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }

    private int hours, minutes, seconds;

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        this.hours = 0;
        if (isLegalHours(hours)) this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = 0;
        if (isLegalMinutes(minutes)) this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = 0;
        if (isLegalSeconds(seconds)) this.seconds = seconds;
    }

    private static boolean isLegal(int hours, int minutes, int seconds) {
        return isLegalHours(hours) &&
                isLegalMinutes(minutes) &&
                isLegalSeconds(seconds);
    }

    private static boolean isLegalHours(int hours) {
        return (hours < 24 & hours > -1);
    }

    private static boolean isLegalMinutes(int minutes) {
        return (minutes < 60 & minutes > -1);
    }

    private static boolean isLegalSeconds(int seconds) {
        return (seconds < 60 & seconds > -1);
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(int hours) {
        this.hours = hours;
    }

    Time(int hours, int minutes, int seconds) {
        if (isLegal(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }
    }

    Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }


    @Override
    public int compareTo(@NotNull Time o) {
        if (hours - o.hours == 0) {
            if (minutes - o.minutes == 0) {
                return seconds - o.seconds;
            }
            return minutes - o.minutes;
        }
        return hours - o.hours;
    }

    public void addSeconds(int seconds) {
        this.seconds += seconds;
        if (!isLegalSeconds(this.seconds)) {
            minutes += (this.seconds / 60);
            if (!isLegalMinutes(minutes)) {
                hours += (minutes / 60);
                if (!isLegalHours(hours)) {
                    hours %= 24;
                }
                minutes %= 60;

            }
            this.seconds %= 60;
        }
    }

    public void addMinutes(int minutes) {
        this.minutes += minutes;
        if (!isLegalMinutes(this.minutes)) {
            hours += (this.minutes / 60);
            if (!isLegalHours(hours)) {
                hours %= 24;
            }
            this.minutes %= 60;
        }
    }

    public void addHours(int hours) {
        this.hours += hours;
        if (!isLegalHours(this.hours)) {
            this.hours %= 24;
        }
    }

    public void addTime(Time time) {
        addSeconds(time.seconds);
        addMinutes(time.minutes);
        addHours(time.hours);
    }

}

class Customer {
    private static int ID = 0;
    private int id, creditCard, bankNumber;
    private String firstName, SecondName, lastName, adress;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", bankNumber=" + bankNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreditCard() {
        return creditCard;
    }

    {
        ID++;
    }

    public Customer(String firstName, String secondName, String lastName) {
        setId(ID);
        this.firstName = firstName;
        SecondName = secondName;
        this.lastName = lastName;
    }

    public Customer(int creditCard, String firstName, String secondName, String lastName) {
        this(firstName, secondName, lastName);
        this.creditCard = creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public int getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(int bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}

class Customers {


    public static Customer[] sortCustumersInAlphabetOrder(Customer[] customers) {
        Arrays.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (o1.getLastName().compareTo(o2.getLastName()) == 0)
                    if (o1.getFirstName().compareTo(o2.getFirstName()) == 0)
                        return o1.getSecondName().compareTo(o2.getSecondName());
                    else return o1.getFirstName().compareTo(o2.getFirstName());
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        return customers;
    }

    public static Customer[] getCustomersWithSpecialCreditCard(Customer[] customers, int start, int end) {
        ArrayList<Customer> arrayList = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getCreditCard() >= start & customer.getCreditCard() <= end) arrayList.add(customer);
        }
        Customer[] result = new Customer[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }

}

class Counter {
    private static final int DEFAULT_LEFT_BORDER = 1, DEFAULT_RIGHT_BORDER = 10;
    private int leftBorder;
    private int rightBorder;
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        if (checkNextLeftValue(value)) this.value = leftBorder;
        if (checkNextRightValue(value)) this.value = rightBorder;
    }

    public Counter() {
        leftBorder = DEFAULT_LEFT_BORDER;
        rightBorder = DEFAULT_RIGHT_BORDER;
        this.value = leftBorder;

    }

    public Counter(int value) {
        this();
        this.value = value;
        if (checkNextRightValue(this.value) & checkNextLeftValue(this.value))
            this.value = leftBorder;
    }

    public Counter(int leftBorder, int rightBorder, int value) {
        this.leftBorder = leftBorder;
        this.rightBorder = rightBorder;
        setValue(value);
    }

    private boolean checkNextRightValue(int value) {
        return value >= rightBorder;
    }

    private boolean checkNextLeftValue(int value) {
        return value <= leftBorder;
    }

    public void dec() {
        if (checkNextLeftValue(value)) value = rightBorder;
        else value--;
    }

    public void inc() {
        if (checkNextRightValue(value)) value = leftBorder;
        else value++;
    }
}

class Triangle {
    private Point a, b, c;
    private double A, B, C;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        A = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
        B = Math.sqrt(Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2));
        C = Math.sqrt(Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getY() - c.getY(), 2));

    }

    public Point getPointIntersectingMedians() {
        double x = (a.getX() + b.getX() + c.getX()) / 3;
        double y = (a.getY() + b.getY() + c.getY()) / 3;
        return new Point(x, y);
    }

    public double getS() {
        double p = (A + B + C) / 2.0;
        return Math.sqrt((p - A) * (p - B) * (p - C) * p);
    }

    public double getP() {
        return A + B + C;
    }

}

class Book {
    private static int ID;
    private Binding binding;
    private String publishingHouse, name, authors[];
    private int id, yearOfPublishing, numberOfPages, price;

    {
        ID++;
    }

    @Override
    public String toString() {
        return "Book{" +
                "binding=" + binding +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", id=" + id +
                ", yearOfPublishing=" + yearOfPublishing +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book(String publishingHouse, String name, String[] authors, int yearOfPublishing) {
        setId(ID);
        this.publishingHouse = publishingHouse;
        this.name = name;
        this.authors = authors;
        this.yearOfPublishing = yearOfPublishing;
    }

    public Binding getBinding() {
        return binding;
    }

    public void setBinding(Binding binding) {
        this.binding = binding;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

enum Binding {
    Hard,
    Soft,
    Integral,
    MetalSpring,
    MetalBracket,
    OnBolts

}

class Books {
    public static Book[] getBooksByAuthor(Book[] books, String author) {
        ArrayList<Book> arrayList = new ArrayList<>();
        for (Book book : books) {
            for (String bookAuthor : book.getAuthors()) {
                if (bookAuthor.equals(author)) arrayList.add(book);
            }
        }
        Book[] result = new Book[arrayList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }

    public static Book[] getBooksAfterYear(Book[] books, int yearOfPublishing) {
        ArrayList<Book> arrayList = new ArrayList<>();
        for (Book book : books) {
            if (book.getYearOfPublishing() > yearOfPublishing)
                arrayList.add(book);
        }
        Book[] result = new Book[arrayList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }

    public static Book[] getBooksByPublishingHouse(Book[] books, String publishingHouse) {
        ArrayList<Book> arrayList = new ArrayList<>();
        for (Book book : books) {
            if (book.getPublishingHouse().equals(publishingHouse))
                arrayList.add(book);
        }
        Book[] result = new Book[arrayList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }


}

class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

enum PlaneType {
    PASSENGER,
    MILITARY,
    CARGO
}

enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WENDESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

}

class Airline {
    private static int ID;

    {
        ID++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id, flightNumber;
    private PlaneType planeType;
    private Time departureTime;
    private DayOfWeek[] days;
    private String destination;

    public Airline(int flightNumber, Time departureTime, DayOfWeek[] days, String destination) {
        setId(ID);
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.days = days;
        this.destination = destination;
    }


    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public DayOfWeek[] getDays() {
        return days;
    }

    public void setDays(DayOfWeek[] days) {
        this.days = days;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}

class Airlines {
    public static Airline[] getAirlinesByDestination(Airline[] airlines, String destination) {
        ArrayList<Airline> arrayList = new ArrayList<>();
        for (Airline airline : airlines) {
            if (airline.getDestination().equals(destination))
                arrayList.add(airline);
        }
        Airline[] result = new Airline[arrayList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }

    public static Airline[] getAirlinesByDayOfWeek(Airline[] airlines, DayOfWeek dayOfWeek) {
        ArrayList<Airline> arrayList = new ArrayList<>();
        for (Airline airline : airlines) {
            for (DayOfWeek day : airline.getDays()) {
                if (day == dayOfWeek)
                    arrayList.add(airline);
            }

        }
        Airline[] result = new Airline[arrayList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = arrayList.get(i);
        }
        return result;

    }

    public static Airline[] getAirlinesByDayOfWeekAndDepartureTime(Airline[] airlines, DayOfWeek dayOfWeek, Time departureTime) {
        Airline[] temp = getAirlinesByDayOfWeek(airlines, dayOfWeek);
        ArrayList<Airline> arrayList = new ArrayList<>();
        for (Airline airline : temp) {
            if (airline.getDepartureTime().compareTo(departureTime) > 0)
                arrayList.add(airline);
        }
        Airline[] result = new Airline[arrayList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }

}