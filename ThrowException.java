import java.util.Scanner;
public class ThrowException {
    static void assignment(int cpa){
        if(cpa<5)
        {
            throw new IllegalAccessError();
        }
        else{
            System.out.println("Assignment Mark Granted");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        try{
            assignment(a);
        }
        catch(IllegalAccessError e){
            System.out.println(e.getMessage());
        }
    }
    
}

