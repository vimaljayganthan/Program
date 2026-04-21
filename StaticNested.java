class Outer
    {
        static int a=5;
        static class Inner{
            void m1()
            {
                System.out.println("Hi");
            }
        }
    }
    public class StaticNested{
        public static void main(String[] args)
        {
            Outer.Inner i = new Outer.Inner();
            i.m1();
        }
    }


