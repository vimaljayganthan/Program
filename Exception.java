import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int [] b = new int[5];
            for(int i=0;i<5;i++)
            {
                b[i]=sc.nextInt();
            }
            System.out.println(b[6]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divsion error");
        }
        catch(InputMismatchException d)
        {
            System.out.println("Input Mismatch Error");
        }
        catch(ArrayIndexOutOfBoundsException f)
        {
            System.out.println("Array Index Out Of Bounds Error");
        }
        finally
        {
            System.out.println("End of Programm");
        }
    }
}