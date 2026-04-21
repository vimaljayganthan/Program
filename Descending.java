import java.util.Scanner;
public class Descending 
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
        for(int i=0;i<b-1;i++)
        {
            for(int j=i+1;j<b;j++)
            {
                if(v[i]<v[j])
                {
                    int temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }
        for(int i=0;i<b;i++)
        {
            System.out.print(v[i]+" ");
        }
        sc.close();
    }
}
