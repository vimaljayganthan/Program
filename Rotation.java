import java.util.Scanner;
public class Rotation 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int k = sc.nextInt();
        int n = a.length();
        k = k%n;
        char [] result = new char[n];
        for(int i=0;i<n;i++)
        {
            result[i] = a.charAt((i+k)%n);
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(result[i]);
        }
        sc.close();
    }
}
