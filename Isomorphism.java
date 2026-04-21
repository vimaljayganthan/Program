import java.util.Scanner;
public class Isomorphism 
{
    String ch1;
    String ch2;
    Isomorphism(String ch1,String ch2)
    {
        this.ch1 = ch1;
        this.ch2 = ch2;
    }
    String isomorphic()
    {
        if(ch1.length()!=ch2.length())
        {
            return "No";
        }
        int [] map1 = new int[256];
        int [] map2 = new int[256];
        for(int i=0;i<ch1.length();i++)
        {
            char ch3 = ch1.charAt(i);
            char ch4 = ch2.charAt(i);

            if(map1[ch3] == 0 && map2[ch4] == 0)
            {
                map1[ch3] = ch4;
                map2[ch4] = ch3;
            }
            else if(map1[ch3]!=ch4 || map2[ch4]!=ch3)
            {
                return "No";
            }
        }
        return "Yes";
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        Isomorphism obj = new Isomorphism(a,b)
        System.out.println(obj.isomorphic());
        sc.close();
    }
}


