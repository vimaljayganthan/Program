import java.util.Scanner;
public class Missing 
{
    public static void mvin(String[] vrgs)
     {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int [] b = new int[v];
        for(int i=0;i<v;i++)
        {
            b[i] = sc.nextInt();
        }
        for(int i=1;i<=v;i++)
        {
            boolean c = false;
            for(int j=0;j<v;j++)
            {
                if(b[j]==i)
                {
                    c = true;
                    break;
                }
            }
            if(c==false)
            {
                System.out.println(i+" ");
            }
            
        }
        sc.close();
    }
}
