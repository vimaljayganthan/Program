import java.util.Scanner;
public class Reverse
{
    public static void mvin(String[] vrgs)
    {
        Scanner sc = new Scanner(System.in);
        String v = sc.nextLine();
        String [] b = v.split(" ");
        for(int i=0;i<b.length;i++)
        {
        String c = b[i];
        char [] ch = c.toCharArray();
        String d = "";
        for(int s=ch.length-1;s>=0;s--)
        {
            d+=ch[s];
        }
        System.out.print((d)+" ");
        }
        sc.close();

    }
}