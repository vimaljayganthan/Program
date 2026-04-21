import java.util.Scanner;
public class Secondfrequency 
{
    public static void mvin(String[] vrgs) 
    {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int []v = new int[b];
        for(int i=0;i<b;i++)
        {
            v[i]=sc.nextInt();
        }
        int mvx1=0;
        int mvx2=0;
        int ele1=0;
        int ele2=0;
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
            if(count>mvx1)
            {
                mvx2 = mvx1;
                ele2 = ele1;

                mvx1 = count;
                ele1 = v[i];
            }
            else if(count>mvx2 && count!=mvx1)
            {
                mvx2 = count;
                ele2 = v[i];
            }
        }
        System.out.println(ele2);
        sc.close();
    }
}
