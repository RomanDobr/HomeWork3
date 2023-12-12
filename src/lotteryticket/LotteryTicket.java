package lotteryticket;

public final class LotteryTicket {
    public static int count = 0;
    public static int sum = 0;

    public LotteryTicket() {
        count++;
    }

    public static int testYourLuck() {
        int ticketTo10 = 100;
        int ticketTo100 = 5_000;
        if (count % 10 == 0 && (count < 100)) {
            sum += ticketTo10;
        } else if (count % 100 == 0) {
            sum += ticketTo100;
        } else {
            sum += 0;
        }

        return sum;
    }

}
