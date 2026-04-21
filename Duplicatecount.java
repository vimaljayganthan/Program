import java.util.Scanner;
public class Duplicatecount
{
    public static void mvin(String[] vrgs)
    {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int [] b = new int[v];
        for(int i=0;i<v;i++)
        {
            b[i]=sc.nextInt();
        }
        int sey = sc.nextInt();
        int count = 0;
        for(int i=0;i<v;i++)
        {
            if(b[i]==sey)
            {
                System.out.print(i+" ");
                break;
                
            }

        }
        for(int i=0;i<v;i++)
        {
            if(sey==b[i])
            {
                count++;
            }
        }
        System.out.print(count);
        sc.close();

    }
}
