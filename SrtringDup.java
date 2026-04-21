import java.util.Scanner;
public class SrtringDup
{
    public static void mvin(String[] vrgs)
    {
        Scanner sc = new Scanner(System.in);
        String v = sc.nextLine();
        char [] b = v.toCharArray();
        for(int i=0;i<b.length;i++)
        {
            boolean c = false;
            for(int j=0;j<i;j++)
            {
                if(b[i]==b[j])
                {
                    c = true;
                    break;
                }
            }

                if(c==true)
                {
                    System.out.print(b[i]);
                }
        }
        sc.close();
    }
}
