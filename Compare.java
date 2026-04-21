import java.util.Scanner;
public class Compare
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
        int count = 0;
        for(int i=0;i<v-1;i++)
        {
            if(b[i+1]>b[i])
            {
                count++;
            }
        }
        System.out.println(count+" ");
        sc.close();
    }
}
