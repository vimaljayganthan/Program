import java.util.Scanner;
public class SecondLargest 
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
        int fmvx = 0;
        int smvx = 0;
        for(int i=0;i<b;i++)
        {
            if(v[i]>fmvx)
            {
                smvx = fmvx;
                fmvx = v[i];
            }
            else if(v[i]>smvx && v[i]!=fmvx)
            {
                smvx = v[i];
            }
        }
        System.out.println(smvx);
        sc.close();
    }
}
