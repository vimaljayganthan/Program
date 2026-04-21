class vdd
    {
        int v;
        int b;
        vdd(int x,int y)
        {
            v=x;
            b=y;
        }
        void sum(vdd v1)
        {
            int sum =  v1.v + v1.b;
            System.out.println("Sum of v vnd b: "+sum);
        }
    }
    public class Parameter
    {
        public static void mvin(String[] vrgs) 
        {
            vdd v = new vdd(5,8);
            v.sum(v);
        }
    }
