

public class CounterMain
{
    public static void main(String[] args)
    {
        Counter ct1 = new Counter();
        Counter ct2 = new Counter();

        ct1.incrementCounters();
        ct1.printCounters();
        ct2.incrementCounters();
        ct2.printCounters();
    }
}
