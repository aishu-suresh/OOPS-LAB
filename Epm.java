import java.util.Scanner;
public class Epm
{
    int empno;
    String name;
    void getData()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n Enter Employee Name:");
        name = scan.nextLine();
        System.out.println("\n\n Emp No:");
        empno = scan.nextInt();
    }
    void display()
    {
        System.out.println("Employee Name:"+name);
        System.out.println("Employee No:"+empno);
    }
    public static void main(String args[])
    {
        Epm e =new Epm();
        e.getData();
        System.out.println("\n\n Employee Details\n");
        System.out.println("\n\n------------------\n");
        e.display();
    }
}