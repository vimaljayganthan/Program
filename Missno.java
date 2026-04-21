import java.util.Scanner;
public class Missno 
{
    public static void mvin(String[] vrgs)
    {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int [] v = new int[b];
        for(int i=0;i<b;i++)
        {
            v[i] = sc.nextInt();
        }
        System.out.print("Missing Numbers: ");
        for(int i=1;i<b;i++)
        {
            boolean c = false;
            for(int j=0;j<b;j++)
            {
                if(v[j]==i)
                {
                    c = true;
                }
            }if(c==false)
            System.out.print(i+" ");
        }
        sc.close();
    }
}
