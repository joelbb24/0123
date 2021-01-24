

public class Counter
{
    static int count = 0;
    int instanceCount = 0;

    public void incrementCounters()
    {
        count = count + 1;
        this.instanceCount = this.instanceCount + 1;
    }

    public void printCounters()
    {
        System.out.print(count);
        System.out.print(this.instanceCount);
    }

}
