class CPU
{
    double price = 15000.0;
    class Processor
    {
        int cores = 10;
        String manufacturer = "Pentium";
    }
    static class RAM
    {
        double memory = 64;
        String manufacturer = "Intel";
    }
}
public class CPUDetails
{
    public static void main(String[]args)
    {
        CPU c = new CPU();
        CPU.Processor p = c.new Processor();
        CPU.RAM r = new CPU.RAM();
        System.out.println("CPU class");
        System.out.println("----------");
        System.out.println("CPU Price="+c.price);
        System.out.println("\n Processor incs class");
        System.out.println("-------------------------");
        System.out.println("No.of cores="+p.cores);
        System.out.println("Manfacturer="+p.manufacturer);
        System.out.println("\nRAM static nested class");
        System.out.println("--------------------------");
        System.out.println("Memory="+r.manufacturer);
    }
}