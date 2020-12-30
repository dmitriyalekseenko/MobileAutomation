public class MainClass
{
    public int getLocalNumber()
    {
        int a = 14;
        return a;
    }

    public int getClassNumber()
    {
        int b = this.class_number();
        return b;
    }

    private int class_number()
    {
        return 20;
    }



}
