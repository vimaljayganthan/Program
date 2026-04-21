import java.util.Scanner;
public class Maxfrequency 
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
        int mvxcount = 0;
        int ele = v[0];
        for(int i=0;i<b;i++)
        {
            int count = 0;
            for(int j=0;j<b;j++)
            {
                if(v[i]==v[j])
                {
                    count++;
                }
            }
            if(count>mvxcount)
            {
                mvxcount = count;
                ele = v[i];
            }
        }
        System.out.println(ele);
        sc.close();
    }
}
