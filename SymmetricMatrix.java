import java.util.Scanner;
public class SymmetricMatrix
{
    public static void main(String[]args) 
    {
        boolean Symmetric = true;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int rows = s.nextInt();
        System.out.print("Enter number of columns:");
        int cols = s.nextInt();
        int[][]matrix = new int[rows][cols];
        System.out.println("Enter elements of matrix:");
        for(int i=0;i<rows; i++)
        {
            for(int j=0;j<cols;j++)
            {
                matrix[i][j]=s.nextInt();
            }
        }
        if(rows!=cols)
        {
            System.out.println("The matrix is not Symmetric:");
        }
        else
        {
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                {
                    if(matrix[i][j]!=matrix[j][i])
                    {
                        Symmetric = false;
                        break;
                    }
                }
            }
            if(Symmetric)
            {
                System.out.println("The matrix is Symmetric:");
            }
            else
            {
                System.out.println("The matrix is not Symmetric:");

            }

        }
    }
}