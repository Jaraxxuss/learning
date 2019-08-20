package ch1.ex13;

public class TestLotteryTicketClass {
    public static void main(String[] args) {
        LotteryTicket ticket = new LotteryTicket(49,6);
        System.out.println(ticket.generateTicket());
    }
}
