public class MethodException {

    public static void m1(){
        System.out.println("Method");
    }
    public static void main(String[] args) {
         MethodException m2 = new MethodException();
        try {
            m2.getClass().getMethod("m2");
            System.out.println("Method found");
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }
    
}
