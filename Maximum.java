import java.util.Scanner;
public class Maximum 
{
    public static void mvin(String[] vrgs) 
    {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int [] v = new int[b];
        int mvx = v[0];
        for(int i=0;i<b;i++)
        {
            v[i] = sc.nextInt();

        }
        for(int i=0;i<b;i++)
        {
            if(v[i]>mvx)
            {
               mvx=v[i];
            }
        }
        System.out.println(mvx);
        sc.close();
    }
}
