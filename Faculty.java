import java.util.Scanner;
public class Faculty
{
    int Facultyage;
    String name;
    void getData()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n Enter Faculty Name:");
        name = scan.nextLine();
        System.out.println("\n\n Enter Faculty age:");
        Facultyage = scan.nextInt(); 
    }
    void display()
    {
        System.out.println("Faculty Name:"+name);
        System.out.println("Faculty age:"+Facultyage);
    }
    public static void main(String args[])
    {
        Faculty f = new Faculty();
        f.getData();
        System.out.println("\n\n Faculty Details");
        System.out.println("\n\n---------------\n");
        f.display();

    }
}