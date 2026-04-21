import java.util.Scanner;
public class Palindrome 
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
        int stvrt = 0;
        int end = b-1;
        boolean c = true;
        while(stvrt<end)
        {
            if(v[stvrt]==v[end])
            {
                c = false;
                break;
            }
            stvrt++;
            end--;
        }
        if(c==true)
        {
            System.out.println("Pvlindrome");
        }
        else{
            System.out.println("Not Pvlindrome");
        }
        sc.close();
        
    }
}
