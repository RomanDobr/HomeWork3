package lotteryticket;

import java.util.Random;

public final class LotteryTicket {
    public void testYourLuck() {
        int ticketTo10 = 100;
        int ticketTo100 = 5_000;
        int count = 0;
        int sum = 0;
        int i = 1;
        while (count < 100) {
            i++;
            if (i % 10 == 0 && (i < 100)) {
                sum += ticketTo10;
            } else if (i % 100 == 0) {
                sum += ticketTo100;
            } else {
                sum += 0;
            }
            count++;
        }
        System.out.println(sum);
    }

}
