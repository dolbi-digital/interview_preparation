public class LuckyTicket {
    public static void main (String[] args) {
        String ticket = "538961";
        System.out.println(ticket + " is lucky: " + isLucky(ticket));
        int ticketNumber = 538961;
        System.out.println(ticketNumber + " is lucky: " + isMyTicketLucky(ticketNumber));
    }

    static boolean isLucky(String input) {
        return input.charAt(0) + input.charAt(1) + input.charAt(2)
                == input.charAt(3) +input.charAt(4) + input.charAt(5);
    }

    private static boolean isMyTicketLucky(int ticketNumber) {
        int number1 = ticketNumber / 100000;
        int number2 = (ticketNumber / 10000) % 10;
        int number3 = (ticketNumber / 1000) % 10;
        int number4 = (ticketNumber / 100) % 10;
        int number5 = (ticketNumber / 10) % 10;
        int number6 = ticketNumber % 10;
        return number1 + number2 + number3 == number4 + number5 + number6;
    }
}

/*
* // Индусский быдлокод
int a, n, s = 0;
for(int i = 0; i < 1000000; i++)
{
    n = i;
    a = n-n/10*10; n /= 10;
    a += n-n/10*10; n /= 10;
    a += n-n/10*10; n /= 10;
    a -= n-n/10*10; n /= 10;
    a -= n-n/10*10; n /= 10;
    a -= n-n/10*10;
    if (a == 0) s++;
}

// Китайский быдлокод
int s=0;
for(int a = 0; a < 10; a++)
  for(int b = 0; b < 10; b++)
    for(int c = 0; c < 10; c++)
      for(int d = 0; d < 10; d++)
        for(int e = 0; e < 10; e++)
          for(int f = 0; f < 10; f++)
            if (a+b+c == d+e+f) s++;

// Небыдлокод
int [] s = new int [28];
int a, b, c, sum = 0;
for (a = 0; a < 10; a++)
  for(b = 0; b < 10; b++)
    for(c = 0; c < 10; c++) s[a+b+c]++;
for (a = 0; a < 28; a++) sum += s[a]*s[a];
* */
