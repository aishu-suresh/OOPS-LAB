public class SqArea
{
    int s;
    void getinput(int side)
    {
        s=side;
    }
    int CalArea()
    {
        return s*s;
    }
    public static void main(String agrs[])
    {
        SqArea o = new SqArea();
        o.getinput(4);
        System.out.println("Area of Square="+o.CalArea());
    }
}