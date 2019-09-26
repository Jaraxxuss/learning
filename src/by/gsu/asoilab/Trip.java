package by.gsu.asoilab;

public class Trip {
    private int numberOfDays;
    private int transportationExpenses;
    private String employeeAccount;
    private final static int DAYLY_ALLOWANCE_RATE = 10000;

    private int getTotal() {
        return transportationExpenses + DAYLY_ALLOWANCE_RATE * numberOfDays;
    }

    public void show() {
        System.out.println("rate = " + parsePrice(DAYLY_ALLOWANCE_RATE));
        System.out.println("account = " + employeeAccount);
        System.out.println("transport = " + parsePrice(transportationExpenses));
        System.out.println("days = " + numberOfDays);
        System.out.println("total = " + parsePrice(getTotal()));
    }

    private static String parsePrice(int value) {
        return value / 100 + "." + (value % 100) / 10 + (value % 100) % 10;
    }

    @Override
    public String toString() {
        return employeeAccount + ";" +
                parsePrice(transportationExpenses) + ";" +
                numberOfDays + ";" +
                parsePrice(getTotal());
    }

    public Trip(int numberOfDays, int transportationExpenses, String employeeAccount) {
        this.numberOfDays = numberOfDays;
        this.transportationExpenses = transportationExpenses;
        this.employeeAccount = employeeAccount;

    }

    public Trip() {

    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getTransportationExpenses() {
        return transportationExpenses;
    }

    public void setTransportationExpenses(int transportationExpenses) {
        this.transportationExpenses = transportationExpenses;
    }

    public String getEmployeeAccount() {
        return employeeAccount;
    }

    public void setEmployeeAccount(String employeeAccount) {
        this.employeeAccount = employeeAccount;
    }
}

