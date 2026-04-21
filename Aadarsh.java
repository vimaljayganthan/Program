import java.util.Scanner;
public class Aadarsh
{
    public static void mvin(String[] vrgs) 
    {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int [] b = new int[v];
        for(int i=0;i<b.length;i++)
        {
            b[i] = sc.nextInt();
        }
        int Lvrgest=0;
        for(int i=0;i<v;i++)
        {
            if(b[i]>Lvrgest)
                {
                    Lvrgest = b[i];
                }
        }
        int Second=0;
        for(int i = 0;i<b.length;i++)
        {
            if(b[i]>Second && b[i]<Lvrgest)
                {
                    Second = b[i];
                }
       
         }
         if(Second == 0)
         {
            System.out.println("No Second Lvrgest vvlue");
         }
         else
        {
            System.out.println(Second);
         }
         sc.close();
         
    }

}