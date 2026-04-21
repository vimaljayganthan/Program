import java.util.Scanner;
public class Ascending 
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
        for(int i=0;i<v-1;i++)
        {
            for(int j=i+1;j<v;j++)
            {
                if(b[i]<b[j])
                {
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        for(int i=0;i<v;i++)
        {
            System.out.print(b[i]+" ");
        }
        sc.close();

    }
}
